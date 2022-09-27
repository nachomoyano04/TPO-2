package Clases.Vehiculos;

import Clases.Combustible;

public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Camioneta() {
    }

    @Override
    public double calcularCostoCombustible() {
        // 10lts por cada 100km
        double costoDeCombustible;
        costoDeCombustible = combustible.getPrecio() * 10 / 100;
        return costoDeCombustible;
    }
;

}
