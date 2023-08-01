package com.project.coches.domain.pojo;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarcaCochePojo {
    private Integer id;

    private String description;
}
