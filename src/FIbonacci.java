import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int entrada = scanner.nextInt();
        scanner.close();

        if(verificaFibonacci(entrada)){
            System.out.println("O número "+ entrada + " pertence á sequência Fibonacci");
        } else {
            System.out.println("O número "+ entrada + " não pertence á sequência Fibonacci");
        }
    }

    public static boolean verificaFibonacci(int n) {
        if(n <0){
            return false;
        }
        int a = 0, b = 1;
        while (a < n) {
            int temporario = a;
            a = b;
            b = temporario + b;
        }
        return a == n;
    }
}
