package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de marcochoche a pojos a entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    /**
     * Si el nombre de las dos avariables es igual se pueden eliminar, al ser redudantes
     * convierte una entidad a una pojo de marca coche
     * @param marcaCocheEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaCocheEntity);

    /**
     * convierte una pojo a una entidad de marca coche
     * @param marcaCochePojo Pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);

    /**
     * Retorna una lista marca choches transformada a pojo de una lista de entidades
     * @param marcasCocheEntity Entidad o transformar
     * @return Lista trnsformada
     */
    List<MarcaCochePojo> toMarcasCochePojo (List<MarcaCocheEntity> marcasCocheEntity);


}
