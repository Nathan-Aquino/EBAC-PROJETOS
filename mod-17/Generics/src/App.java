import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Generic<Carro> generic = new Generic<>();

        Uno uno = new Uno();
        ModelS modelS = new ModelS(false);

        generic.adiciona(uno);
        generic.adiciona(modelS);

        List<Carro> carros = generic.retornaLista();

        boolean flag = true;
        while (flag) {
            System.out.println("Escolha uma opção(somente o número):");
            System.out.println("1 - Uno");
            System.out.println("2 - Tesla Model S");
            System.out.println("3 - Exit");

            try {
                Integer num = scanner.nextInt();

                switch (num) {
                    case 1:
                        usarUno(scanner,carros.get(0));
                        break;
                    case 2:
                        usarModelS(scanner,(ModelS) carros.get(1));
                        break;
                    case 3:
                        System.out.println("Até Logo!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException err) {
                System.out.println("Opção Inválida!");
                scanner.nextLine();
            }
        }

    }

    public static void usarUno (Scanner scanner, Carro uno) {
        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma opção(somente o número):");
            System.out.println("1 - Ligar Uno");
            System.out.println("2 - Desligar Uno");
            System.out.println("3 - Dirigir Uno");
            System.out.println("4 - Especificações Uno");
            System.out.println("5 - Voltar");

            try {
                Integer num = scanner.nextInt();

                switch (num) {
                    case 1:
                        uno.ligarCarro();
                        break;
                    case 2:
                        uno.DesligarCarro();
                        break;
                    case 3:
                        uno.dirigir();
                        break;
                    case 4:
                        uno.especificacoes();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException err) {
                System.out.println("Opção Inválida!");
                scanner.nextLine();
            }
        }
    }

    public static void usarModelS (Scanner scanner, ModelS modelS) {
        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma opção(somente o número):");
            System.out.println("1 - Ligar Model S");
            System.out.println("2 - Desligar Model S");
            System.out.println("3 - Ativar/Desativar piloto automático do Model S");
            System.out.println("4 - Dirigir Model S");
            System.out.println("5 - Especificações Model S");
            System.out.println("6 - Voltar");

            try {
                Integer num = scanner.nextInt();

                switch (num) {
                    case 1:
                        modelS.ligarCarro();
                        break;
                    case 2:
                        modelS.DesligarCarro();
                        break;
                    case 3:
                        modelS.ativarDesativarPilotoAutomatico();
                        break;
                    case 4:
                        modelS.dirigir();
                        break;
                    case 5:
                        modelS.especificacoes();
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException err) {
                System.out.println("Opção Inválida!");
                scanner.nextLine();
            }
        }
    }
}
