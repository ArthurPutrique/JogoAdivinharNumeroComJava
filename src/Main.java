import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Tente adivinhar um número de 0 a 100: ");
            numeroDigitado = numero.nextInt();
            System.out.println(tentativas);
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, Você acertou o número! com " + tentativas + " Tentativas.");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Está perto, Chuta mais alto...");
            } else {
                System.out.println("Está longe, Chuta mais baixo...");
            }
        }

        if (numeroDigitado == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Esgotou suas chances, o Número era " + numeroGerado);
        }
    }
}
