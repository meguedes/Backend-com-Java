package fundamentos;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        /*var lerEntrada = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        float salarioBruto = lerEntrada.nextFloat();
        System.out.print("Digite o adicional dos benefícios: ");
        float adicional = lerEntrada.nextFloat();

        float imposto = 0;
        if (salarioBruto >= 0.00 && salarioBruto <= 1100.0){
            imposto = 0.05F * salarioBruto;
        }
        else if (salarioBruto >= 1100.01 && salarioBruto <= 2500.0){
            imposto = 0.10F * salarioBruto;
        }
        else{
            imposto = 0.15F * salarioBruto;
        }

        float saida = (salarioBruto - imposto) + adicional;
        System.out.println(String.format("%.2f", saida));*/

        /*Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();

        String texto = solicitacao.toLowerCase();

        // TODO: Imprima o serviço AWS correspondente de acordo com as palavras-chave presentes na solicitação.
        // Dica: Use if/else if/else e o método contains para identificar o serviço correto.
        if(texto.contains("um servidor") || texto.contains("aplicacao")){
          System.out.println("EC2");
        }
        else if(texto.contains("imagens") || texto.contains("imagem") || texto.contains("videos") || texto.contains("videos") || texto.contains("arquivo") || texto.contains("arquivos")){
            System.out.println("S3");
          
        }
        else if(texto.contains("banco de dados") || texto.contains("ralacional")){
            System.out.println("RDS");
        }
        else if(texto.contains("sem servidor")){
            System.out.println("Lambda");
        }
        else{
            System.out.println("Servico desconhecido");
        }*/

        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();

        if(codigo.equals("EC2")){
            System.out.println("EC2");
        }
        else if(codigo.equals("S3")){
            System.out.println("S3");
        }
        else if(codigo.equals("Lambda")){
            System.out.println("Lambda");
        }
        else{
            System.out.println("Codigo invalido");
        }

    }
}
