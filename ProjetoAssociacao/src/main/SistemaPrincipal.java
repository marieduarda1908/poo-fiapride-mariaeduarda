package main;

import model.Passageiro;
import model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("Duda");

        Viagem viagem1 = new Viagem(passageiro1, "São Paulo");

        viagem1.mostrarResumo();
    }
}