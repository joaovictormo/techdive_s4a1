package primeirospassos;

import java.util.Locale;
import java.util.Scanner;

public class OlaMundao {



    public static void main(String[] args) {

        long numeroBastanteLongo = 214748369;
        long outroNumeroBastanteLongo = 2147483699l;
        Long maisUmNumeroBastanteLongo = 21474836l;

        Float numeroDecimal = 3.8f;
        float outroNumeroDecimal = (float) 3.8;

        int altura = (int) 1.75;
        double idade = 30;
        int idadeInteger = (int) idade;
        double alturaDecimal = 1.750;

        System.out.println("Minha altura é: " + alturaDecimal);
        System.out.println(idade);
        System.out.println(idadeInteger);
        char primeiraLetraDoNome = 'J';
        String nome = "João Victor";
        String sobrenome = "Mendes de Oliveira";
        String nomeCompleto = nome + " " + sobrenome;

        System.out.printf("A altura de %s formatada é: %.2f%n", nomeCompleto, alturaDecimal);
        System.out.format("A altura de %s formatada é: %.2f%n", nomeCompleto, alturaDecimal);

        System.out.print(primeiraLetraDoNome);
        System.out.printf("%n%s%n%s%n", nome, sobrenome);

        Scanner entrada = new Scanner(System.in);

        /*System.out.print("Digite a cidade onde você mora: ");
        String cidade = entrada.nextLine();
        System.out.print("Digite o seu peso: ");
        double peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite o seu ano de nascimento: ");
        int anoDeNascimento = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite um número inteiro muito grande: ");
        long numeroMuitoGrande = Long.parseLong(entrada.nextLine());

        System.out.printf("A sua cidade é: %s%n", cidade);
        System.out.printf("Seu peso é: %.3f%n", peso);
        System.out.printf("Seu ano de nascimento é: %d%n", anoDeNascimento);
        System.out.printf("Número muito grande é: %d%n", numeroMuitoGrande);*/


        int idadeDoUsuario = 30;
        String idadeStr = String.valueOf(idadeDoUsuario);
        String idadeStr2 = Integer.toString(idadeDoUsuario);
        System.out.println(idadeStr);
        System.out.println(idadeStr2);

        String txtMinusculo = "MInUsCuLo";

        double dinheiroNaCarteira = Double.parseDouble("50");
        System.out.println(dinheiroNaCarteira);
        System.out.println("Cinco".length());
        System.out.println("maiusculo".toUpperCase());
        System.out.println(txtMinusculo.toLowerCase());
        txtMinusculo = txtMinusculo.toLowerCase();
        System.out.println(txtMinusculo);
        System.out.println("    Espaços   Mais Espaços     ".trim());

        boolean ehIgual = nome.equals("joão victor");
        System.out.println(ehIgual);
        ehIgual = nome.equalsIgnoreCase("joão victor");
        System.out.println(ehIgual);

        System.out.println(nome.charAt(0));
        System.out.println(nome.indexOf('o'));
        System.out.println(nome.lastIndexOf('o'));
        System.out.println(nome.replace('o', 'u'));
        nome = nome.replace('o', 'u');
        System.out.println(nome);
        System.out.println(nome.substring(1));
        System.out.println(nome.substring(1, 4));

        System.out.println("".isBlank());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
    }
}
