package model;

public abstract class Smartphone {

    private String modelo;

    public Smartphone(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // Método abstrato
    public abstract String tipoConector();
}