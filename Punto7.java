public class Punto7 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares [] = new int[10];
        int impares [] = new int[10];

        int i = 0;
        int p = 0;
        int imp = 0;

        for (i = 0; i < a.length; i++){
            if (i % 2 == 0){
                pares[p] = a[i];
                p++;
            } else {
                impares[imp] = a[i];
                imp++;
            }
        }
        System.out.println("Pares: "+ pares);
        System.out.println("Impares: "+ impares);
    }
    
}
