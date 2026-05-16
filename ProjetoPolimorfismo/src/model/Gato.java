package model;

public class Gato extends Pet {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Miauu!";
    }
}