import java.util.ArrayList;

//Lista de productos

public class Stock {

    static void listaStock() {
        ArrayList<Producto> listadeProductos = new ArrayList<Producto>();

        ProdBebida cocazero = new ProdBebida("Coca-Cola Zero", 1.5, "Litros", 20);
        ProdBebida coca = new ProdBebida("Coca-Cola ", 1.5, "Litros", 18);
        ProdCabello shampoo = new ProdCabello("Shampoo", 500, "ml", 19);
        ProdVerduleria frutilla = new ProdVerduleria("Frutillas", 64, "Kilo");

        listadeProductos.add(cocazero);
        listadeProductos.add(coca);
        listadeProductos.add(shampoo);
        listadeProductos.add(frutilla);

       

        for (Producto producto : listadeProductos) {
            System.out.println(producto.toString());

        }
       //System.out.print(listadeProductos); Esta es otra forma de imprimirlo ahorro el for pero se imprime un poco diferente.

        java.util.Collections.sort(listadeProductos); // collection sort va a utilizar por detrás el compareTo
        Producto productoMayor = listadeProductos.get(listadeProductos.size() - 1);
        Producto productoMenor = listadeProductos.get(0);
        System.out.println("\n"+"=================================="+"\n");

        if (productoMayor.getPrecio() == productoMenor.getPrecio()) {

            System.out.println("Parece que todos los precios son iguales");
        } else {
            System.out.println("Producto mas caro : " + productoMayor.getNombre());
            System.out.println("Producto mas barato : " + productoMenor.getNombre());
        }
    }
}