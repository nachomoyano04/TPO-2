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
        switch (tipo) {
            case DIESEL:
                precio = 165;break;
            case GASOIL:
                precio = 135;break;
            case GNC:
                precio = 71;break;
            case NAFTA:
                precio = 130;break;
            case BIODIESEL:
                precio = 180;break;
        }
    }

    public Combustible() {
    }

}
