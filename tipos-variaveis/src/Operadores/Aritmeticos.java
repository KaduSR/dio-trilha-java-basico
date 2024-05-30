package Operadores;

public class Aritmeticos {

    public static void main(String[] args) {
        // classe Operadores.java
        double soma = 10.5 + 15.7;
        System.out.println(soma);

        int subtracao = 113 - 25;
        System.out.println(subtracao);

        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);

        int divisao = 15 / 3;
        System.out.println(divisao);

        int modulo = 18 % 3;
        System.out.println(modulo);

        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.println("O resultado é: " + concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // resultado: 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // resultado: 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // resultado: 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // resultado: 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // resultado: 13

    }

}
