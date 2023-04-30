import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String operacao = """
                Escolha a operação desejada:
                1- Adição
                2- Subtração
                3- Multiplicação
                4- Divisão
                0- Sair
                """;

        int operacaoEscolhida = -1; // inicializa com um valor inválido

        while (operacaoEscolhida != 0) {
            System.out.println(operacao);
            operacaoEscolhida = scan.nextInt();

            if (operacaoEscolhida == 0) {
                System.out.println("Saindo...");
                break; // sai do loop while
            }

            System.out.println("Digite os valores de x para a operação: ");
            double x = scan.nextDouble();
            System.out.println("Digite os valores de y para a operação: ");
            double y = scan.nextDouble();

            double resultado = 0;
            switch (operacaoEscolhida) {
                case 1 -> resultado = adicao(x, y);
                case 2 -> resultado = subtracao(x, y);
                case 3 -> resultado = multiplicacao(x, y);
                case 4 -> resultado = divisao(x, y);
                default -> System.out.println("Opção inválida!");
            }

            System.out.println("O resultado da operação escolhida é: " + resultado);
        }
    }

    public static double adicao(double x, double y) {
        return x + y;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        return x / y;
    }
}
