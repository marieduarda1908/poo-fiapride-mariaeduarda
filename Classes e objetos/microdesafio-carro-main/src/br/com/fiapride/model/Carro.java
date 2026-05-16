package br.com.fiapride.model;

public class Carro {

    // 🔹 Características (Como ele é)
    public String cor;
    public int ano;
    public int modelo;
    public int velocidadeAtual;
    public boolean freioDeMaoPuxado;

    // 🔹 Ações (O que ele faz)

    public void ligar() {
        System.out.println("O carro ligou.");
    }

    public void acelerar() {
        if (freioDeMaoPuxado) {
            System.out.println("Não pode acelerar com freio de mão puxado!");
        } else {
            velocidadeAtual += 10;
            System.out.println("Acelerando... Velocidade: " + velocidadeAtual);
        }
    }

    public void frear() {
        velocidadeAtual -= 10;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }

        System.out.println("Freando... Velocidade: " + velocidadeAtual);
    }

    public void soltarFreioDeMao() {
        freioDeMaoPuxado = false;
        System.out.println("Freio de mão solto.");
    }

    public void puxarFreioDeMao() {
        freioDeMaoPuxado = true;
        System.out.println("Freio de mão puxado.");
    }
}