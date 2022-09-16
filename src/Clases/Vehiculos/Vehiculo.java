package Clases.Vehiculos;

import Clases.Combustible;

public abstract class Vehiculo {
    
    protected String marca,patente;
    protected Combustible combustible;
    
    public double calcularCostoCombustible(){
        return 0;
    };
    
}
