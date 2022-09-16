package Clases.Vehiculos;

import Clases.Combustible;

public class Camioneta extends Vehiculo {
   
    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }


    public double calcularCostoCombustible(){
        return 100;
    };
    
}
