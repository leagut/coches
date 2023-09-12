package com.project.coches.persistance.repository;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.repository.IBrandCarRepository;
import com.project.coches.persistance.crud.IBrandCarCrudRepository;
import com.project.coches.persistance.entity.BrandCarEntity;
import com.project.coches.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class    BrandCarRepository implements IBrandCarRepository {

    private final IBrandCarCrudRepository iBrandCarCrudRepository;
    private final IBrandCarMapper iBrandCarMapper;

/*
        Se puede usar esto  pero como existe @RequiredArgsConstructor no se coloca.
        public BrandCarRepository(IBrandCarRepository iBrandCarRepository, IBrandCarMapper iBrandCarMapper) {
        this.iBrandCarRepository = iBrandCarRepository;
        this.iBrandCarMapper = iBrandCarMapper;}
*/

    @Override
    public List<BrandCarDto> getAll() {
        return iBrandCarMapper.toMarcasCocheDto(iBrandCarCrudRepository.findAll()) ;
    }

    @Override
    public Optional<BrandCarDto> getBrandCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
                .map(brandCarEntity -> iBrandCarMapper.toMarcaCocheDto(brandCarEntity));
    }

    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toMarcaCocheEntity(newBrandCar);
        return iBrandCarMapper.toMarcaCocheDto(iBrandCarCrudRepository.save(brandCarEntity));
    }

    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
