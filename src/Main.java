import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //salário mínimo em 2024
        final double SALARIO_MINIMO = 1412.00;

        //Scanner
        Scanner scanner = new Scanner(System.in);

        // Input do user
        System.out.print("Informe o seu salário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        // Calculo
        double quantidadeSalariosMinimos = salarioUsuario / SALARIO_MINIMO;

        // Resultado
        System.out.printf("Você recebe %.2f salários mínimos.\n", quantidadeSalariosMinimos);

        // Fecha o scanner
        scanner.close();


        }
    }
