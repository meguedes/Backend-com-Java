package fundamentos;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExercicosFundamentos {
    public static void main(String[] args){
        /*1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem "Olá 'Fulano' você tem 'X' anos"
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        var name = scanner.next();
        System.out.print("Digite seu ano de nascimento: ");
        var year = scanner.nextInt();
        System.out.printf("Olá %s, você tem %s anos!", name, (baseYear - year));*/
        

        /* 2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela (fórmula: área = base * altura).
        var scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado: ");
        var side = scanner.nextDouble();
        var area = side * side;
        System.out.printf("A área do quadrado é: %f", area);
        */

        /*3 - Escreva um código que receba a base e a altura de um retangulo, calcule a sua área e exiba na tela (fórmula: área = base * altura). 
        var scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        var base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        var altura = scanner.nextDouble();
        var area = base * altura;
        System.out.printf("A área do retângulo é: %.2f", area);
        */

        /*4 - Escreva um código  que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        var scanner = new Scanner(System.in);
        System.out.print("Digite a primeira idade: ");
        var age1 = scanner.nextInt();
        System.out.print("Digite a segunda idade:");
        var age2 = scanner.nextInt();
        System.out.printf("A diferença das idades é: %s", Math.abs(age1 - age2));*/
    }
}
