package Sesion3;

public class EjecutarMoto {
    public static void main(String[] args) {
        
        Moto[] m = new Moto[8];

        m[0] = new Moto(2026, "AKT Turing", "Negro", 125.0, 1250.0);
        m[1] = new Moto(2025, "Kawasaki", "Verde", 400.0, 25000.0);
        m[2] = new Moto(2026, "Honda", "Rojo", 350.0, 4000.0);
        m[3] = new Moto(2027, "Honda C90", "Dorado-Negro", 90.0, 10000.0);
        m[4] = new Moto(2025, "Bajaj - Boxer CT100", "Rojo", 100.0, 1500.0);
        m[5] = new Moto(2026, "Yamaha - FZ25", "Azul", 250.0, 12000.0);
        m[6] = new Moto(2027, "AKT - CR4 125", "Negro", 125.0, 1300.0);
        m[7] = new Moto(2025, "TVS Raider 125", "Negro", 125.0, 1800.0);
        //Operaciones con los objetos del arreglo

        //Obtener el promedio de los modelos de las motos del arreglo
        int suma = 0;
        for (int i = 0; i < m.length; i++){
            suma += m[i].getModelo();
        }
        System.out.println("El primedio de los modelos de las motos del arreglo es: " + (suma / m.length));

        //Obtener las motos que puedo comprar con un presupuesto de 20000 dolares
        String cad = "\n";
        for (int i = 0; i < m.length; i++){
            if (m[i].getPrecio() <= 20000){
                cad += "-" + m[i].getMarca() + " " + m[i].getPrecio() + " \n";
            }
        }
        System.out.println("Las motos que se pueden adquirir por 20000 son: " + cad);
    }
}
