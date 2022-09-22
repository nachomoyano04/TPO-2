package Clases.Vehiculos;

public class Auto extends Vehiculo{
    
    
    
    
    @Override
    public double calcularCostoCombustible(){
        double costoDeCombustible;
        costoDeCombustible=combustible.getPrecio()*7/100;
        return costoDeCombustible;
        
// el consumo de combustible es de 7 Lts cada 100 Km para los autos
    };
    
}
