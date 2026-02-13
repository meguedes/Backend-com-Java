package fundamentos;
import java.util.Scanner;

public class Mainn {

    //Constantes
    private final String WELCOME_MESSAGE = "Olá, informe seu nome:"; //Pode ser passado ao println.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //outra forma: var scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome:");
        String name = scanner.next();
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();

        System.out.println("Olá " + name + " sua idade é " + age + "\n");
        //Outra forma: System.out.printf("Olá %s sua idade é %s\n", name, age);
        
    } 
}