public class ProdVerduleria extends Producto {
    public String uniVenta;

    public ProdVerduleria(String nombre, int precio, String uniVenta) {
        super(nombre, precio);
        this.uniVenta = uniVenta;
    }

    public String getUniVenta() {
        return uniVenta;
    }

    public void setUniVenta(String uniVenta) {
        this.uniVenta = uniVenta;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + " /// Precio : $" + precio + " /// Unidad de Venta : " + uniVenta+"\n";

    }
}