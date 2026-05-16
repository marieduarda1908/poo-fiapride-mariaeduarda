package model;

public class Cachorro extends Pet {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Au Au!";
    }
}