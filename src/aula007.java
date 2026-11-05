public class aula007 {
   public static void main(String[] args) {
        int contador = 0;

        while (contador < 4) {
            System.out.println("Você deu uma cambalhota!");
            contador += 1;
        }

        int contador2 = 0;

        while (contador2 < 10) {
            contador2 +=1;
            if (contador2 == 5 || contador2 == 7) {
                continue;
            }
            System.out.println("Cambalhota " + contador2);
        }

       int contador3 = 0;

       while (contador3 < 10) {
           contador3 += 1;
           if (contador3 == 7) {
               break;
           }
           System.out.println("Cambalhota " + contador3);
       }

       int contador4 = 0;

       do{
           System.out.println("Cambalhota " + contador4);
           contador4 += 1;
       }while (contador4 < 4);
    }
}
