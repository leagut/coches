package com.project.coches.domain.dto;

import lombok.Getter;
import lombok.Setter;

/*
dto del guardado de una compra
*/

@Getter
@Setter
public class CarPurchaseRequestDto {
    private Integer purchaseNumberBill;
    private Integer codeCar;
    private Integer quantity;
    private Integer total;
}