package Sesion3;
public class Curso {
    private int id;
    private String nombre_curso;
    private String profesor;
    private int cantidad_estudiantes;

    public Curso(int id, String nombre_curso, String profesor, int cantidad_estudiantes) {
        this.id = id;
        this.nombre_curso = nombre_curso;
        this.profesor = profesor;
        this.cantidad_estudiantes = cantidad_estudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantidad_estudiantes() {
        return cantidad_estudiantes;
    }

    public void setCantidad_estudiantes(int cantidad_estudiantes) {
        this.cantidad_estudiantes = cantidad_estudiantes;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre_curso=" + nombre_curso + ", profesor=" + profesor
                + ", cantidad_estudiantes=" + cantidad_estudiantes + "]";
    }
    
    
}
