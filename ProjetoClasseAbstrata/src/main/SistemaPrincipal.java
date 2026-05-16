package main;

import model.Android;
import model.IPhone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Isso daria erro:
        // Smartphone celular = new Smartphone("Genérico");

        Android android = new Android("Samsung S25");
        IPhone Iphone = new IPhone("IPhone 17");

        System.out.println(android.getModelo());
        System.out.println(android.tipoConector());

        System.out.println("----------------");

        System.out.println(Iphone.getModelo());
        System.out.println(Iphone.tipoConector());
    }
}