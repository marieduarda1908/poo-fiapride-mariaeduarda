package main;

import model.Smartphone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Smartphone celular = new Smartphone();

        celular.setMarca("Samsung");

        // valor válido
        celular.setArmazenamento(256);

        System.out.println(celular.getMarca());
        System.out.println(celular.getArmazenamento() + " GB");

        System.out.println("----------------");

        // tentando burlar o sistema
        celular.setArmazenamento(-50);
    }
}