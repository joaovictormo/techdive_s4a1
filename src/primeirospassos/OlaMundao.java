package primeirospassos;


import java.time.LocalDate;
import java.util.Scanner;

public class OlaMundao {

    public static void main(String[] args) {

        char teste = 64;
        System.out.println(teste);

        double primeiroNumero = 15;
        double resultado = 23542345 % 2;

        System.out.println(resultado);

        double media = (8+7+8)/3;
        double mediaDecimal = (8+7+8)/3.0;

        System.out.println(media);
        System.out.println(mediaDecimal);

        int idade = 30;

        // idade += 1;
        idade++;

        System.out.println(--idade);
        System.out.println(idade);

        double resultPow = Math.pow(5, 2);
        System.out.println(resultPow);

        double resultSqrt = Math.sqrt(9);
        System.out.println(resultSqrt);

        double resultCbrt = Math.cbrt(27);
        System.out.println(resultCbrt);

        double resultAbs = Math.abs(-10);
        System.out.println(resultAbs);

        double resultFloor = Math.floor(29.9);
        System.out.println(resultFloor);

        double resultCeil = Math.ceil(29.1);
        System.out.println(resultCeil);

        double resultRound = Math.round(29.9);
        System.out.println(resultRound);

        System.out.println(Math.PI);

        System.out.println(Math.random());

        double rand = Math.random() * (100-10) + 10;
        int randInt = (int) (Math.random() * (100-10) + 10);
        System.out.println(rand);
        System.out.println(randInt);

        System.out.println(5>4);
        System.out.println(5<=5);
        System.out.println(10!=1);
        System.out.println(3==13);

        Scanner input = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idadeUsuario = Integer.parseInt(input.nextLine());

        if (idadeUsuario < 0) {
            System.out.println("Você precisa informar uma idade válida");
        } else {
            if (idadeUsuario >= 18) {
                System.out.println("Você é maior de idade.");
            }

            System.out.printf("Você tem %d anos de idade.%n", idadeUsuario);
        }

        String texto =  new String(" ");

        if (texto != null && !texto.isBlank()) {
            System.out.printf("texto está preenchido: %s", texto);
        }

        int mes = LocalDate.now().getMonthValue();
        String resultString;

        switch (mes) {
            case 1:
                resultString = "Janeiro";
                break;
            case 2:
                resultString = "Fevereiro";
                break;
            case 3:
                resultString = "Março";
                break;
            case 4, 5, 6:
                resultString = "Segundo trimestre";
                break;
            case 7, 8, 9, 10, 11, 12:
                resultString = "Segundo semestre";
                break;
            default:
                resultString = "Não foi possível identificar o mês.";
        }

        System.out.println(mes);
        System.out.println(resultString);

        double mediaFinal = 6.9;

        String status = mediaFinal >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(status);

        int novaIdade = 60;

        String resultadoNovaIdade = novaIdade >= 18 ? novaIdade >= 60 ? "idoso" : "adulto" : novaIdade >= 13 ? "adolescente" : "criança";

        System.out.println(resultadoNovaIdade);

        int num = 2423423;

        Boolean ehPar = num % 2 == 0;

        System.out.println(ehPar);
    }
}
