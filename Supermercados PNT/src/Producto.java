//Clase principal

public class Producto implements Comparable<Producto> {
    protected String nombre;
    private double tamaño;
    private String uniDeMedida;
    protected int precio;

    public Producto(String nombre, double tamaño, String uniDeMedida, int precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.uniDeMedida = uniDeMedida;
        this.precio = precio;
    }

    public Producto() {
    }

    // Para los articulos de verduleria
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getUniDeMedida() {
        return uniDeMedida;
    }

    public void setUniDeMedida(String uniDeMedida) {
        this.uniDeMedida = uniDeMedida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + " /// " + uniDeMedida + ": " + tamaño + " /// precio : $" + precio+"\n";

    }

    // Uso de impletento Complemet
    // -1 es igual , 0 es menor , 1 mayor
    
    @Override
    public int compareTo(Producto otroProd) {
        int resultado = 0;
        if (otroProd.precio > this.precio) {
            resultado = 1;
        } else if (otroProd.precio < this.precio) {
            resultado = 0;
        } else {
            resultado = -1;
        }

        return resultado;
    }

	public void add(Producto producto) {
	}

}
