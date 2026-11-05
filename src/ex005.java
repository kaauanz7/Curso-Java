import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para iniciar a contagem: ");
        int contador = teclado.nextInt();
        System.out.println("Digite um número para terminar a contagem: ");
        int fim = teclado.nextInt();

        for (; contador <= fim; contador += 1) {
            System.out.println(contador);
        }


        System.out.println("Digite um número e irei te mostrar sua tabuada:");
        int numero = teclado.nextInt();

        for (int contador2 = 0; contador2 <= 10; contador2 +=1) {
            int resultado = numero * contador2;
            System.out.printf("%d x %d = %d%n", numero, contador2, resultado);
        }


        System.out.println("Crie uma senha númerica: ");
        int senha = teclado.nextInt();

        int senha2;

        do {
            System.out.println("Confirme sua senha: ");
            senha2 = teclado.nextInt();
            if (senha != senha2) {
                System.out.println("SENHA INCORRETA");
            }
        } while (senha != senha2);

        System.out.println("SENHA CORRETA");


        int contador3 = 1;
        int par = 0;
        int impar = 0;
        int soma = 0;

        for (; contador3 <= 10; contador3 +=1) {
            System.out.println("Digite um número");
            int numeros = teclado.nextInt();

            if (numeros % 2 == 0) {
                par += 1;
            } else {
                impar +=1;
            }

            soma += numeros;
        }
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
        System.out.println("Soma dos números: " + soma);

        double saldo = 1000.00;
        int escolha;
        double deposito;
        double saque;

        do {
            System.out.println("1 - Consultar saldo \n" +
                    "2 - Depositar \n" +
                    "3 - Sacar \n" +
                    "4 - Sair");

            System.out.println("Insira o número: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.println("Quanto deseja depositar?");
                    deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                    break;

                case 3:
                    System.out.println("Quanto deseja sacar?");
                    saque = teclado.nextDouble();

                    if (saque > saldo) {
                        System.out.println("SALDO INDISPONÍVEL");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saldo novo: R$ %.2f%n", saldo);
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 4);

        System.out.println("Saiu do sistema.");

        System.out.println("Digite um número para a contagem: ");
        int contador4 = teclado.nextInt();
        int fim2 = 0;
        int inicio = fim2;
        int fim3 = contador4;

        while (contador4 >= fim2) {
            System.out.println(contador4);
            contador4 -= 1;
        }

            for (; inicio <= fim3; inicio += 1) {
                System.out.println(inicio);
            }


        int multiplicando = 1;

        for (; multiplicando <= 10; multiplicando += 1){
            int multiplicador = 1;
            for (; multiplicador <= 10; multiplicador += 1){
                int res = multiplicando * multiplicador;
                System.out.printf("%d x %d = %d%n", multiplicando, multiplicador, res);
            }
        }

        int numeroSecreto = 37;
        int tentativa;
        int tentativas;

        do {
            System.out.println("TENTE ACERTAR O NÚMERO SECRETO:");
            tentativa = teclado.nextInt();
            tentativas += 1;
            if (tentativa > numeroSecreto) {
                System.out.println("Muito Alto!");
            } else if (tentativa < numeroSecreto) {
                System.out.println("Muito Baixo!");
            }
        }while (tentativa != numeroSecreto);

        System.out.println("ACERTOU O NÚMERO");
        System.out.println("Tentativas: " + tentativas);
    }
}
