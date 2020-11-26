public class ProdCabello extends Producto {
    int tamañoC;

    public ProdCabello(String nombre, int tamañoC, String uniDeMedida, int precio) {
        super(nombre, tamañoC, uniDeMedida, precio);
        this.tamañoC = tamañoC;

    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + " /// " + "Contenido: " + tamañoC + getUniDeMedida() + " /// precio : $" + precio+"\n";
    }
}