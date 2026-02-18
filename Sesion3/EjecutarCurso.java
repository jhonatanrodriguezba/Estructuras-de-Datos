package Sesion3;

public class EjecutarCurso {
    public static void main(String[] args) {
        
        Curso[] c1 = new Curso[5];

        c1[0] = new Curso(0001, "Estructuras de Datos", "Jhon Haide Cano", 30);
        c1[1] = new Curso(0002, "Programacion Orientada a Objetos", "Jhon Haide Cano", 30);
        c1[2] = new Curso(0003, "Algoritmia", "Jhon Haide Cano", 30);
        c1[3] = new Curso(0004, "Programación Avanzada", "Jhon Haide Cano", 30);
        c1[4] = new Curso(0005, "Aplicaciones de la Inteligencia Artificial", "Jhon Haide Cano", 30);

        int suma = 0;
        for (int i = 0; i < c1.length; i++){
            suma += c1[i].getCantidad_estudiantes();
        }
        String cad = "\n";
        for (int i = 0; i < c1.length; i++){
            if (c1[i].getCantidad_estudiantes() > 30){
                cad += "-" + c1[i].getNombre_curso() + " " + c1[i].getCantidad_estudiantes() + " \n";
            }
        }
        System.out.println("La cantidad de estudiantes es: " + suma);
    }
}
