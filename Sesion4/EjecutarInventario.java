package Sesion4;

public class EjecutarInventario {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario(5);

        Producto p1 = new Producto(123456, "Laptop", 1500.0, 10);
        Producto p2 = new Producto(789012, "Smartphone", 800.0, 20);
        Producto p3 = new Producto(131415, "Tablet", 400.0, 15);
        Producto p4 = new Producto(161718, "Monitor", 300.0, 5);
        Producto p5 = new Producto(192021, "Teclado", 50.0, 25);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Buscar un producto por ID
        System.out.println("Buscando producto con ID 123456 " + inventario.buscarPorId(3));

        // Actualizar el stock de un producto
        System.out.println("Actualizando stock del producto con ID 2...");
        inventario.actualizarStock(2, 30);

        // Generar informe del valor total del inventario
        System.out.println("Valor total del inventario: $" + inventario.generarInformeValorTotal());

        // Obtener productos agotados
        System.out.println("Productos agotados:");
        for (Producto p : inventario.obtenerProductosAgotados()) {
            System.out.println(p);
        }
    }
}
