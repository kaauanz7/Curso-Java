import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma classe:\n" +
                "1 - Guerreiro\n" +
                "2 - Mago\n" +
                "3 - Arqueiro\n" +
                "4 - Ladino");
        int escolha = teclado.nextInt();
        String classe_escolhida;
        switch (escolha) {
            case 1:
                classe_escolhida = "Guerreiro";
                break;
            case 2:
                classe_escolhida = "Mago";
                break;
            case 3:
                classe_escolhida = "Arqueiro";
                break;
            case 4:
                classe_escolhida = "Ladino";
                break;
            default:
                classe_escolhida = "Nenhuma das opções";
                break;
        }
        System.out.println(classe_escolhida);
    }
}
