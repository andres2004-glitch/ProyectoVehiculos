import java.util.ArrayList;

public class GestorProductos {

    private final ArrayList<Producto> Productos;

    public GestorProductos() {
        Productos = new ArrayList<>();
    }

    // AGREGAR PRODUCTO
    public void agregarProducto(Producto producto) {
        Productos.add(producto);
    }

    // MOSTRAR PRODUCTOS
    public void mostrarProductos() {
        for (Producto producto : Productos) {
            System.out.println(producto);
        }
    }

    // ACTUALIZAR PRODUCTO
    public boolean actualizarProducto(int id, double nuevoPrecio) {

        for (Producto producto : Productos) {

            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                return true;
            }
        }

        return false;
    }

    // ELIMINAR PRODUCTO
    public boolean eliminarProducto(int id) {

        for (int i = 0; i < Productos.size(); i++) {

            if (Productos.get(i).getId() == id) {
                Productos.remove(i);
                return true;
            }
        }

        return false;
    }


}

