package Sesion6;

public class Suministro {
    private String id;
    private int nivelEnergia;
    private int prioridad;

    public Suministro(String id, int nivelEnergia, int prioridad) {
        this.id = id;
        this.nivelEnergia = nivelEnergia;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Suministro [id=" + id + ", nivelEnergia=" + nivelEnergia + ", prioridad=" + prioridad + "]";
    }
    
}
