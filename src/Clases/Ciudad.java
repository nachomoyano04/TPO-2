package Clases;

public class Ciudad {
    public int ubicacionEnKm;
    public String sobreRuta;
    public String nombreCiudad;

    public Ciudad(int ubicacionEnKm, String sobreRuta, String nombreCiudad) {
        this.ubicacionEnKm = ubicacionEnKm;
        this.sobreRuta = sobreRuta;
        this.nombreCiudad = nombreCiudad;
    }

    public Ciudad() {
    }

    public int getUbicacionEnKm() {
        return ubicacionEnKm;
    }

    public void setUbicacionEnKm(int ubicacionEnKm) {
        this.ubicacionEnKm = ubicacionEnKm;
    }

    public String getSobreRuta() {
        return sobreRuta;
    }

    public void setSobreRuta(String sobreRuta) {
        this.sobreRuta = sobreRuta;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ubicacionEnKm=" + ubicacionEnKm + ", sobreRuta=" + sobreRuta + ", nombreCiudad=" + nombreCiudad + '}';
    }
    
    
}
