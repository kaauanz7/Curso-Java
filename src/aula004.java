import java.util.Scanner;

public class aula004 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 15;
        int maior = (n1>n2) ? 0 : 1;
        System.out.println(maior);

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
        String situacao = (media > 6 ) ? "Aprovado" : "Reprovado";

        System.out.print("Situação: " + situacao);
        System.out.printf("\nMédia Final: %.2f ", media);


        int x, y, z;
        x = 10;
        y = 12;
        z = 14;

        boolean r;
        r = (x < y && y == z) ? true : false;
        System.out.println(r);

        System.out.println("Informe a sua idade:");
        int idade = teclado.nextInt();

        String voto = (idade >= 16 && idade < 18 || idade>70)? " Voto Opcional" : "Voto Obrigatório";
        System.out.println(voto);
    }
}
