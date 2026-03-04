package Sesion5;

public class Buque {
    private String nombre;
    private double capacidad;
    private String origen;

    public Buque(String nombre, double capacidad, String origen) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.origen = origen;
    }
    public String getNombre() {
        return nombre;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public String getOrigen() {
        return origen;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @Override
    public String toString() {
        return "Buques [nombre=" + nombre + ", capacidad=" + capacidad + ", origen=" + origen + "]";
    }
    

    
}