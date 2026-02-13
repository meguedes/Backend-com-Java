//Exercício 1 sobre classes e encapsulamento
package fundamentos;
import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(0);

        while(true){
            minhaConta.menu();
            System.out.print("Escolha uma opção: ");
            var op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("R$ %.2f\n", minhaConta.consultarSaldo());
                    break;
                case 2:
                    System.out.printf("R$ %.2f",minhaConta.consultarCheque());
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    var dep = scanner.nextDouble();
                    minhaConta.deposito(dep);
                    break;
                case 4:
                    System.out.print("Digite o valor do saque: ");
                    var saq = scanner.nextDouble();
                    minhaConta.saque(saq);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto");
                    var boleto = scanner.nextDouble();
                    minhaConta.pagarBoleto(boleto);
                    break;
                case 6:
                    minhaConta.VerificarUsoCheque();
                default:
                    System.out.println("Opção inválida\n");
                }
            
            if(op == 0){
            break;
            }
        }
        
    }
}
