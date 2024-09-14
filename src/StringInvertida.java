import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String entrada = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(entrada);

        System.out.println("String invertida: " + invertida);

    }
    public static String inverterString(String strtemp) {
        String invertida = "";

        for (int i = strtemp.length() - 1; i >= 0; i--) {
            invertida += strtemp.charAt(i);
        }
        return invertida;
    }
}
