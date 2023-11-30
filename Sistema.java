import javax.swing.JOptionPane;

public class Sistema {

    public static void main(String[] args) {

        int opcionInicio;
        RegistroProveedores registro = new RegistroProveedores();
        RegistroProductos registroProducto = new RegistroProductos();

        do {
            try {
                opcionInicio = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "FARMACIA SELOCURATODO\n" +
                                "1. LOGIN (ADMINISTRADOR)\n" +
                                "2. INICIAR\n"+
                                "3. SALIR"));

                switch (opcionInicio) {
                    case 1:
                        String usuario = JOptionPane.showInputDialog(null,"USUARIO","INGRESE USUARIO",JOptionPane.INFORMATION_MESSAGE);
                        String contrasena = JOptionPane.showInputDialog(null,"CONTRASEÑA","INGRESE CONTRASEÑA",JOptionPane.INFORMATION_MESSAGE);

                        if ((usuario.equals("angel") && contrasena.equals("12345"))||(usuario.equals("erika") && contrasena.equals("12345"))) {
                            int opcion;
                            String opcionCancelar;
                            do {
                                try {
                                    opcionCancelar = JOptionPane.showInputDialog(
                                            "MENÚ\n" +
                                                    "1. Registrar Proveedor\n" +
                                                    "2. Ver Proveedor\n" +
                                                    "3. Registrar Productos \n" +
                                                    "4. Ver Productos \n" +
                                                    "5. Salir");
                                    opcion = Integer.parseInt(opcionCancelar);
                                    /*if (opcionCancelar == null) {
                                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal. ¡Hasta luego!");
                                        System.exit(0);  // Sale del programa
                                    }*/
                                    switch (opcion) {
                                        case 1:
                                            String nombreProveedor = JOptionPane.showInputDialog("Ingrese nombre:");
                                            String ruc = JOptionPane.showInputDialog("Ingrese RUC:");
                                            String telefono = JOptionPane.showInputDialog("Ingrese teléfono:");
                                            String correo = JOptionPane.showInputDialog("Ingrese correo:");

                                            Proveedor nuevoProveedor = new Proveedor(nombreProveedor, ruc,telefono,correo);

                                            registro.agregarProveedor(nuevoProveedor);
                                            break;

                                        case 2:
                                            registro.mostrarProveedores();
                                            break;
                                        case 3:
                                            String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                            String codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
                                            String caducidad = JOptionPane.showInputDialog("Ingrese fecha de caducidad: ");
                                            String compra = JOptionPane.showInputDialog("Ingrese fecha de compra: ");
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio: "));
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));

                                            Producto nuevoProducto = new Producto(nombre, codigo, caducidad, compra, precio, cantidad);

                                            registroProducto.agregarProducto(nuevoProducto);
                                            break;
                                        case 4:
                                            registroProducto.mostrarProductos();
                                            break;

                                        case 5:
                                            JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                                            break;
                                    }
                                } catch (NumberFormatException e) {
                                    // Captura la excepción si el usuario ingresa un valor no numérico
                                    JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un valor numérico.");
                                    opcion = -1; // Establece opción a un valor que hará que se repita el bucle
                                }

                            } while (opcion != 5);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Proveedor no registrado");
                        }
                        break;

                    case 2:
                        int opcionMenu;
                        do {
                            try{
                                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(
                                        "MENÚ\n" +
                                                "1. Ver Productos\n" +
                                                "2. Comprar Productos\n" +
                                                "3. Salir\n"));
                                switch (opcionMenu) {
                                    case 1:
                                        registroProducto.mostrarProductos();
                                        break;
                                    case 2:
                                        JOptionPane.showInputDialog("Qué producto desea comprar: \n");
                                        JOptionPane.showMessageDialog(null,"Producto vendido exitosamente");
                                        break;
                                    case 3:

                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Error: Opción no válida. Por favor, elija 1, 2 o 3.");
                                }
                            }catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un valor numérico.");
                                opcionMenu = -1;
                            }
                        } while (opcionMenu != 3);

                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la entrada a un número. Asegúrate de ingresar un número válido.");
                opcionInicio = -1; // Restablecer la opción a un valor no válido para repetir el bucle.
            }
        } while (opcionInicio != 3);
    }

}
