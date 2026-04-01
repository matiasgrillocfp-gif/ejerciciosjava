import java.util.Scanner;

public class precios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        double precioFinal;
        String descuento;

        if (precio > 5000) {
            precioFinal = precio * 0.80;
            descuento = "20%";
        } else if (precio > 2000) {
            precioFinal = precio * 0.90;
            descuento = "10%";
        } else {
            precioFinal = precio;
            descuento = "sin descuento";
        }

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Precio final: " + precioFinal);
           scanner.close(); 

    }
}