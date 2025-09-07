import java.util.Scanner;

public class Ex03_L2 {

    // Função que exibe a tabuada com base na operação escolhida
    public static void exibirTabuada(double numero, String operacao) {
        switch (operacao) {
            case "Soma":
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;
            case "Subtração":
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;
            case "Multiplicação":
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
                break;
            case "Divisão":
                for (int i = 1; i <= 10; i++) {
                    if (i != 0) {
                        System.out.println(numero + " / " + i + " = " + String.format("%.2f", numero / i));
                    } else {
                        System.out.println(numero + " / " + i + " = Indefinido (divisão por zero)");
                    }
                }
                break;
            default:
                System.out.println("Operação inválida! Escolha entre Soma, Subtração, Multiplicação ou Divisão.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Solicita a operação ao usuário
        System.out.print("Escolha a operação (Soma, Subtração, Multiplicação ou Divisão): ");
        scanner.nextLine();  // Limpar o buffer do scanner
        String operacao = scanner.nextLine().trim();

        // Chama a função para exibir a tabuada
        exibirTabuada(numero, operacao);

        // Fecha o scanner
        scanner.close();
    }
}
