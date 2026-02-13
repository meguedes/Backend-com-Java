package fundamentos;

import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        var person = new Person2("João");

        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
    
}
