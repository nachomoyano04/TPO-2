package Clases;

import Clases.Vehiculos.Auto;
import Clases.Vehiculos.Camion;
import Clases.Vehiculos.Camioneta;
import Clases.Vehiculos.Vehiculo;

public final class Viaje {

    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private int distancia;
    private Vehiculo vehiculo;
    private int cantPeajes;
    private Auto auto;
    private Vehiculo camion;
    private Vehiculo camioneta;
    private boolean estanSobreMismaRuta;
    private Combustible combustible;

    public Viaje(Ciudad ciudadOrigen, Ciudad ciudadDestino, Vehiculo vehiculo, Combustible combustible, int cantPeajes, boolean estanSobreMismaRuta) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        this.estanSobreMismaRuta = estanSobreMismaRuta;
        this.combustible = combustible;
        distancia = (int) calcularDistancia();
        auto = new Auto();
        camion = new Camion();
        camioneta = new Camioneta();

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
        return "El Viaje{" + "ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", cantPeajes=" + cantPeajes + ", estanSobreMismaRuta=" + estanSobreMismaRuta + '}';
    }

    public double calcularDistancia() {
        return Math.abs(ciudadOrigen.ubicacionEnKm - ciudadDestino.ubicacionEnKm);
    }

    public double calcularCostoPeaje() {
        int costoPeaje = 0;
        if (vehiculo instanceof Camion) {
            for (int i = 1; i < cantPeajes; i++) {
                costoPeaje = 150 * i;
            }
            return costoPeaje;
        } else {
            for (int i = 1; i < cantPeajes; i++) {
                costoPeaje = 100 * i;
            }
            return costoPeaje;
        }
    }

    public double calcularCostoCombustible() {
        double resultado = 0;
        if (vehiculo instanceof Auto) {
            resultado = combustible.getPrecio() + auto.calcularCostoCombustible() * distancia;
            return resultado;
        }
        if (vehiculo instanceof Camion) {
            resultado = combustible.getPrecio() + camion.calcularCostoCombustible() * distancia;
            return resultado;
        }
        if (vehiculo instanceof Camioneta) {
            resultado = combustible.getPrecio() + camioneta.calcularCostoCombustible() * distancia;
            return resultado;
        }
        return resultado;
    }

    public double calcularCostoTotal() {
        return calcularCostoCombustible() + calcularCostoPeaje();
    }
}
