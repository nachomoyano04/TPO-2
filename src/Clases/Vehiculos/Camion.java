package Clases.Vehiculos;

import Clases.Combustible;

public class Camion extends Vehiculo {

    @Override
    public double calcularCostoCombustible() {
        double costoDeCombustible;
        costoDeCombustible = combustible.getPrecio() * 12 / 100;
        return costoDeCombustible;
    }

    ;
//y 12 Lts cada 100 Km para los camiones.

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Camion() {
    }
}
