package fundamentos;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmanciped = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmanciped && age >= 16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);


        /*System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", !isWrong);

        var result = scanner.nextInt();
        System.out.printf("O resultado é 4, você acertou? (%s)", result == 4);*/
    }

}
