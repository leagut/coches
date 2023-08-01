package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImarcaCocheMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity
     * @return pojo convertido
     */
    @Mapping(source = "id" , target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

    /**
     * convierte un pojo a una entidad de marca coche
     * @param marcaPojo
     * @return entity
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    //retorna una lista transformada de marca de carros entities a pojo
    List<MarcaCochePojo>toMarcasCochePojo(List<MarcaCocheEntity>marcaCocheEntity);

}
