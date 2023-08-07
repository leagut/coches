package com.project.coches.domain.repository;

import com.project.coches.domain.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarRepository {
    List<BrandCarPojo>getAll();
    Optional<BrandCarPojo>getBrandCar(Integer id);
    BrandCarPojo save(BrandCarPojo newBrandCar);
    void delete(Integer idBrandCar);
}
