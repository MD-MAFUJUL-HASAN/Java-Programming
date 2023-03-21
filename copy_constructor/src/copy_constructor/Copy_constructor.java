
package copy_constructor;


public class Copy_constructor {
    String id,name;
        //Parameterized Constructor
    Copy_constructor(String sID, String sName){
        id = sID;
        name = sName;
    }
        //Copy Constructor
    Copy_constructor(Copy_constructor student){
        System.out.println("\n---Copy Constructor Running---");
        id = student.id;
        name = student.name;
    }
    String printid(){
        return id;
    }
    String printName(){
        return name;
    }
    
    public static void main(String[] args) {
        Copy_constructor student1 = new Copy_constructor("CSE1903018137", "MD MAFUJUL HASAN");
        System.out.println("ID No: "+ student1.printid());
        System.out.println("Name: "+ student1.printName());
            //passing the parameter to the copy constructor
        Copy_constructor student2 = new Copy_constructor(student1);
        System.out.println("\nID No: "+ student2.printid());
        System.out.println("Name: "+ student2.printName());
    }
    
}
