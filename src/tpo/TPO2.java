/*

Clases: 
- Viaje
- Vehiculo (Super)
- Auto, Camion, Camioneta (sub)
- Combustible

Ejercicio N°1 Se desean gestionar viajes terrestres en vehículos propios, con el objetivo
de poder calcular el costo de los mismos. 

Un viaje tiene la siguiente información: lugar de origen, lugar de destino, distancia entre las ciudades 
(se conoce este dato si las ciudades no están sobre la misma ruta), tipo de combustible del vehículo, vehículo, cantidad de
peajes y si las ciudades se encuentran sobre la misma ruta Km en el cual se encuentra
cada ciudad. 
Un ejemplo de viaje sobre una misma ruta es ir de San Luis a Rufino en la provincia de Santa Fe.

Del combustible necesitamos conocer: el tipo de combustible y precio.

Existen diferentes tipos de vehículos: Autos, Camiones y Camionetas; todos tienen la
siguiente información: marca, patente y combustible; además del comportamiento
calcularCostoDeCombustible() que cada tipo de vehículo lo implementará de la
siguiente forma: el consumo de combustible es de 7 Lts cada 100 Km para los autos, 10
Lts cada 100 Km para las camionetas y 12 Lts cada 100 Km para los camiones.

Se posee además la siguiente información: el costo del viaje depende de la distancia, el
consumo de combustible y la cantidad de peajes. 

El costo de los peajes también depende del tipo de vehículo (vamos a suponer que todos los peajes tienen el mismo costo), los
autos y camionetas están en una categoría y los camiones en otra. Si las ciudades están
sobre la misma ruta se recibe el Km de la ciudad origen y el Km de la ciudad destino. De
lo contrario se recibe la distancia.

La clase viaje poseerá al menos 2 constructores, y los siguientes métodos:

• Cálculo de distancia
• Cálculo del costo en peajes,
• Calculo del costo en combustibles
• Cálculo del costo total.  */
package tpo;

import Clases.Ciudad;
import Clases.Combustible;
import Clases.Vehiculos.Auto;
import Clases.Vehiculos.Camion;
import Clases.Vehiculos.Camioneta;
import Clases.Viaje;
import Clases.tipoCombustible;
import java.util.Scanner;

public class TPO2 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.println("Test 1: Viaje desde Villa Mercedes hasta San Luis en Auto(naftero), por la ruta 7, calculando 2 peajes.");

        Combustible com = new Combustible(tipoCombustible.NAFTA);
        Auto a = new Auto("Ford focus", "HIJ245", com);
        Ciudad villa = new Ciudad(696, "siete", "Villa Mercedes");
        Ciudad sanluis = new Ciudad(788, "siete", "San Luis");
        Viaje trip = new Viaje(villa, sanluis, a, com, 2);
        System.out.println(trip);
        System.out.println("Costo total del viaje: $" + trip.calcularCostoTotal());

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Test 2: Viaje desde CABA hasta San Luis en Camioneta(Biodiesel), por misma ruta 7, calculando 4 peajes.");
        Combustible com2 = new Combustible(tipoCombustible.BIODIESEL);
        Camioneta c = new Camioneta("Chevrolet Chevy", "AB 265 PL", com2);
        Ciudad BSAS = new Ciudad(0, "siete", "CABA");
        Viaje trip2 = new Viaje(BSAS, sanluis, c, com2, 4);
        System.out.println(trip2);
        System.out.println("Costo total del viaje: $" + trip2.calcularCostoTotal());

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Test 3: Viaje desde Ushuaia hasta Neuquen en Camion(GNC), calculando 4 peajes.");
        Combustible com3 = new Combustible(tipoCombustible.GNC);
        Camion c2 = new Camion("Mercedes Benz", "SOP 235", com3);
        Ciudad rioGallegos = new Ciudad(100, "tres", "Rio Gallegos");
        Ciudad Neuquen = new Ciudad(600, "Doscientos Cincuenta", "Neuquen");
        Viaje trip3 = new Viaje(rioGallegos, Neuquen, c2, com3, 6);
        System.out.println(trip3);
        System.out.println("Costo total del viaje: $" + trip3.calcularCostoTotal());

    }

}
