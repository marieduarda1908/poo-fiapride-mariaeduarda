package model;

public class IPhone extends Smartphone {

    public IPhone(String modelo) {
        super(modelo);
    }

    @Override
    public String tipoConector() {

        return "Lightning";
    }
}