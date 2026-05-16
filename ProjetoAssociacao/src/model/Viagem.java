package model;

public class Viagem {

    // Associação TEM-UM
    private Passageiro passageiro;

    private String destino;

    public Viagem(Passageiro passageiro, String destino) {

        this.passageiro = passageiro;
        this.destino = destino;
    }

    public void mostrarResumo() {

        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Destino: " + destino);
    }
}