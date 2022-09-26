package Clases.Vehiculos;

public class Camion extends Vehiculo{
    
    

    public double calcularCostoCombustible(){
        double costoDeCombustible;
        costoDeCombustible=combustible.getPrecio()*12/100;
        return costoDeCombustible;
    };
//y 12 Lts cada 100 Km para los camiones.
}
