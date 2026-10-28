public class aula003 {
    public static void main(String[] args) {
        float n1 = 2;
        float n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média é igual a " + media);

        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(numero);
        System.out.println(valor);

        double pi = Math.PI;
        System.out.println(pi);

        double resultado = Math.pow(2,5);
        System.out.println(resultado);

        double resultado1 = Math.sqrt(25);
        System.out.println(resultado1);

        double resultado2 = Math.cbrt(91);
        System.out.println(resultado2);

        int aleatorio = (int) (Math.random()* 101);
        System.out.println(aleatorio);
    }
}
