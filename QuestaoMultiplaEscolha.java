import java.util.Scanner;

public class QuestaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            System.out.println("\nQual estrutura é usada para repetição em Java?");
            System.out.println("a) if");
            System.out.println("b) switch");
            System.out.println("c) for");
            System.out.println("d) break");
            System.out.println("e) continue");

            System.out.print("Escolha uma opção: ");
            resposta = sc.next().toLowerCase().charAt(0);

            tentativas++;

            switch (resposta) {
                case 'c':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativas);
                    acertou = true;
                    break;
                default:
                    if (tentativas < 3) {
                        System.out.println("Resposta incorreta. Tente novamente.");
                    } else {
                        System.out.println("Resposta incorreta nas 3 tentativas.");
                    }
            }

        } while (!acertou && tentativas < 3);

        sc.close();
    }
}