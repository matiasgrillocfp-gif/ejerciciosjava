import java.util.Scanner;

public class ejerciciopares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num;
System.out.print("Ingrese el numero ");
   num= scanner.nextInt();

if (num % 2==0) {
    System.out.print("NUMERO par ");
    }
else {
    System.out.print("numero impar");
   }
   scanner.close(); 

}
}