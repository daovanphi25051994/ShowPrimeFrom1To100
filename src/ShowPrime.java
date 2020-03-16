import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want print prime from 1 to  ? : ");
        int max = scanner.nextInt();
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
