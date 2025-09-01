import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner Ler = new Scanner (System.in);
        float n1, n2, n3, media;
        boolean loop = true;
        String respostaFinalizar;

            while (loop) {
                try {
                    //Entrada dos valores
                    do { System.out.print("Digite a PRIMEIRA nota do aluno:");
                    n1 = Ler.nextFloat();
                    if (n1 < 0) System.out.println("Entrada inválida, digite novamente a PRIMEIRA nota do aluno!");
                    } while (n1 < 0);
                    do { System.out.print("Digite a SEGUNDA nota do aluno:");
                    n2 = Ler.nextFloat();
                    if (n2 < 0) System.out.println("Entrada inválida, digite novamente a SEGUNDA nota do aluno!");
                    } while (n2 < 0);
                    do { System.out.print("Digite a TERCEIRA nota do aluno:");
                    n3 = Ler.nextFloat();
                    if (n3 < 0) System.out.println("Entrada inválida, digite novamente a TERCEIRA nota do aluno!");
                    } while (n3 < 0);
                    
                    //Calculo
                    media = (n1*2 + n2*3 + n3*5)/10;
                    if (media < 6) {
                        System.out.println("O Aluno está REPROVADO!");
                    } else {
                        System.out.println("O Aluno está APROVADO!");
                    }

                    //Perguntar se quer continuar
                    boolean finalizar = false;
                    while (!finalizar) {
                        System.out.print("Deseja refazer? Digite apenas S (sim) ou N (não)");
                        respostaFinalizar = Ler.next();
                        if (respostaFinalizar.equalsIgnoreCase("N")) {
                            finalizar = true;
                            loop = false;
                            System.out.println("Programa encerrado!");
                        } else if (respostaFinalizar.equalsIgnoreCase("S")) {
                            finalizar = true;
                        } else {
                            System.out.println("Não reconheço essa entrada, digite novamente!");
                        }
                    }
                } catch (Exception erro) {
                    System.out.println("Entrada inválida, digite apenas números!");
                    Ler.nextLine();
                }
            } Ler.close(); 
    }
}
