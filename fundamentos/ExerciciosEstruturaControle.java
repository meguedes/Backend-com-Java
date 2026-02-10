package fundamentos;

import java.util.Scanner;

public class ExerciciosEstruturaControle {
    public static void main(String[] args){
        /*1 - Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular sua tabuada: ");
        var number = scanner.nextInt();
        System.out.println("===========");
        for (var i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s\n", number, i, (number*i));
        }
        System.out.println("===========");*/

        /*2 - Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC (IMC = peso/(altura*altura)) e seja exibida a mensagem de acordo com o resultado:
        * Se for menor ou igual a 18,5 "Abaixo do peso"
        * Se for entre 18,6 e 24,9 "Peso ideal"
        * Se for entre 25,0 e 29,9 "levemente acima do peso"
        * Se for entre 30,0 e 34,9 "Obesidade grau I"
        * Se for entre 35 e 39,9 "Obesidade grau II (severa)" 
        * Se for maior que 40,0 "Obesidade II (mórbida)"*/
        var scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso (ex.: 67,9): ");
        var peso = scanner.nextDouble();
        System.out.print("Digite a sua altura (ex.: 1,89): ");
        var altura = scanner.nextDouble();
        var imc = (peso / (altura * altura));
        if(imc <= 18.5){
            System.out.printf("Seu IMC é %.2f, e está abaixo do peso.", imc);
        }
        else if(imc >= 18 && imc <= 24.9){
            System.out.printf("Seu IMC é %.2f, e está no peso ideal.", imc);
        }
        else if(imc >= 25.0 && imc <= 29.9){
            System.out.printf("Seu IMC é %.2f, e está levemente acima do peso.", imc);
        }
        else if(imc >= 30.0 && imc <= 34.9){
            System.out.printf("Seu IMC é %.2f, e está em obesidade grau I.", imc);
        }
        else if(imc >= 35.0 && imc <= 39.9){
            System.out.printf("Seu IMC é %.2f, e está em obesidade grau II", imc);
        }
        else if (imc > 40.0){
            System.out.printf("Seu IMC é %.2f, e está em obesidade III (mórbida)", imc);
        }   
        
    }
}
