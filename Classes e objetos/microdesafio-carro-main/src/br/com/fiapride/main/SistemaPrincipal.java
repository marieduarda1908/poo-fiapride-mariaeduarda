package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // 🚗 Carro 1
        Carro meuCarro = new Carro();
        meuCarro.cor = "Preto";
        meuCarro.ano = 2022;
        meuCarro.modelo = 2023;
        meuCarro.velocidadeAtual = 0;
        meuCarro.freioDeMaoPuxado = true;

        // 🚗 Carro 2
        Carro carroProfessor = new Carro();
        carroProfessor.cor = "Vermelho";
        carroProfessor.ano = 2020;
        carroProfessor.modelo = 2021;
        carroProfessor.velocidadeAtual = 0;
        carroProfessor.freioDeMaoPuxado = false;

        // 📺 Informações
        System.out.println("Meu carro é: " + meuCarro.cor);
        System.out.println("Carro do professor é: " + carroProfessor.cor);

        System.out.println("\n--- Testando ações ---");

        // 🔧 Ações do carro
        meuCarro.ligar();
        meuCarro.acelerar();          // não acelera (freio puxado)
        meuCarro.soltarFreioDeMao();
        meuCarro.acelerar();          // agora acelera
        meuCarro.frear();
    }
}