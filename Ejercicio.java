public class Ejercicio {
    public static void main(String[] args) {
    // creacion del arreglo/array/vector
        int [] a = {2, 6, 8, 1, 20, 50, 7, 3, 5};

        System.out.println("a[4]" + a[4]);
        System.out.println("a[7]" + a[7]);
        System.out.println("a[8]" + a[8]);
        System.out.println("a[0]" + a[0]);
        System.out.println("a[1]" + a[1]);

        System.err.println("tamaño del arreglo" + a.length);

        int sum = a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8];

        System.out.println("La Suma Es =" + sum);
    }
}
