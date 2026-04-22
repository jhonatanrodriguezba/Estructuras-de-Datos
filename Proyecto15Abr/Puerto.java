package Proyecto15Abr;

public class Puerto {
    Static Contenedor [][] patio = new Contenedor [6][2];


    public void ubicarContenedor (Contenedor nuevo){
        boolean ubicado = false;


        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 2; j++){
                    
                if (patio [i][j] == null){
                    patio [i][j] = nuevo;
                    ubicado = true;
                    System.err.println("Contenedor " + nuevo.getId() + " ubicado en la posición [" + i + "][" + j + "]");
                }
            }
        }
        if (!ubicado){
            System.err.println("No se pudo ubicar el contenedor " + nuevo.getId() + " en el patio.");
        }
    }
    public void mostrarEstadoPatio(){
        int ocupados = 0;
        int totalEspacios = 6 * 2;
        for (int i = 0; i < 6; i++){
             for (int j = 0; j < 2; j++){
                    if (patio [i][j] != null){
                        ocupados++;
                    }
                }
            }
            double porcentajeOcupacion = (ocupados / (double) totalEspacios) * 100;
            System.out.println("Ocupación actual: " + ocupados + "/" + totalEspacios + " (" + porcentajeOcupacion + "%)");

            if (ocupados == totalEspacios) {
                System.out.println("El patio está completamente lleno.");
            } else if (ocupados == 0) {
                System.out.println("El patio está completamente vacío.");
            } else {
                System.out.println("El patio tiene espacio disponible.");
            }

    }
}
