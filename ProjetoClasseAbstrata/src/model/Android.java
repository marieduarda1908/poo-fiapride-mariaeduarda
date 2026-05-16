package model;

public class Android extends Smartphone {

    public Android(String modelo) {
        super(modelo);
    }

    @Override
    public String tipoConector() {

        return "USB-C";
    }
}