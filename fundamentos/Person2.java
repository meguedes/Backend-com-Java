package fundamentos;

public record Person2(String name, int age) {//Todo atributo declarado nos parâmetros do record é privado

    public String getInfo(){
        return "Nmae: " + name + " age: " + age;
    }

    //Construtor secundário
    public Person2(String name){
        this(name, 1);
    }

} 
    
