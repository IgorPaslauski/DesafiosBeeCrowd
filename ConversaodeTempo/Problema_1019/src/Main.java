import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtdNotas = centavos / (nota * 100);
            System.out.printf("%d nota(s) de R$ %d.00\n", qtdNotas, nota);
            centavos %= nota * 100;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int qtdMoedas = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda / 100.0);
            centavos %= moeda;
        }
    }
}