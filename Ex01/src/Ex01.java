import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean loop = true;
        boolean respostaValida = false;
        double x1, y1, x2, y2, distancia;
        String resposta;

        while (loop) {
            try {
                // Entrada das primeiras coordenadas
                System.out.print("Digite a coordenada x1: ");
                x1 = ler.nextDouble();
                System.out.print("Digite a coordenada y1: ");
                y1 = ler.nextDouble();

                // Entrada das segundas coordenadas
                System.out.print("Digite a coordenada x2: ");
                x2 = ler.nextDouble();
                System.out.print("Digite a coordenada y2: ");
                y2 = ler.nextDouble();

                // Cálculo da distância
                distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.printf("A distância entre os pontos é: %.2f%n", distancia);

                // Perguntar se quer continuar
                while (!respostaValida) {
                    System.out.print("Deseja calcular novamente? (S/N): ");
                    resposta = ler.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        loop = false;
                        respostaValida = true;
                        System.out.println("Programa encerrado.");
                    } else if (resposta.equalsIgnoreCase("S")) {
                        respostaValida = true;
                        // Continua o loop
                    } else {
                        System.out.println("Resposta inválida! Digite apenas S ou N.");
                    }
                }

            } catch (InputMismatchException erro) {
                System.out.println("Entrada inválida! Digite apenas números.");
                ler.nextLine(); // limpa o buffer
            }
        }

        ler.close();
    }
}