package Clases;

import Clases.Vehiculos.Vehiculo;

public class Viaje {
    public String ciudadOrigen;
    public String ciudadDestino;
    public int distancia;
    public Vehiculo vehiculo;
    public int cantPeajes;
    public boolean estanSobreMismaRuta;

    public Viaje(String ciudadOrigen, String ciudadDestino, int distancia, Vehiculo vehiculo, int cantPeajes, boolean estanSobreMismaRuta) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        this.estanSobreMismaRuta = estanSobreMismaRuta;
    }

    public Viaje() {
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantPeajes() {
        return cantPeajes;
    }

    public void setCantPeajes(int cantPeajes) {
        this.cantPeajes = cantPeajes;
    }

    public boolean isEstanSobreMismaRuta() {
        return estanSobreMismaRuta;
    }

    public void setEstanSobreMismaRuta(boolean estanSobreMismaRuta) {
        this.estanSobreMismaRuta = estanSobreMismaRuta;
    }

   @Override
    public String toString() {
        return "El Viaje{" + "ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", cantPeajes=" + cantPeajes + ", estanSobreMismaRuta=" + estanSobreMismaRuta + '}';
    }
    
    public double calcularDistancia(){
        return 0;
    } 
     public double calcularCostoPeaje(){
        return 0;
    } 
    
     public Combustible calcularCostoCombustible(){
        return ;
        
    } 
      public double calcularCostoTotal(){
        return 0;
    } 
 }

