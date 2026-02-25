package Sesion4;

public class Inventario {
    private Producto[] productos;
    private int contador;
    
    public Inventario(int capacidad){
        productos = new Producto[capacidad];
        contador = 0;
    }
    public boolean agregarProducto(Producto P){
        if (contador < productos.length){
            productos[contador] = p;
            contador++;
            return true; 
        } else{
            system.out.println("El inventario ya está lleno")
        }
    }
}
