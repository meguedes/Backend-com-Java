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
        * Se for maior que 40,0 "Obesidade II (mórbida)"
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
        }*/
        
        /*3 - Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e ímpar, com isso o código deve informar todos os
        números pares ou ímpares (de acordo com a selelção inicial) no intervalo de números informados, incluindo os números informados em ordem decrescente.
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var inicio = scanner.nextInt();
        System.out.print("Digite mais um número: ");
        var fim = scanner.nextInt();
        if (fim < inicio){
            while(inicio > fim){
                System.out.printf("Digite um número maior que %s!\n", inicio);
                System.out.print("Digite mais um número: ");
                fim = scanner.nextInt();
            }
        }
        
        System.out.print("Em ordem crescente:\n");
        for(var i = inicio; i <= fim; i++){
            System.out.printf("%s\n", i);
        }

        System.out.print("\nEm ordem decrescente:\n");
        for(var i = fim; i >= inicio; i--){
            System.out.printf("%s\n", i);
        }*/

        /*4 - Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido
        pelo primeiro tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados*/
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número incial: ");
        var num1 = scanner.nextInt();
        //while(true){
            //System.out.print("Informe um número: ");
            //var num = scanner.nextInt();
            //if(num1 > num){
                //System.out.printf("Número %s menor que %s, ignorado.\n", num, num1);
                //continue;
            //}
            //System.out.printf("%s %% %s = %s\n", num, num1, (num % num1));
            //if(num % num1 != 0){
                //break;
            //}
        //}
        //com do-while
        int num;
        do{
            System.out.print("Informe um número: ");
            num = scanner.nextInt();
            if(num1 > num){
                System.out.printf("Número %s menor que %s, ignorado.\n", num, num1);
                continue;
            }
            System.out.printf("%s %% %s = %s\n", num, num1, (num % num1));
        }while(num % num1 == 0);
        
    }
}
