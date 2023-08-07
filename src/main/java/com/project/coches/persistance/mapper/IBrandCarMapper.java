package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IBrandCarMapper {
    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity
     * @return pojo convertido
     */
    @Mapping(source = "id" , target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarPojo toMarcaCochePojo(BrandCarEntity marcaEntity);

    /**
     * convierte un pojo a una entidad de marca coche
     * @param marcaPojo
     * @return entity
     */
    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity(BrandCarPojo marcaPojo);

    //retorna una lista transformada de marca de carros entities a pojo
    List<BrandCarPojo>toMarcasCochePojo(List<BrandCarEntity> brandCarEntity);

}
