package fundamentos;
import java.util.Scanner;

public class OperadoresArit { //Operadores aritméticos 
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var value1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        var value2 = scanner.nextInt();
        System.out.printf("Soma usando o (%%s): %s + %s = %s\n", value1, value2, value1 + value2);
        System.out.println("Dessa forma concatena: " + value1 + " + " + value2 + " = " + value1 + value2);
        System.out.println("Soma usando ordem de precedência: " + value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.printf("Subtração: %s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("Divisão: %s / %s = %s\n", value1, value2, (float)(value1 / value2));
        System.out.printf("Resto da divisão: %s %% %s = %s\n", value1, value2, value1 % value2);
        System.out.printf("Multiplicação: %s * %s = %s\n", value1, value2, value1 * value2);

        System.out.println("Classe Math:");
        System.out.printf("Raiz quadrada: %s = %s, %s = %s\n", value1, Math.sqrt(value1), value2, Math.sqrt(value2)); //retorna double
        System.out.printf("Potência: %s elevado a %s = %s\n", value1, value2, Math.pow(value1, value2));
    }
}
