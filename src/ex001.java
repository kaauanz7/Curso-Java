import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número e irei soma-los:");
        int n2 = teclado.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma é %d", soma);
    }
}
