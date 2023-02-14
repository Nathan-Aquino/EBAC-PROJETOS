import java.util.Scanner;

public class Wrappers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número abaixo:");
        int numero = scanner.nextInt();

        System.out.println("Sofrendo um boxing!");
        Integer numeroTransformado = numero;

        System.out.println("seu número: " + numeroTransformado + " agora é do tipo complexo Integer!");
    }
}
