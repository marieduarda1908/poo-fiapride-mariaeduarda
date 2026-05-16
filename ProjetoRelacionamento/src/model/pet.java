package model;

public class pet {

    private String nome;

    // associação TEM-UM
    private Tutor tutor;

    public pet(String nome, Tutor tutor) {

        this.nome = nome;
        this.tutor = tutor;
    }

    public void mostrarDados() {

        System.out.println("Pet: " + nome);
        System.out.println("Tutor: " + tutor.getNome());
    }
}