import java.util.Scanner;

public class aula005 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        float nota1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota:");
        float nota3 = teclado.nextFloat();

        System.out.println("Digite a quarta nota:");
        float nota4 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi: " + media);

        if ( media >= 8 ) {
            System.out.println("Parabéns pelo empenho!");
        }

        System.out.println("Digite a primeira nota:");

        float nota01 = teclado.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota02 = teclado.nextFloat();

        System.out.println("Digite a terceira nota:");
        float nota03 = teclado.nextFloat();

        System.out.println("Digite a quarta nota:");
        float nota04 = teclado.nextFloat();

        float media1 = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.println("Sua média foi: " + media1);

        if ( media1 >= 8 ) {
            System.out.println("Parabéns pelo empenho!");
        } else {
            System.out.println("Precisamos melhorar sua nota!");
        }
    }
}
