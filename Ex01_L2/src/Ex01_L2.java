import java.util.Scanner;

public class Ex01_L2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float indice;


        boolean loop = true;
        while (loop) {
        try {
            //Entrada
            do { System.out.print("Digite o índece de poluição: ");
            indice = ler.nextFloat();
            if (indice < 0) System.out.println("Entrada inválida, digite apenas números positivos!");
            } while (indice < 0);

            //Calculo e resultado
            if (indice < 0.30) {
                System.out.println("Situação aceitável, nenhuma indústria paralisa.");
            } else if (indice >= 0.30 && indice < 0.40) {
                System.out.println("Indústrias do grupo 01 devem suspender as atividades!");
            } else if (indice >= 0.40 && indice < 0.50) {
                System.out.println("Indústrias do grupo 01 e 02 devem suspender as atividades!");
            } else if (indice >= 0.50) {
                System.out.println("Indústrias dos 03 grupos devem suspender as atividades!");
            }

            //Perguntar se quer continuar
            boolean finalizar = false;
            while (!finalizar) {
                System.out.print("Deseja refazer com um novo índice? Aperte S se SIM, caso contrário, aperte N: ");
                String resposta = ler.next();
                if (resposta.equalsIgnoreCase("N")) {
                    finalizar = true;
                    loop = false;
                    System.out.print("Programa encerrado!");
                } else if (resposta.equalsIgnoreCase("S")) {
                    finalizar = true;
                } else {
                    System.out.println("Não reconheço esse valor de entrada. USE APENAS S (SIM) OU N (NÃO)!!");
                }
            }
        } catch (Exception erro) {
            System.out.println("Digite apenas números ou caso esteja usando ponto, substitua por vírgula!!");
            ler.next();
        }    
        }

         







        
    }
}
