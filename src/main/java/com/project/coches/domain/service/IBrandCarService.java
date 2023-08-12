package com.project.coches.domain.service;

import com.project.coches.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IBrandCarService {
    List<BrandCarDto> getAll();
    Optional<BrandCarDto> getBrandCar(Integer id);
    BrandCarDto save(BrandCarDto newBrandCar);
    boolean delete(Integer idBrandCar);
    BrandCarDto update(BrandCarDto newBrandCar);
}
