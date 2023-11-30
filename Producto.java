public class Producto {
    private String nombre;
    private String codigo;
    private String fechaCaducidad;
    private String fechaCompra;
    private double precio;
    private int cantidadProducto ;

    public Producto(String nombre, String codigo, String fechaCaducidad, String fechaCompra, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
