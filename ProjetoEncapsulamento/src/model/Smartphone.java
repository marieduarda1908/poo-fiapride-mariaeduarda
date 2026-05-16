package model;

public class Smartphone {

    // atributos privados
    private String marca;
    private int armazenamento;

    // getter
    public String getMarca() {
        return marca;
    }

    // setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // getter
    public int getArmazenamento() {
        return armazenamento;
    }

    // setter com validação
    public void setArmazenamento(int armazenamento) {

        if (armazenamento >= 0) {

            this.armazenamento = armazenamento;

        } else {

            System.out.println("Erro: armazenamento não pode ser negativo!");
        }
    }
}