package Clases;

public class Combustible {
 
    tipoCombustible tipo;
    double precio; 

    public Combustible(tipoCombustible tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    
    
    @Override
    public String toString() {
        return "Combustible{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }

    public tipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(tipoCombustible tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Combustible(tipoCombustible tipo) {
        this.tipo = tipo;
        switch(tipo){
            case DIESEL: precio = 165;
            case GASOIL: precio=135;
            case GNC: precio=71;
            case NAFTA: precio=130;
            case BIODIESEL: precio=180;
        }
    }

    public Combustible() {
    }
    
}
