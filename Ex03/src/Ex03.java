import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anos, meses, dias, totalDias;
        String resposta;
        boolean loop = true;

        while (loop) {
        try {
            // Entrada de dados
            System.out.print("Digite sua idade em anos: ");
            anos = ler.nextInt();

            System.out.print("Digite os meses: ");
            meses = ler.nextInt();

            System.out.print("Digite os dias: ");
            dias = ler.nextInt();

            // Cálculo total em dias
            totalDias = (anos * 365) + (meses * 30) + dias;

            // Saída
            System.out.println("Sua idade expressa em dias é: " + totalDias + " dias.");

            //perguntar se quer recomeçar
            boolean finalizar = false;
            while (!finalizar) {
                System.out.print ("Deseja calcular novamente? (S/N)");
                resposta = ler.next();
                if (resposta.equalsIgnoreCase("N")) {
                    finalizar = true;
                    loop = false;
                    System.out.println("Programa encerrado.");
                } else if (resposta.equalsIgnoreCase("S")) {
                    finalizar = true;
                } else {
                    System.out.println("Entrada inválida, digite apenas S (sim) ou N (não)!");
                }  
            }   
            } catch (InputMismatchException erro) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
            ler.nextLine();
            }
        } ler.close();
    } 
} 
