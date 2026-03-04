package Sesion5;

public class Contenedor {
    private String origen;
    private String codigo;
    private double peso;

    public Contenedor(String origen, String codigo, double peso) {
        this.origen = origen;
        this.codigo = codigo;
        this.peso = peso;
    }
    public String getOrigen() {
        return origen;
    }
    public String getCodigo() {
        return codigo;
    }
    public double getPeso() {
        return peso;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Contenedores [origen=" + origen + ", codigo=" + codigo + ", peso=" + peso + "]";
    }

}