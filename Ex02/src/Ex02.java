import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    int A, B, C, R, S, D; 
    String resposta;
    boolean loop = true;
    
    
    while (loop) {
        try {
            // Entradas dos valores
            do { System.out.print("Digite o valor de A: ");
            A = ler.nextInt();
            if (A < 0) System.out.println("O número deve ser positivo!");
            } while (A < 0);
            
            do { System.out.print("Digite o valor de B: ");
            B = ler.nextInt();
            if (B < 0) System.out.println("O número deve ser positivo!");
            } while (B < 0);

            do { System.out.print("Digite o valor de C: ");
            C = ler.nextInt();
            if (C < 0) System.out.println("O número deve ser positivo!");
            } while (C < 0);

            //Calculo da expressão
            //D = (int) (Math.pow(A + B, 2) + Math.pow(B + C, 2))/2; (Mesma coisa que o calculo abaixo, porém bem menor)
            R = (int) (Math.pow(A + B, 2));
            S = (int) (Math.pow(B + C, 2));
            D = (R + S)/2;
            System.out.println("O resultado da expressão é: " + D);

            //Perguntar se quer continuar
            boolean finalizar = false;
            while (!finalizar) {
                System.out.print ("Deseja contiuar? (S/N)");
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
                System.out.println("Entrada inválida, digite apenas números!");
                ler.nextLine();
            }
        } ler.close();
    }
    
}
