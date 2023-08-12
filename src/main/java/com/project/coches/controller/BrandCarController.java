package com.project.coches.controller;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.service.IBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
    @RequestMapping(path = "/brand-car")
public class BrandCarController {
    private final IBrandCarService iBrandCarService;
    @GetMapping()
    public ResponseEntity<List<BrandCarDto>> getAll(){
        return ResponseEntity.ok(iBrandCarService.getAll());
        //return ResponseEntity.status(HttpStatus.OK)  ALTERNATIVA B
        //        .body(iBrandCarService.getAll());
        // return new ResponseEntity<>(iBrandCarService.getAll(),HttpStatus.OK);   ALTERNATIVA C
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarDto> getBrandCar(@PathVariable Integer id){
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }
    @PostMapping()
    public ResponseEntity<BrandCarDto>save(@RequestBody BrandCarDto brandCarDtoNew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarService.save(brandCarDtoNew));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PatchMapping()
    public ResponseEntity<BrandCarDto> update(@RequestBody BrandCarDto brandCarDtoUpdate){
        BrandCarDto brandCarDto = iBrandCarService.update(brandCarDtoUpdate);

        if(brandCarDto == null){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(brandCarDto);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean>delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iBrandCarService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
