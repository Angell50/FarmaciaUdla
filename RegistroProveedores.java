import javax.swing.*;
import java.util.ArrayList;

class RegistroProveedores {
    ArrayList<Proveedor> proveedores;

    public RegistroProveedores() {
        proveedores = new ArrayList<>();
        proveedores.add(new Proveedor("Bayer","1234567891001","02-2341667","bayer@udla.edu.ec"));
        proveedores.add(new Proveedor("Pfizer","16728192341001","02-654321","pfizer@yahoo.com"));
        proveedores.add(new Proveedor("Bagó","71263182319001","02-981625","bagó@yahoo.com"));

    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        JOptionPane.showMessageDialog(null, "Proveedor " + proveedor.getNombreProveedor() + " registrado correctamente.");
    }

    public void mostrarProveedores() {
        StringBuilder mensaje = new StringBuilder("Proveedores registrados:\n");

        if (proveedores.isEmpty()) {
            mensaje.append("No hay proveedores registrados.");
        } else {
            for (Proveedor proveedor : proveedores) {
                mensaje.append("Nombre: ").append(proveedor.getNombreProveedor()).append("\n");
                mensaje.append("RUC: ").append(proveedor.getRuc()).append("\n");
                mensaje.append("Teléfono: ").append(proveedor.getTelefono()).append("\n");
                mensaje.append("Correo: ").append(proveedor.getCorreo()).append("\n");
                mensaje.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}