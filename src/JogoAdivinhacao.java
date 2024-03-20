import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número de 0 a 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Excelente!!! Acertou!");
            } else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o número gerdo");
            } else {
                System.out.println("O número digitado é maior que o número gerdo");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar! Que pena");
        }

    }
}
