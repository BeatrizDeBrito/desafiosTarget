public class Soma {
    public static void main(String[] args) {
        int K = 0;
        int indice = 13;
        int soma = 0;
        do {
            K= K + 1;
            soma = soma + K;
        }while (K < indice);
            System.out.println("O valor da variável soma é: " + soma);
    }
}
