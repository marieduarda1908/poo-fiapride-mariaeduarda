package model;

import interfaces.Notificavel;

public class SMS implements Notificavel {

    @Override
    public String enviarNotificacao() {

        return "SMS enviado com sucesso!";
    }
}