import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma String: ");
        String srt = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < srt.length(); i++) {
            char temA = srt.charAt(i);

            if (temA == 'a' || temA == 'A') {
                contador ++;
            }
        }

        if (contador != 0) {
            System.out.println("A letra 'a' aparece na String " + contador + " vezes.");
        } else {
            System.out.println("A String não contêm a letra 'a'.");
        }

        sc.close();
    }
}
