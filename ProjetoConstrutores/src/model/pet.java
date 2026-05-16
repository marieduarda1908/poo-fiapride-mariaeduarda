package model;

public class pet {

    private String nome;
    private String especie;
    private int idade;

    // construtor
    public pet(String nome, String especie, int idade) {

        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void mostrarDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
    }
}