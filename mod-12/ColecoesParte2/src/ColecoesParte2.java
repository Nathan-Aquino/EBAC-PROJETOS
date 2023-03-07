import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ColecoesParte2 {
    public static void main (String[] args) {
        List<String> sexoFeminino = new ArrayList<String>();
        List<String> sexoMasculino = new ArrayList<String>();
        List<String> nomesL = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a lista de nomes separados por vírgula:");
        // Exemplo: Nathan,Adriana
        String nomes = scanner.nextLine();

        nomesL = Arrays.asList(nomes.split(","));

        Collections.sort(nomesL);

        System.out.println("Lista ordenada:");

        for (String nome : nomesL) {
            System.out.println(nome.trim());
        }

        System.out.println("*************************");

        System.out.println("Digite a lista de nomes, com seu respectivo sexo depois de um traço, separados por vírgula:");
        // Exemplo: Nathan-m,Adriana-f
        String nomesESexo = scanner.nextLine();

        nomesL = Arrays.asList(nomesESexo.split(","));

        for (String nomeESexo : nomesL) {
            if (nomeESexo.charAt(nomeESexo.length() - 1) == 'f') {
                String[] nome = nomeESexo.split("-");
                sexoFeminino.add(nome[0].trim());
            } else {
                String[] nome = nomeESexo.split("-");
                sexoMasculino.add(nome[0].trim());
            }
        }

        Collections.sort(sexoFeminino);
        Collections.sort(sexoMasculino);

        System.out.println("Lista feminina ordenada:");

        for (String nome : sexoFeminino) {
            System.out.println(nome);
        }

        System.out.println("Lista Masculina ordenada:");

        for (String nome : sexoMasculino) {
            System.out.println(nome);
        }
    }
}
