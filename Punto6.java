public class Punto6 {
    public static void main(String[] args) {
        int [] arriendos = {147, 185, 150, 296};
        int [] ganancias = {50, 54, 60, 15};
        
        for (int i = 0; i < arriendos.length; i++){
            ganancias[i] = arriendos[i]*ganancias[i] / 100;
            System.out.println("El porcentaje (%) de ganancia es: " + ganancias[i] + "%");
        }

    }
}
