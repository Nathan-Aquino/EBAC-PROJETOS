import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> pessoas = new ArrayList<String>();

        while (true) {
            System.out.println("Bem-vindo!");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Ver listas de pessoas");
            System.out.println("3 - Sair");

            System.out.print("Digite o número da opção escolhida: ");;

            try {
                Integer escolha = scanner.nextInt();

                if (escolha == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.next();

                    scanner.nextLine();

                    if (nome == null) {
                        System.out.println("Nome inválido!");
                        continue;
                    }

                    System.out.print("Sexo (M/F): ");
                    String sexo = scanner.nextLine();

                    if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                        System.out.println("Sexo inválido!");
                        continue;
                    }

                    pessoas.add(nome + "-" + sexo);

                    System.out.println();
                    System.out.println(nome + " Adicionado(a)!");
                    System.out.println();
                } else if (escolha == 2) {

                    List<String> listaFeminina = listaPessoas('f', pessoas);
                    List<String> listaMasculina = listaPessoas('m', pessoas);

                    System.out.println();
                    System.out.println("Lista Feminina:");
                    for (String nome : listaFeminina) {
                        System.out.println("- " + nome);
                    }
                    System.out.println();

                    System.out.println("Lista Masculina:");
                    for (String nome : listaMasculina) {
                        System.out.println("- " + nome);
                    }
                    System.out.println();
                } else if (escolha == 3) {
                    System.out.println();
                    System.out.println("Até Logo!");
                    break;
                } else {
                    System.out.println();
                    System.out.println("Opção inválida!");
                    System.out.println();
                }
            } catch (InputMismatchException excecao) {
                System.out.println();
                System.out.println("Opção inválida!");
                System.out.println();
                scanner.nextLine();
                continue;
            }
        }
    }

    public static List<String> listaPessoas (char sexo, List<String> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.matches("(?i).*-"+ sexo +".*"))
                .map((pessoa) -> {
                    String[] splitNome = pessoa.split("-");
                    return splitNome[0];
                })
                .collect(Collectors.toList());
    }
}