package Clases;

public class Combustible {
 
    String tipo;
    double precio; 

    @Override
    public String toString() {
        return "Combustible{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Combustible(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public Combustible() {
    }
    
}
