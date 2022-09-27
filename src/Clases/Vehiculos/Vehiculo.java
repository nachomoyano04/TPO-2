package Clases.Vehiculos;

import Clases.Combustible;

public abstract class Vehiculo {

    protected String marca, patente;
    protected Combustible combustible = new Combustible();

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return  "Marca: " + marca + ", patente: " + patente + ", combustible: " + combustible;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public abstract double calcularCostoCombustible();
}
