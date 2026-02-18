import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = sc.nextInt();
        
        int[] numeros = new int[N];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        // Llenar el arreglo y sumar
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }
        
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
        
        sc.close();
    }
}

