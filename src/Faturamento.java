import java.util.Locale;

public class Faturamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double faturamentoTotal = sp + rj + mg + es + outros;

        double percentualSP = ((sp / faturamentoTotal) * 100);
        double percentualRJ = ((rj / faturamentoTotal) * 100);
        double percentualMG = ((mg / faturamentoTotal) * 100);
        double percentualES = ((es / faturamentoTotal) * 100);
        double percentualOutros = (outros / faturamentoTotal) * 100;

        System.out.print("Percentual de representação por estado:\n");

        System.out.printf("SP: %.1f%%\n", percentualSP);
        System.out.printf("RJ: %.1f%%\n", percentualRJ);
        System.out.printf("MG: %.1f%%\n", percentualMG);
        System.out.printf("ES: %.1f%%\n", percentualES);
        System.out.printf("Outros: %.1f%%\n", percentualOutros);

    }
}
