import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        while (nomeFuncionario.trim().isEmpty()) {
            System.out.println("Nome inválido. Por favor, digite o nome do funcionário:");
            nomeFuncionario = scanner.nextLine();
        }

        System.out.println("Idade do funcionário:");
        Integer idade = scanner.nextInt();

        String cargos = "";
        int index = 1;
        System.out.println("Cargo do funcionário (entre somente com a numeração):");
        for (Cargos cargo : Cargos.values()) {
            if (cargos.isEmpty()) {
                cargos = cargos + index + " - " + cargo;
            } else {
                cargos = cargos + " | " + index + " - " + cargo;
            }
            index++;
        }
        System.out.println(cargos);
        int cargo = scanner.nextInt();

        try{
            Funcionario funcionario = new Funcionario(nomeFuncionario, idade, cargo);

            Fabrica fabrica = Fabrica.fabricaEscolhida(funcionario);

            Carro carro = fabrica.criarCarro();

            System.out.println("Seu carro é um " + carro.getNome() + " com uma potência de " + carro.getPotencia());

            boolean flag = true;
            while (flag) {
                System.out.println("O que deseja fazer? (entre apenas com a numeração!)");
                System.out.println("1 - Ligar o carro | 2 - Desligar o carro | 3 - Sair do programa!");

                int estado = scanner.nextInt();

                switch (estado) {
                    case 1:
                        System.out.println(carro.ligarCarro());
                        break;
                    case 2:
                        System.out.println(carro.DesligarCarro());
                        break;
                    case 3:
                        flag = false;
                        System.out.println("Até Logo!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
