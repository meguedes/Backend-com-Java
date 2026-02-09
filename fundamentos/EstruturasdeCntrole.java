package fundamentos;
import java.util.Scanner;;

public class EstruturasdeCntrole {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? {S/N}");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        // é possível utilizar o if em apenas uma inha da código, nesse caso não é necessário utilizar "{}", caso contrário, é necessário.
        /* 
        if (age >= 18){
            System.out.println("Bem vindo(a)!");
            System.out.printf("%s, você tem %s anos e você está habilitado e pode dirigir\n", name, age);
        }else if (age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir.\n", name, age);
        }
        else{
            System.out.printf("%s, você não pode dirigir.\n", name);
        }*/
       //outra forma
       var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
       var message = canDrive ? 
                name + ", você pode dirigir\n": //se for verdade
                name + ", você não pode dirigir\n"; //se for falso
        System.out.println(message);

        System.out.println("Fim da execução.");

    }
}
