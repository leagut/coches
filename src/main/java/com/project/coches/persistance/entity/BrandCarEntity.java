package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="marca_coche")
public class BrandCarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion")
    private String description;

    // @OneToMany(mappedBy = "brandCarEntity", orphanRemoval = true)
    @OneToMany(mappedBy = "brandCarEntity")
    private List<CarEntity> carEntities;

    @Override
    public String toString() {
        return "BrandCarEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

}
