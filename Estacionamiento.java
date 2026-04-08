import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -- Ingreso de hora de entrada --//
        System.out.print("Ingrese hora de ingreso (HH): ");
        int horaEntrada = scanner.nextInt();

        // -- Ingreso hora de salida --//
        System.out.print("Ingrese hora de egreso (HH): ");
        int horaSalida = scanner.nextInt();
        scanner.nextLine(); 

        // -- Ingrese patente --//
        System.out.print("Ingrese patente (Ej. AA123AA): ");
        String patente = scanner.nextLine();

        // Cálculo de horas//
        int horasCobradas = horaSalida - horaEntrada;

        // Calcular tarifa//
        int total;

        if (horasCobradas >= 5) {
            total = 1500;
        } else if (horasCobradas == 1) {
            total = 500;
        } else {
            total = 500 + (horasCobradas - 1) * 300;
        }

        // Mostrando resultados//
        System.out.println("========== Ticket Estacionamiento ==========");
        System.out.println("Patente: " + patente);
        System.out.println("Hora entrada: " + horaEntrada);
        System.out.println("Hora salida: " + horaSalida);
        System.out.println("Horas cobradas: " + horasCobradas);
        System.out.println("Total a cobrar: $" + total);
        System.out.println("============ Gracias por elegirnos ============");

        scanner.close();
    }
}