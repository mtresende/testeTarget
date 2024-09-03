import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean isFibonacci = false;
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                isFibonacci = true;
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        if (isFibonacci) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
