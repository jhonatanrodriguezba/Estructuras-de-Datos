package Sesion5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AplicacionContenedores {

    static Buque[] buques = new Buque[10];
    static Contenedor[][] patio = new Contenedor[10][10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("====== MENU PRINCIPAL ======");
            System.out.println("1. Registro de Buques");
            System.out.println("2. Registro de Contenedores");
            System.out.println("3. Mostrar peso total de contenedores");
            System.out.println("4. Listar origen agrupado");
            System.out.println("5. Mostrar estado del patio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarBuque();
                    break;
                case 2:
                    registrarContenedor();
                    break;
                case 3:
                    mostrarPesoTotal();
                    break;
                case 4:
                    listarOrigenAgrupado();
                    break;
                case 5:
                    mostrarPatio();
                    break;
                case 6:
                    System.out.println("Se cerro la aplicación");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 6);
    }

    // ================= REGISTRO BUQUES =================

    public static void registrarBuque() {

        System.out.print("Ingrese posicion del buque (0-9): ");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos < 0 || pos > 9) {
            System.out.println("Posicion invalida.");
            return;
        }

        if (buques[pos] != null) {
            System.out.println("Puesto ocupado.");
            return;
        }

        System.out.print("Nombre del buque: ");
        String nombre = sc.nextLine();

        System.out.print("Pais de origen: ");
        String pais = sc.nextLine();

        System.out.print("Capacidad: ");
        int capacidad = sc.nextInt();

        buques[pos] = new Buque(nombre, capacidad, pais);

        System.out.println("Buque registrado correctamente");
    }

    // ================= REGISTRO CONTENEDORES =================

    public static void registrarContenedor() {

        sc.nextLine();

        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Origen: ");
        String origen = sc.nextLine();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Columna donde desea ubicar (0-9): ");
        int col = sc.nextInt();

        if (col < 0 || col > 9) {
            System.out.println("Columna invalida.");
            return;
        }

        for (int fila = 9; fila >= 0; fila--) {
            if (patio[fila][col] == null) {
                patio[fila][col] = new Contenedor(codigo, origen, peso);
                System.out.println("Contenedor ubicado en fila " + fila + ", columna " + col);
                return;
            }
        }

        System.out.println("La columna esta llena");
    }

    // ================= PESO TOTAL =================

    public static void mostrarPesoTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (patio[i][j] != null) {
                    total += patio[i][j].getPeso();
                }
            }
        }

        System.out.println("Peso total de contenedores: " + total);
    }

    // ================= AGRUPAR POR ORIGEN =================

    public static void listarOrigenAgrupado() {

        Map<String, Integer> mapa = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (patio[i][j] != null) {
                    String origen = patio[i][j].getOrigen();
                    mapa.put(origen, mapa.getOrDefault(origen, 0) + 1);
                }
            }
        }

        if (mapa.isEmpty()) {
            System.out.println("No hay contenedores registrados");
            return;
        }

        System.out.println("Contenedores agrupados por origen:");
        for (String origen : mapa.keySet()) {
            System.out.println(origen + ": " + mapa.get(origen));
        }
    }

    // ================= MOSTRAR PATIO =================

    public static void mostrarPatio() {

        System.out.println("Estado del Patio (X = ocupado, O = libre)");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (patio[i][j] == null) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
