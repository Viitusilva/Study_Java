import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int restoSegundos, segundos, horas, minutos;
        boolean loop = true;
        String resposta;

        while (loop) {
            try {
                //entrada
                do { System.out.print("Digite o tempo de duração do envento em segundos:");
                segundos = ler.nextInt();
                if (segundos < 0) System.out.println("O número deve ser positivo!");
                } while (segundos < 0);
                
                //Calculo e resultado!
                horas = segundos/3600;
                minutos =  (segundos % 3600) / 60;
                restoSegundos = segundos % 60;
                System.out.println("O tempo é de " +horas+ ":" +minutos+ ":" +restoSegundos+ "!");

                //Pereguntar se quer continuar
                boolean finalizar = false;
                while (!finalizar) {
                    System.out.print("Deseja fazer outro calculo? Digite apenas S (sim) ou N (não)!");
                    resposta = ler.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        finalizar = true;
                        loop = false;
                        System.out.print("Programa encerrado!");
                    } else if (resposta.equalsIgnoreCase("S")) {
                        finalizar = true;
                    } else {
                        System.out.println("Não reconheço esse valor de entrada, digite apenas S (sim) ou N (não)!");
                    }
                }
            } catch (Exception erro) {
                System.out.println("Entrada inválida, digite novamente!");
                ler.next();
            }
        }
    }
}
