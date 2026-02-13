package fundamentos;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial = 0;

    public ContaBancaria(double s){
        this.saldo = s;
        if(s >= 0 && s <= 500.00){
            chequeEspecial = 50.00;
        }
        else if(s > 500.00){
            chequeEspecial = s * 0.50;
        }
    }

    public void menu(){
        System.out.println("Serviços do Banco Pônei\n1 - Consultar saldo;\n2 - Consultar cheque especial;\n3 - Depositar dinheiro;\n4 - Sacar dinheiro;\n5 - Pagar um boleto;\n6 - Verificar se a conta está usando cheque especial.\n");
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public double consultarCheque(){
        return this.chequeEspecial;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valorSaque){
        if (valorSaque <= (saldo + chequeEspecial)){
            saldo -= valorSaque;
        }
        else{
            System.out.printf("Seu saldo é insuficiente.");
        }
    }

    public void pagarBoleto(double boleto){
        if(boleto <= (saldo + chequeEspecial)){
            saldo = saldo - boleto;
        }
        else{
            System.out.printf("Seu saldo é insuficiente.");
        }
    }

    public void VerificarUsoCheque(){

    }

    public boolean ischequeEspecial(){
        return this.saldo < 0;
    }
    
}
