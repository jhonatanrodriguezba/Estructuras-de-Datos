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
            productos[contador] = P;
            contador++;
            return true; 
        } else{
            System.out.println("El inventario ya está lleno");
            return false;
        }
    }
    public Producto buscarPorId(int id){
        for (int i = 0; i < contador; i++){
            if (productos[i].getId() == id){
                return productos[i];
            }
        }
        return null;
    }
    public boolean actualizarStock(int id, int nuevoStock){
        Producto producto = buscarPorId(id);
        if (producto != null){
            producto.setCantidadStock(nuevoStock);
            return true;
        } else{
            System.out.println("Producto no encontrado");
            return false;
        }
    }
    public double generarInformeValorTotal(){
        double total = 0;

        for (int i = 0; i < contador; i++){
            total += productos[i].getPrecio() * productos[i].getCantidadStock();
        }
        return total;
    }
    public Producto[] obtenerProductosAgotados(){
        int cantidad = 0;
        for (int i = 0; i < contador; i++){
            if (productos[i].getCantidadStock() == 0){
                cantidad++;
            }
        }
        Producto[] agotados = new Producto[cantidad];

        int j = 0;
        for (int i = 0; i < contador; i++){
            if (productos[i].getCantidadStock() == 0){
                agotados[j] = productos[i];
                j++;
            }
        }
        return agotados;    
    }
}
