package fundamentos;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        /* ESTRUTURA - for:
         for sem configurações
        for (;;){
            System.out.println("Digite um nome: ");
            var name = scanner.next();

            if (name.equalsIgnoreCase("exit")) break;
        }

        Com configuração dentr dos parênteses
        args = new String[] {"banana", "uva", "maçã", "pera", "jaca", "melão", "melancia"};
        for (var i = 0; i < args.length; i++){
            System.out.println((i + 1) + " - " + args[i]);
        }*/

        /*ESTRUTURA - while */
        var name = "exit";
        //while(!name.equalsIgnoreCase("exit")){
            //System.out.println("Informe um nome:");
            //name = scanner.next();
            //System.out.println(name);}
        //outra forma
        //while(true){
            //System.out.println("Informe um nome:");
            //name = scanner.next();
            //System.out.println(name);

            //if (name.equalsIgnoreCase("exit")) break;
        //}
        // ESTRUTURA - do-while:
        do{
            System.out.println("Informe um nome:");
            name = scanner.next();
            System.out.println(name);

        } while(!name.equalsIgnoreCase("exit"));
    }
    
}
