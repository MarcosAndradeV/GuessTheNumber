import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int target = new Random().nextInt(100);
        int guess = 0;
        int guessCount = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Adivinhe o número!");
        while (true) {
            System.out.println("Digite um número entre 0 e 100");
            
            guess = s.nextInt();
            guessCount++;
            
            if (guess > target) {
                System.out.println("Menor");
            } else if (guess < target) {
                System.out.println("Maior");
            } else {
                System.out.println("Parabéns o número era: " + target);
                System.out.println("Tentativas: " + guessCount);
                break;
            }
        }
        s.close();
    }
    
}