    import java.util.Scanner;

public class aprobado {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ingrese nota entre 0 y 10 ");
   double nota = scanner.nextDouble();
if (nota<0 || nota >10) {
       System.out.print("nota invalida ");
   
}
else if (nota>=9){
           System.out.print("nota MUY BIEN ");
}
else if (nota >=5){
     System.out.print("con lo justo ");
}
else {      System.out.print("reprobado");
}
   scanner.close(); 

}

}