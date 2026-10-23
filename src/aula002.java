import java.util.Scanner;

public class aula002 {
    public static void main(String[] args){
        float nota = 8.5f;
        System.out.print("A nota é " + nota);

        String nome = "Kauan";
        float nota2 = 9.7f;
        System.out.printf("\nA nota de %s é %.2f", nome, nota2);

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite o nome do aluno:");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do aluno:");
        Float nota3 = teclado.nextFloat();
        System.out.printf("\nA nota de %s é %.2f", nome2, nota3);
    }
}
