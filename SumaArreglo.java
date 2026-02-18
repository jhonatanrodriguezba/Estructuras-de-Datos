import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) { //Punto 1
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresar la cantidad de números (N): ");
        int N = sc.nextInt();
        
        int[] numeros = new int[N];
        int suma = 0;
        
        // Llenar el arreglo
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
          
        System.out.println("La suma total es: " + suma);
        
        sc.close();
    }
}
