package main;

import model.pet;
import model.Tutor;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Tutor tutor1 = new Tutor("Duda");

        pet pet1 = new pet("Rex", tutor1);

        pet1.mostrarDados();
    }
}