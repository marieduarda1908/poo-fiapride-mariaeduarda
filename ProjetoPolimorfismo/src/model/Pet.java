package model;

public class Pet {

    private String nome;

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String emitirSom() {
        return "O pet fez um som.";
    }
}