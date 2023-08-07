package com.project.coches.controller;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.domain.service.IBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-coches")
public class BrandCarController {

    private final IBrandCarService iBrandCarService;

    @GetMapping()
    public ResponseEntity<List<BrandCarPojo>> getAll(){
        return ResponseEntity.ok(iBrandCarService.getAll());

        //return ResponseEntity.status(HttpStatus.OK)  ALTERNATIVA B
        //        .body(iBrandCarService.getAll());

        // return new ResponseEntity<>(iBrandCarService.getAll(),HttpStatus.OK);   ALTERNATIVA C

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar( @PathVariable Integer id){
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }

    public ResponseEntity<BrandCarPojo>save(@RequestBody BrandCarPojo brandCarPojoNew ){
        return ResponseEntity.status(HttpStatus.CREATED)
               .body(iBrandCarService.save(brandCarPojoNew));
    }


}
