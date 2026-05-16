package main;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();

        pets.add(new Cachorro("Rex"));
        pets.add(new Gato("Mimi"));

        System.out.println("=== Sons dos Pets ===");

        for (Pet pet : pets) {

            System.out.println("Pet: " + pet.getNome());
            System.out.println(pet.emitirSom());
            System.out.println("------------------");
        }
    }
}