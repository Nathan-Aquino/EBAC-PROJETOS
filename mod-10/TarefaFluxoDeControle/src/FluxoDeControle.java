import java.util.Scanner;

public class FluxoDeControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] notas = new Integer[4];
        Integer totalNotas = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Entre com a nota n(" + (i+1) + "):");
            notas[i] = scanner.nextInt();
            totalNotas += notas[i];
        }

        Integer media = totalNotas / 4;

        if(media >= 7){
            System.out.println("Aluno está aprovado!");
        } else if(media >= 5){
            System.out.println("Aluno está de recuperação!");
        } else {
            System.out.println("Aluno está reprovado!");
        }
    }
}
