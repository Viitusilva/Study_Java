import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
    Scanner Ler = new Scanner(System.in);
    int anos, sobra, meses, dias, idadeDias;
    String resposta;
    boolean loop = true;

    while (loop) {
        try {
            //Entrada
            System.out.print("Digite a idade em dias: ");
            idadeDias = Ler.nextInt();

            // Cálculos
            anos = idadeDias / 365;           // Calcula anos
            sobra = idadeDias % 365;          // Sobra depois dos anos
            meses = sobra / 30;               // Calcula meses
            dias = sobra % 30;                // Sobra depois dos meses

            // Saída
            System.out.println("Idade: " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");

            //Perguntar se quer continuar
            boolean fim = false;
            while (!fim) {
                System.out.print ("Quer refazer? (S/N)");
                resposta = Ler.next();
                if (resposta.equalsIgnoreCase("N")) {
                    fim = true;
                    loop = false;
                    System.out.println("Programa encerrado!");
                } else if (resposta.equalsIgnoreCase("S")) {
                    fim = true;
                } else {
                    System.out.println("Entrada inválida, digite apenas S (sim) ou N (não)!");
                }
            }
            } catch (InputMismatchException erro) {
                    System.out.println("Entrada inválida, digite apenas números!");
                    Ler.nextLine();
            }
        } Ler.close();
    }
}
