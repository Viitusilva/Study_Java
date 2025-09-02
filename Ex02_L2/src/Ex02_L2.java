import java.util.Scanner;

public class Ex02_L2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double numeros;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        int count = 0;
        String resposta;

        // Entradas
        boolean loop = true;
        while (loop) {
            try {
                while (count < 6) {
                System.out.print("Digite o " + (count + 1) + "º número (não negativo): ");
                numeros = ler.nextDouble();
                if (numeros < 0) {
                    System.out.println("Não reconheço esse valor de entrada, pois o número deve ser POSITIVO!");
                    continue; // volta para o início do loop sem aumentar o contador
                }
                // Atualiza maior e menor número
                if (numeros > maior) {
                    maior = numeros;
                }
                if (numeros < menor) {
                    menor = numeros;
                }
                count++;
                }
                // Saídas
                System.out.println("O maior valor é " + maior + " e o menor é " + menor);
                
                // Perguntar se quer continuar
                boolean finalizar = false;
                while (!finalizar) {
                    System.out.print("Deseja refazer o programa? Se SIM, aperte S, caso contrário, aperte N: ");
                    resposta = ler.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        finalizar = true;
                        loop = false;
                        System.out.print("Programa encerrado!");
                    } else if (resposta.equalsIgnoreCase("S")) {
                        finalizar = true;
                    } else {
                        System.out.println("Valor de entrada inválido. Digite apenas S (SIM) ou N (NÃO)!!");
                    }
                }
                } catch (Exception erro) {
                    System.out.println("!!!ERRO!!!  DIGITE APENAS NÚMEROS  !!!ERRO!!!");
                    ler.next();
                }    
            } ler.close();
    }
}