import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Primer arreglo
        System.out.print("Ingrese la cantidad de personas del grupo 1: ");
        int n1 = sc.nextInt();
        int[] edades1 = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            System.out.print("Ingrese la edad del grupo 1 persona " + (i + 1) + ": ");
            edades1[i] = sc.nextInt();
        }
        
        // Segundo arreglo
        System.out.print("\nIngrese la cantidad de personas del grupo 2: ");
        int n2 = sc.nextInt();
        int[] edades2 = new int[n2];
        
        for (int i = 0; i < n2; i++) {
            System.out.print("Ingrese la edad del grupo 2 persona " + (i + 1) + ": ");
            edades2[i] = sc.nextInt();
        }
        
        // Buscar el mayor
        int mayor = edades1[0]; // asumimos que el primero es el mayor
        
        for (int i = 0; i < n1; i++) {
            if (edades1[i] > mayor) {
                mayor = edades1[i];
            }
        }
        
        for (int i = 0; i < n2; i++) {
            if (edades2[i] > mayor) {
                mayor = edades2[i];
            }
        }
        
        System.out.println("\nLa edad mayor entre los dos grupos es: " + mayor);
        
        sc.close();
    }
}

