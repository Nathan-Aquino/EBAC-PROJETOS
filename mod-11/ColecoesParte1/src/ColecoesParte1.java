import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sexoMasculino= new ArrayList<String>();
        List<String> sexoFeminino= new ArrayList<String>();

        while (true) {
            System.out.println("Bem-vindo!");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Ver listas de pessoas");
            System.out.println("3 - Sair");

            System.out.print("Digite o número da opção escolhida: ");

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

                    if (sexo.equalsIgnoreCase("m")) {
                        sexoMasculino.add(nome);
                    } else {
                        sexoFeminino.add(nome);
                    }

                    System.out.println(nome + " Adicionado(a)!");
                } else if (escolha == 2) {
                    System.out.println("Lista Feminina:");
                    for (String nome : sexoFeminino) {
                        System.out.println("- " + nome);
                    }

                    System.out.println("Lista Masculina:");
                    for (String nome : sexoMasculino) {
                        System.out.println("- " + nome);
                    }
                } else if (escolha == 3) {
                    System.out.println("Até Logo!");
                    break;
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException excecao) {
                System.out.println("Opção inválida!");
                scanner.nextLine();
                continue;
            }
        }
    }
}
