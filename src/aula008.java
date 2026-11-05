public class aula008 {
    public static void main(String[] args) {
        for (int contador = 0; contador <=5; contador +=1) {
            System.out.println("Cambalhota " + contador);
        }

        for (int contador2 = 0; contador2 <=3; contador2 +=1) {
            for (int contador3 = 0; contador3 <=3; contador3 +=1) {
                System.out.println(contador2 + " " + contador3);
            }
        }
    }
}
