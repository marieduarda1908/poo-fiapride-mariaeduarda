package main;

import interfaces.Notificavel;
import model.Email;
import model.SMS;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Notificavel[] notificacoes = new Notificavel[2];

        notificacoes[0] = new Email();
        notificacoes[1] = new SMS();

        for (Notificavel notificacao : notificacoes) {

            System.out.println(notificacao.enviarNotificacao());
        }
    }
}