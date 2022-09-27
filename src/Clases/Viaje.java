package Clases;

import Clases.Vehiculos.Camion;
import Clases.Vehiculos.Vehiculo;
import static tpo.TPO2.leer;

public final class Viaje {

    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private int distancia;
    private Vehiculo vehiculo;
    private int cantPeajes;
    private boolean estanSobreMismaRuta;
    private Combustible combustible; //Si bien el atributo combustible no es utilizado en la clase Viaje lo dejamos porque lo pide la consigna.

    public Viaje(Ciudad ciudadOrigen, Ciudad ciudadDestino, Vehiculo vehiculo, Combustible combustible, int cantPeajes) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        estanSobreMismaRuta = ciudadOrigen.getSobreRuta().equalsIgnoreCase(ciudadDestino.getSobreRuta());
        this.combustible = combustible;
        distancia = (int) calcularDistancia();
    }

    public Viaje() {
    }
// getters & setters

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
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
// fin getters & setters

    @Override
    public String toString() {
        return "El Viaje: " + "ciudadOrigen: " + ciudadOrigen + ", ciudadDestino: " + ciudadDestino + ", distancia: " + distancia + "km.\nVehiculo: " + vehiculo + " cantPeajes: " + cantPeajes + ", estanSobreMismaRuta: " + estanSobreMismaRuta + '.';
    }

    public double calcularDistancia() {
        if (estanSobreMismaRuta) {
            return Math.abs(ciudadOrigen.ubicacionEnKm - ciudadDestino.ubicacionEnKm);
        } else {
            System.out.println("Las ciudades no se encuentran sobre la misma ruta, por favor ingrese la distancia a cubrir en el viaje");
        }
        double dist = leer.nextDouble();
        return dist;
    }

    public int calcularCostoPeaje() {
        if (vehiculo instanceof Camion) {
            return cantPeajes * 150;
        } else {
            return cantPeajes * 100;
        }
    }

    public double calcularCostoCombustible() {
        return vehiculo.calcularCostoCombustible() * distancia;
    }

    public float calcularCostoTotal() {
        return (float)calcularCostoCombustible() + calcularCostoPeaje();
    }
}
