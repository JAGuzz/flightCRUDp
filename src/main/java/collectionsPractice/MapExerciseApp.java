package collectionsPractice;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class MapExerciseApp {

    public static void main(String[] args) {

        // Se simulara el escenario de una tienda de videojuegos
        System.out.println("Bienvenido a GameStore");
        Map<String, Double> inventario = new LinkedHashMap<>();


        inventario.put("Logitech H505 Mouse".toUpperCase(), 29.99);
        inventario.put("Logitech KB410 keyboard".toUpperCase(), 49.99);
        inventario.put("Machenike K500 keyboard".toUpperCase(), 29.99);
        inventario.put("Machenike GPK 105 gamepad".toUpperCase(), 24.99);
        inventario.put("AMD ryzen 5600g".toUpperCase(), 54.99);
        inventario.put("Nvidia 1660 super".toUpperCase(), 79.99);
        //inventario.put("Nvidia 1660 super".toUpperCase(), 79.99);
        //inventario.put("Nvidia 1660 super".toUpperCase(), 79.99);


        System.out.println("\nInventario actual de GameStore: \n");

        for (String articulo : inventario.keySet()) {
            System.out.println( articulo + ": $" + inventario.get(articulo));
        }

        String itemCompra = "Machenike K500 keyboard".toUpperCase() ;    //"Logitech Hero 500 Mouse";

        if (inventario.containsKey(itemCompra)){
            System.out.println("\nItem vendido: $ " + inventario.get(itemCompra) + " " + itemCompra);
        } else {
            System.out.println("Lo sentimos no tenemos existencias del articulo que busca.");
        }

        inventario.remove(itemCompra);
        inventario.replace("AMD ryzen 5600g".toUpperCase(),54.99, 49.99);


        System.out.println("Inventario actualizado:\n");

        for (String articulo : inventario.keySet()) {
            System.out.println( articulo + ": $" + inventario.get(articulo));
        }

    }
}
