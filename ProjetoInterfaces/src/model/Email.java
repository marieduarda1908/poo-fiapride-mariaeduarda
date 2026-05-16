package model;

import interfaces.Notificavel;

public class Email implements Notificavel {

    @Override
    public String enviarNotificacao() {

        return "Email enviado com sucesso!";
    }
}