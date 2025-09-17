import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fezAmizade;
        int qtdAmizades, tristeza = 0, alegria = 0;

        System.out.println("Riley fez amizades na cidade?");
        fezAmizade = scanner.next();

        if (fezAmizade.equals("Sim")) {
            System.out.println("Quantas ela fez");
            qtdAmizades = scanner.nextInt();
            alegria += qtdAmizades * 10;
        } else if (fezAmizade.equals("Não")) {
            tristeza += 30;
        }

        System.out.println("Digite a primeira nota de Riley: ");
        Double a1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota de Riley: ");
        Double a2 = scanner.nextDouble();

        System.out.println("Digite a tercerira nota de Riley: ");
        Double a3 = scanner.nextDouble();

        Double media = (a1 + a2 + a3) / 3;

        if (media >= 7.00) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        System.out.println("Quantos exercicios você conseguiu fazer? ");
        int exercicios = scanner.nextInt();

        int totalExercicios = 10;
        int faltamExercicios = totalExercicios - exercicios;

        alegria += exercicios * 10;
        tristeza += faltamExercicios * 10;

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();

    }
}
