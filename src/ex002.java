import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número e verificarei se é par ou impar:");
        int numero = teclado.nextInt();
        float resultado = numero % 2;

        if (resultado == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }


        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        if (idade < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

        System.out.println("Digite sua nota:");
        float nota1 = teclado.nextFloat();

        System.out.println("Digite sua nota:");
        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println(media);

        if (media < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        System.out.println("Digite um número");
        int numero1 = teclado.nextInt();

        System.out.println("Digite um número");
        int numero2 = teclado.nextInt();

        System.out.println("Digite um número");
        int numero3 = teclado.nextInt();

        int maior = numero1;

        if (maior < numero2) {
            maior = numero2;
        }
        if (maior < numero3) {
            maior = numero3;
        }

        System.out.println(maior);



        System.out.println("Digite o valor da sua compra:");
        float preco = teclado.nextFloat();

        if (preco <= 100) {
            System.out.println("Sem desconto");

        } else if (preco <= 300) {
            double desconto = preco * 0.10;
            double precofim = preco - desconto;
            System.out.printf("Preço final: %.2f", precofim);

        } else {
            double desconto2 = preco * 0.15;
            double precofim2 = preco - desconto2;
            System.out.printf("Preço final: %.2f", precofim2);
        }
    }
}


