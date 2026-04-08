import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        // Valor mayor
        int mayor;
        if (num1 >= num2 & num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 & num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Valor menor
        int menor;
        if (num1 <= num2 & num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 & num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("Numeros ingresados: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Numero MAYOR: " + mayor);
        System.out.println("Numero MENOR: " + menor);
   
        scanner.close();
    }
}