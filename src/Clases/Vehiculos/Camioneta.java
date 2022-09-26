package Clases.Vehiculos;

import Clases.Combustible;

public class Camioneta extends Vehiculo {
    double consumo;
   
    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Camioneta() {
    }

    
    public double calcularCostoCombustible(){
        // 10lts por cada 100km
         double costoDeCombustible;
        costoDeCombustible=combustible.getPrecio()*10/100;
        return costoDeCombustible;
    };
    
}
