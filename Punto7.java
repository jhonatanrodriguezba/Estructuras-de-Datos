public class Punto7 {
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int pares [] = 0;
    int impares[] = 0;

    for (i = 0; i < a.lenght; i++){
        if (a[i] % 2 == 0){
            pares[pares] = a[i];
            pares++;
        } else {
            impares[impares] = a[i];
            impares++;
        }
    }
    system.out.println("Pares: " + pares);
    
}
