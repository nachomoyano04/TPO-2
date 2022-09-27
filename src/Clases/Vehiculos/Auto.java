package Clases.Vehiculos;

import Clases.Combustible;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Auto() {
    }

    @Override
    public double calcularCostoCombustible() {
        double costoDeCombustible;
        costoDeCombustible = combustible.getPrecio() * 7 / 100;
        return costoDeCombustible;

// el consumo de combustible es de 7 Lts cada 100 Km para los autos
    }
;

}
