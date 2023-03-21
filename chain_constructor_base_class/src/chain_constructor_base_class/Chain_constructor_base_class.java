
package chain_constructor_base_class;

class base{
    base(){
        this(80, 90);  
        System.out.println("MD MAFUJUL HASAN");
    }   
    base(int x, int y){
        System.out.println("Sonargaon University");
    }
}
class Prototype extends base 
    { 
    Prototype()  
    {  
    this("Java", "Python");  
    System.out.println("Gazipur");  
    }    
    Prototype(String str1, String str2)  
    {  
    super();  
    System.out.println("CSE1903018137");  
    }  
}

public class Chain_constructor_base_class {

    public static void main(String args[]){
            Prototype example = new Prototype();
    }
}
