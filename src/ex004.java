import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Escolha um número:");
        int n1 = teclado.nextInt();
        System.out.println("Escolha outro número");
        int n2 = teclado.nextInt();

        System.out.println("Escolha uma das operações:\n" +
                "+\n" +
                "-\n" +
                "*\n" +
                "/");

        char operador = teclado.next().charAt(0);
        double resultado = 0.0;

        switch (operador){
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 == 0){
                    System.out.println("Não é possível dividir por 0");
                    return;
                } else {
                    resultado = (double) n1 / n2;
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println(resultado);
    }
}
