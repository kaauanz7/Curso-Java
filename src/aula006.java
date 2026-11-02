import java.util.Scanner;

public class aula006 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       System.out.println("Quantas pernas? 1, 2 , 4, 6/8 , ou outro?");
       int pernas = teclado.nextInt();
       String tipo;
       switch (pernas) {
           case 1:
               tipo = "Saci";
               break;
           case 2:
               tipo = "Bípede";
               break;
           case 4:
               tipo = "Quadrépede";
               break;
           case 6,8:
               tipo = "Aranha";
               break;
           default:
               tipo = "ET";
               break;
       }

       System.out.println(tipo);
   }
}
