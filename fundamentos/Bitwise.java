package fundamentos;

public class Bitwise {
    public static void main(String[] args){
        System.out.println("Operador |");
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value2, binary2);
        var result =  value1 | value2;
        var binaryresult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (respresentação binária %s)\n", value1, value2, result, binaryresult);
        /*
        0 = false
        1 = false
        | - o operador or sempre retorna 1 se um dos dois bits forem 1
        6 - bin = 110 | 5 - bin = 101
        110
        101
'       =
        111
        */

        System.out.println("\nOperador &");
        var value3 = 6;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value3, binary3);
        var value4 = 2;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value4, binary4);
        var result2 =  value3 & value4;
        var binaryresult2 = Integer.toBinaryString(result2);
        System.out.printf("%s & %s = %s (respresentação binária %s)\n", value3, value4, result2, binaryresult2);
        /*
        0 = false
        1 = false
        & - o operador and retorna 1 somente se os dois bits forem 1
        6 - bin = 110 & 5 - bin = 101
        110
        101
'       =
        100
        ----------------------------
        6 - bin = 110 & 2 - bin = 010
        110
         10 - há um 0 à esquerda para completar os 3 bits (mas todos os números são representados por 32 bits, então há muitos zeros à esquerda)
        =
        010
        */

        System.out.println("\nOperador ^");
        var value5 = 6;
        var binary5 = Integer.toBinaryString(value5);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value5, binary5);
        var value6 = 2;
        var binary6 = Integer.toBinaryString(value6);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value6, binary6);
        var result3 =  value5 ^ value6;
        var binaryresult3 = Integer.toBinaryString(result3);
        System.out.printf("%s ^ %s = %s (respresentação binária %s)\n", value5, value6, result3, binaryresult3);
        /*
        6 - bin = 110 ^ 2 - bin = 010 - o operador xor retorna 1 somente se um dos bits for 1, mas não ambos
        110
         10
         =
        100
        */

        //~%s - o operador ~ é o operador de negação, ele inverte os bits, ou seja, onde tem 0 vira 1 e onde tem 1 vira 0
        System.out.printf("~%s = %s (respresentação binária %s)\n", value5, ~value5, Integer.toBinaryString(~value5));
        /*
        00000000000000000000000000000110 - 6
        11111111111111111111111111111001
        */

        //Desloca os bytes para a esquerda, ou seja, os bits são deslocados para a esquerda e os bits que saem pela esquerda são descartados e os bits que entram pela direita são preenchidos 
        // com 0
        System.out.println("\nOperador << (shift left - deslocamento de bytes)");
        var value7 = 9;
        var binary7 = Integer.toBinaryString(value7);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value7, binary7);
        var value8 = 2;
        var binary8 = Integer.toBinaryString(value8);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value8, binary8);
        var result4 =  value7 << value8;
        var binaryresult4 = Integer.toBinaryString(result4);
        System.out.printf("%s << %s = %s (respresentação binária %s)\n", value7, value8, result4, binaryresult4);

        //
        System.out.println("\nOperador >> (shift right - deslocamento de bytes)"); //se for um número negativo, completa à esquerda com números 1's
        var value9 = -8;
        var binary9 = Integer.toBinaryString(value9);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value9, binary9);
        var value10 = 2;
        var binary10 = Integer.toBinaryString(value10);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value10, binary10);
        var result5 =  value9 >> value10;
        var binaryresult5 = Integer.toBinaryString(result5);
        System.out.printf("%s >> %s = %s (respresentação binária %s)\n", value9, value10, result5, binaryresult5);
        /*
        1000 = 8
        >>
        0010
        ---------------------------------------------------
        11111111111111111111111111111000 = -8
        11111111111111111111111111111110 = deslocando para à direita

        */
        System.out.println("\nOperador >>> "); 
        var value11 = -12;
        var binary11 = Integer.toBinaryString(value11);
        System.out.printf("Primeiro número da operação: %s (representação binária %s)\n", value11, binary11);
        var value12 = 2;
        var binary12 = Integer.toBinaryString(value12);
        System.out.printf("Segundo número da operação: %s (representação binária %s)\n", value12, binary12);
        var result6=  value11 >>> value12;
        var binaryresult6 = Integer.toBinaryString(result6);
        System.out.printf("%s >>> %s = %s (respresentação binária %s)\n", value11, value12, result6, binaryresult6);

    }
}
