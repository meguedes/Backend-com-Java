package fundamentos;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        var opition = scanner.nextInt();

        /*switch(opition){
            //case 1:
                //System.out.println("Domingo");
                //break;
            case 1:
            case 7:
                System.out.println("Fim de semana \\o/");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            //case 7:
                //System.out.println("Sábado");
                //break;
            default:
                System.out.println("Opção inválida");
        }*/

        //Outra forma de trabalhar com switch-case - o break não se faz necessário
        /*switch (opition){
            case 1, 7 -> System.out.println("Fim de semana \\o/");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            //case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");
        }*/
        var message = switch (opition){
            case 1, 7 -> {
                var day = opition == 1 ? "domingo" : "sábado";
                yield String.format("Hoje é %s, fim de semana \\o/", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 ->"Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default ->"Opção inválida";
        };
        System.out.println(message);
    }
    
}
