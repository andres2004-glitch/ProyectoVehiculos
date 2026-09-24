public class main {

    public static void main(String[] args) {

       
        GestorProductos gestor = new GestorProductos();

       
        Producto producto1 = new Producto(1, "Laptop", 2500000);
        Producto producto2 = new Producto(2, "Mouse", 80000);
        Producto producto3 = new Producto(3, "Teclado", 150000);

       
        gestor.agregarProducto(producto1);
        gestor.agregarProducto(producto2);
        gestor.agregarProducto(producto3);

        
        System.out.println("PRODUCTOS:");
        gestor.mostrarProductos();

       
        boolean actualizado = gestor.actualizarProducto(2, 100000);

        if (actualizado) {
            System.out.println("\nProducto actualizado correctamente.");
        } else {
            System.out.println("\nNo se encontró el producto.");
        }

        
        System.out.println("\nPRODUCTOS DESPUÉS DE ACTUALIZAR:");
        gestor.mostrarProductos();

        boolean eliminado = gestor.eliminarProducto(1);

        if (eliminado) {
            System.out.println("\nProducto eliminado correctamente.");
        } else {
            System.out.println("\nNo se encontró el producto.");
        }

        System.out.println("\nPRODUCTOS DESPUÉS DE ELIMINAR:");
        gestor.mostrarProductos();
    }
}
