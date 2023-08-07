package com.project.coches.domain.service;

import com.project.coches.domain.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarService {
    List<BrandCarPojo> getAll();
    Optional<BrandCarPojo> getBrandCar(Integer id);
    BrandCarPojo save(BrandCarPojo newBrandCar);
    boolean delete(Integer idBrandCar);
}
