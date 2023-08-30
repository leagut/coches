package com.project.coches.exeption;

public class PurchaseNotExistException extends RuntimeException {

    public PurchaseNotExistException() {
        super("La factura no existe.");
    }
}
