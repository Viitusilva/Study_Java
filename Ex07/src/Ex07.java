import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double custoFabrica, custoConsumidor;
        String resposta;
        boolean loop = true;

            while (loop) { 
                try {
                    //Entrada
                    do { System.out.print("Digite o custo da fábrica: ");
                    custoFabrica = ler.nextDouble();
                    if (custoFabrica < 0) System.out.println("Digite apenas números positivos!");
                    } while (custoFabrica < 0);

                    //Calculo e resposta
                    custoConsumidor = custoFabrica*1.73;
                    System.out.println("O Custo final pro consumidor é de: "+custoConsumidor);

                    //Perguntar se quer continuar

                    boolean finalizar = false;
                    while (!finalizar) {
                        System.out.print("Deseja fazer um novo calculo? (Digite S para SIM e N para NÃO)");
                        resposta = ler.next();
                        if (resposta.equalsIgnoreCase("N")) {
                            finalizar = true;
                            loop = false;
                            System.out.print("Programa encerrado!");
                        } else if (resposta.equalsIgnoreCase("S")) {
                            finalizar = true;
                        } else {
                            System.out.println("Não reconheço esse comando, digite apenas S (SIM) ou N (NÃO)!!");
                        }
                    }
                } catch (Exception erro) {
                    System.out.println("Entrada inválida, digite apenas números!");
                    ler.next();
                }
                    
                
            }
        



    }
}
