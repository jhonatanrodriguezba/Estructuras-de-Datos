package Proyecto15Abr;

import java.util.*;

public class Principal {
    static Contenedor [][] patio = new Contenedor [6][2];
    static Queue<Contenedor> inspeccion = new LinkedList<>();
    static Stack<Contenedor> buque = new Stack<>();
    static Stack<Contenedor> pilaAuxiliar = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static Contenedor [] manifiesto;

    public static void ubicarContenedor (Contenedor nuevo){
        boolean ubicado = false;

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 2; j++){
                    
                if (patio [i][j] == null){
                    patio [i][j] = nuevo;
                    ubicado = true;
                    System.err.println("Contenedor " + nuevo.getId() + " ubicado en la posición [" + i + "][" + j + "]");
                }
            }
        }
        if (!ubicado){
            System.err.println("No se pudo ubicar el contenedor " + nuevo.getId() + " en el patio.");
        }
    }
    public static void mostrarEstadoPatio() {
        int ocupados = 0;
        int totalEspacios = 6 * 2; // Dimensiones R * K

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (patio[i][j] != null) {
                    ocupados++;
                }
            }
        }
        double porcentaje = ((double) ocupados / totalEspacios) * 100;
        System.out.println("Ocupación actual: " + ocupados + "/" + totalEspacios + " (" + porcentaje + "%)");
        if (ocupados == totalEspacios) {
            System.out.println("Estado crítico: Puerto Saturado");
        }
    }
    public static void aInspeccion(Contenedor c){
        if (c.getPrioridad() == 1){
            inspeccion.add(c);
            System.out.println("Contenedor " + c.getId() + " agregado a la cola de inspección.");
        } else {
            System.out.println("Contenedor " + c.getId() + " no requiere inspección.");
        }
    }
    public static void procesarInspeccion(){
        if (!inspeccion.isEmpty()){
            Contenedor c = inspeccion.poll();
            System.out.println("Contenedor " + c.getId() + " ha sido inspeccionado y retirado de la cola.");
        } else {
            System.out.println("No hay contenedores en la cola de inspección.");
        }
    }
    public static void retirarContenedorDañado(String idBuscado) {
    boolean encontrado = false;

    // Desapilar hasta encontrar el dañado
    while (!buque.isEmpty()) {
        Contenedor actual = buque.pop();
        if (actual.getId().equals(idBuscado)) {
            System.out.println("Contenedor dañado " + idBuscado + " retirado del buque.");
            encontrado = true;
            break; // Salimos del bucle al encontrarlo
        } else {
            pilaAuxiliar.push(actual); // Guardamos temporalmente los de arriba
        }
    }

    // RE-APILAR: Devolver los contenedores de la auxiliar al buque
    while (!pilaAuxiliar.isEmpty()) {
        buque.push(pilaAuxiliar.pop());
    }

    if (!encontrado) {
        System.out.println("El contenedor " + idBuscado + " no se encuentra en el buque.");
    }
}
    public static void main(String [] args){
        int opcion;
        do {
            System.out.println("Menu - Puerto DataBay");
            System.out.println("1. Ubicar contenedor");
            System.out.println("2. Mostrar estado del patio");
            System.out.println("3. Agregar contenedor a inspección");
            System.out.println("4. Procesar inspección");
            System.out.println("5. Retirar contenedor dañado");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para ubicar contenedor
                    break;
                case 2:
                    mostrarEstadoPatio();
                    break;
                case 3:
                    // Lógica para agregar a inspección
                    break;
                case 4:
                    procesarInspeccion();
                    break;
                case 5:
                    // Lógica para retirar contenedor dañado
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
    public static void registrarManifiesto() {
        System.out.print("¿Cuántos contenedores llegan en el camión?: ");
        int n = sc.nextInt();
        manifiesto = new Contenedor[n];
        double pesoTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Contenedor " + i + ":");
            System.out.print("ID: "); String id = sc.next();
            System.out.print("Peso: "); double peso = sc.nextDouble();
            System.out.print("Prioridad (1-Alta, 2-Baja): "); int prio = sc.nextInt();
            manifiesto[i] = new Contenedor(id, peso, prio);
            pesoTotal += peso;
        }
        System.out.println("Peso total del manifiesto: " + pesoTotal + " toneladas.");
    }
    public static void ubicarEnPatio() {
        if (manifiesto == null) {
            System.out.println("Primero debe registrar el manifiesto.");
            return;
        }
        for (Contenedor c : manifiesto) {
            boolean ubicado = false;
            // Recorrer por filas (6) y columnas (2) para buscar null
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 2; j++) {
                    if (patio[i][j] == null) {
                        patio[i][j] = c;
                        ubicado = true;
                        System.out.println("Contenedor " + c.getId() + " ubicado en Patio [" + i + "][" + j + "]");
                        break; 
                    }
                }
                if (ubicado) break;
            }
            if (!ubicado) System.out.println("ALERTA: Puerto Saturado para el contenedor " + c.getId());
        }
    }
    public static void gestionarInspeccion() {
        // En este ejemplo, movemos del patio a inspección si tienen prioridad 1
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (patio[i][j] != null && patio[i][j].prioridad == 1) {
                    inspeccion.add(patio[i][j]); // Enqueue
                    System.out.println("Contenedor " + patio[i][j].getId() + " enviado a Rayos X.");
                    patio[i][j] = null; // Libera el espacio en el patio
                }
            }
        }
    }
    public static void cargarAlBuque() {
        if (!inspeccion.isEmpty()) {
            Contenedor c = inspeccion.poll(); // Dequeue (El primero en llegar sale primero)
            
            // Reto de Ingeniería: Verificar estabilidad por peso [8]
            if (!buque.isEmpty() && c.peso > buque.peek().peso) {
                System.out.println("Inestabilidad: El contenedor " + c.getId() + " es muy pesado para el tope.");
                // Podría devolverse a una zona de espera o reintentar
            } else {
                buque.push(c); // Push al tope de la pila
                System.out.println("Contenedor " + c.getId() + " apilado con éxito.");
            }
        } else {
            System.out.println("No hay contenedores listos en inspección.");
        }
    }
    public static void operacionCritica() {
        System.out.print("Ingrese ID del contenedor dañado a retirar: ");
        String idBuscado = sc.next();
        Stack<Contenedor> auxiliar = new Stack<>();
        boolean encontrado = false;

        while (!buque.isEmpty()) {
            Contenedor actual = buque.pop();
            if (actual.getId().equals(idBuscado)) {
                System.out.println("Contenedor dañado retirado.");
                encontrado = true;
                break;
            } else {
                auxiliar.push(actual);
            }
        }
        // Re-apilar manteniendo el orden original
        while (!auxiliar.isEmpty()) {
            buque.push(auxiliar.pop());
        }
        if (!encontrado) System.out.println("Contenedor no encontrado en el buque.");
    }
}



