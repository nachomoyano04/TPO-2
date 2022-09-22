package Clases.Vehiculos;

import Clases.Combustible;

public abstract class Vehiculo {
    
    protected String marca,patente;
    protected Combustible combustible;
         
    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public Vehiculo() {
    }
        
    public double calcularCostoCombustible(){
        return 0;
    };
    
}
