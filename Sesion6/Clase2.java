package Sesion6;

public class Clase2 {
    public static void main(String[] args) {
        int [] energiaContenedores = new int [12];
        System.out.println("Contenedores de energía:");
        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = (int) (Math.random() * 100)+50;
        }
        System.out.println("\n");
        int [] multiplosDiez = new int [12];
        int contador = 0;

        for (int i = 0; i < energiaContenedores.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                multiplosDiez[contador] = energiaContenedores[i];
                contador++;
            }
        }
        System.err.println("Valores multiplos de 10 filtrados: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(multiplosDiez[i]);
            }
        int [][] mapaCarga = new int [3][3];
        int indice = 0;
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int w = 0; w < mapaCarga[i].length; w++){
                if (indice < contador){
                    mapaCarga[i][w] = multiplosDiez[indice];
                    indice++;
                }else{
                    mapaCarga[i][w] = -1;
                }
            }
        }
        Suministro [] manifiesto = new Suministro[9];
        int posicion = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (mapaCarga[i][j] != -1){
                    int energía = mapaCarga[i][j];
                    String id = "C" + (posicion + 1);
                    manifiesto[posicion] = new Suministro(id, energía, i);
                    posicion++;

                    String prioridad;
                    if (energía > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTANDAR";
                    }
                    manifiesto[posicion] = new Suministro(prioridad, energía, i);

                }else{
                    manifiesto[posicion] = null;
                }
                posicion++;
            }
        }
    }
}
