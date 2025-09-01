import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float a, b, c, d, e, f, x, y;
        Boolean loop = true;
        String resposta;

        while (loop) {
            try {
                //Entradas
                System.out.print("Digite o valor de A:");     
                a = ler.nextFloat();
                System.out.print("Digite o valor de B:");     
                b = ler.nextFloat();
                System.out.print("Digite o valor de C:");     
                c = ler.nextFloat();
                System.out.print("Digite o valor de D:");     
                d = ler.nextFloat();
                System.out.print("Digite o valor de E:");     
                e = ler.nextFloat();
                System.out.print("Digite o valor de F:");     
                f = ler.nextFloat();

                //Calculos e resultado
                x = (c+e - b+f)/(a+e - b+d);
                y = (a+f - c+d)/(a+e - b+d);
                System.out.println("O Valor de X e Y é: X = "+x+" Y = "+y);

                //Perguntar se quer continuar
                boolean finalizar = false;
                while (!finalizar) {
                    System.out.print("Deseja calcular uma nova expressão? Se sim, aperte S, caso contrário, aperte N!");
                    resposta = ler.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        finalizar = true;
                        loop = false;
                        System.out.print("Programa encerrado!");
                    } else if (resposta.equalsIgnoreCase("S")) {
                        finalizar = true;
                    } else {
                        System.out.println("Não reconheço esse valor de entrada, digite APENAS S (SIM) ou N (NÃO)!");
                    }
                } 

            } 
            
            catch (Exception erro) {
                System.out.println("Não reconheço essa entrada, digite apenas números!");
                resposta = ler.next();
            }
        } ler.close();
    }
}
