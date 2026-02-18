import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de productos (N): ");
        int N = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        
        double[] PU = new double[N];     // Precio Unitario
        int[] CC = new int[N];           // Cantidad Comprada
        String[] DESC = new String[N];   // Descripción
        double[] TG = new double[N];     // Total por producto
        
        double totalGeneral = 0;
        double mayorGasto;
        int indiceMayor = 0;
        
        // Llenar datos
        for (int i = 0; i < N; i++) {
            System.out.println("\nProducto " + (i + 1));
            
            System.out.print("Descripción: ");
            DESC[i] = sc.nextLine();
            
            System.out.print("Precio Unitario: ");
            PU[i] = sc.nextDouble();
            
            System.out.print("Cantidad Comprada: ");
            CC[i] = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            
            // a) Calcular total por producto
            TG[i] = PU[i] * CC[i];
            
            // b) Acumular total general
            totalGeneral += TG[i];
        }
        
        // c) Buscar el mayor gasto
        mayorGasto = TG[0];
        
        for (int i = 1; i < N; i++) {
            if (TG[i] > mayorGasto) {
                mayorGasto = TG[i];
                indiceMayor = i;
            }
        }
        
        // Resultados
        System.out.println("\nTotal general de compras: $" + totalGeneral);
        
        System.out.println("\nProducto con mayor gasto:");
        System.out.println("Descripción: " + DESC[indiceMayor]);
        System.out.println("Total gastado: $" + mayorGasto);
        
        sc.close();
    }
}

