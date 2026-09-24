import java.util.ArrayList;

public class GestorProductos {

    private final ArrayList<Producto> Productos;

   
    public GestorProductos() {
        Productos = new ArrayList<>();
    }

    
    public void agregarProducto(Producto producto) {
        Productos.add(producto);
    }

   
    public void mostrarProductos() {
        for (Producto Producto : Productos) {
            System.out.println(Producto);
        }
    }

    
    public boolean actualizarProducto(int id, double nuevoPrecio) {

        for (Producto producto : Productos) {

            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                return true;
            }
        }

        return false;
    }

   
    public boolean eliminarProducto(int id) {

        for (Producto Producto : Productos) {

            if (Producto.getId() == id) {
                Productos.remove(Producto);
                return true;
            }
        }

        return false;
    }
}
