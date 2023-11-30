import javax.swing.*;
import java.util.ArrayList;

class RegistroProductos {
    ArrayList<Producto> productos;

    public RegistroProductos() {
        productos = new ArrayList<>();
        productos.add(new Producto("Paracetamol","0001","24/12/23","10/10/23",5.00d,20));
        productos.add(new Producto("Fentanilo","0002","28/01/24","12/10/23",15.00d,10));
        productos.add(new Producto("Viagra","0003","10/11/24","02/3/23",2.50d,40));
        productos.add(new Producto("Ibuprofeno","0004","01/02/24","05/1/22",4.50d,100));
        productos.add(new Producto("Alchol","0005","03/10/24","01/3/23",2.50d,10));
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        JOptionPane.showMessageDialog(null, producto.getNombre() + " registrado correctamente.");
    }

    public void mostrarProductos() {
        StringBuilder mensaje = new StringBuilder("--CATÁLOGO--\n");

        if (productos.isEmpty()) {
            mensaje.append("No hay productos registrados.");
        } else {
            for (Producto producto : productos) {
                mensaje.append("Nombre: ").append(producto.getNombre()).append("\n");
                mensaje.append("Código: ").append(producto.getCodigo()).append("\n");
                mensaje.append("Precio: ").append(producto.getPrecio()).append("\n");
                mensaje.append("Cantidad: ").append(producto.getCantidadProducto()).append("\n");
                mensaje.append("Fecha de compra: ").append(producto.getFechaCompra()).append("\n");
                mensaje.append("Fecha de caducidad: ").append(producto.getFechaCaducidad()).append("\n");
                mensaje.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}