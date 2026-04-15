package Proyecto15Abr;

public class Contenedor {
    String Id;
    double peso;
    int prioridad;
    public Contenedor(String id, double peso, int prioridad) {
        Id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }
    public String getId() {
        return Id;
    }
    public double getPeso() {
        return peso;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setId(String id) {
        Id = id;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    @Override
    public String toString() {
        return "Contenedor [Id=" + Id + ", peso=" + peso + ", prioridad=" + prioridad + "]";
    }

    
}
