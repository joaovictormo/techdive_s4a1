package primeirospassos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class OlaMundao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int rand = (int) (Math.random() * (11-5) + 5);

        Random random = new Random();
        int rand = random.nextInt(6) + 5;

        System.out.print("Adivine um número de 5 a 10: ");
        int adivinhacaoDoUsuario = Integer.parseInt(scanner.nextLine());

        while (rand != adivinhacaoDoUsuario) {
            System.out.println("Você errou!");
            System.out.print("Adivinhe um número de 5 a 10: ");
            adivinhacaoDoUsuario = Integer.parseInt(scanner.nextLine());
        }

        /*int adivinhacaoDoUsuario;

        do {
            System.out.print("Adivinhe um número de 5 a 10: ");
            adivinhacaoDoUsuario = Integer.parseInt(scanner.nextLine());
        } while (rand != adivinhacaoDoUsuario);

        System.out.println("Parabéns! Você acertou!");*/

        String primeiroNome = "João";

        for (int i = 0; i < primeiroNome.length(); i++) {
            System.out.println(primeiroNome.charAt(i));
        }

        System.out.println("fora do for");

        int[] anosDeCopa = {2022, 2018, 2014, 2010, 2006, 2002, 1998};
        String[] carros = new String[5];

        carros[0] = "uno";
        carros[1] = "sandero";
        carros[2] = "c3";
        carros[3] = "brasilia";
        carros[4] = "147";

        System.out.println("tamanho do array anosDeCopa: " + anosDeCopa.length);
        System.out.println("tamanho do array carros: " + carros.length);

        System.out.println("Primeiro item do array anosDeCopa: " + anosDeCopa[0]);
        System.out.println("Último item do array anosDeCopa: " + anosDeCopa[anosDeCopa.length - 1]);

        for (int i = 0; i < anosDeCopa.length; i++) {
            if (i == 0) {
                System.out.print(anosDeCopa[i]);
            } else {
                System.out.print(", " + anosDeCopa[i]);
            }
        }
        System.out.println("");

        Arrays.sort(anosDeCopa);

        for (int ano: anosDeCopa) {
            System.out.println(ano);
        }

        Arrays.sort(carros);

        for (String carro: carros) {
            System.out.println(carro);
        }

        int index = Arrays.binarySearch(anosDeCopa, 2022);

        System.out.println(index);

        int indexCarros = Arrays.binarySearch(carros, "c3");

        System.out.println(indexCarros);

        Arrays.fill(carros, "teste");

        for (String carro: carros) {
            System.out.println(carro);
        }

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Ana");

        System.out.println(nomes.contains("José"));

        System.out.print("Tamanho da lista de nomes: " + nomes.size() + "\n");

        nomes.add("Pedro");

        System.out.print("Tamanho da lista de nomes: " + nomes.size() + "\n");

        nomes.remove(0);
        // nomes.remove("Maria");

        System.out.println(nomes.contains("José"));

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Collections.sort(nomes);

        for (String nome: nomes) {
            System.out.println(nome);
        }

        int indexArrayList = Collections.binarySearch(nomes, "Pedro");

        System.out.println(indexArrayList);

        System.out.println(Collections.max(nomes));
        System.out.println(Collections.min(nomes));

        Collections.reverse(nomes);

        for (String nome: nomes) {
            System.out.println(nome);
        }

    }
}
