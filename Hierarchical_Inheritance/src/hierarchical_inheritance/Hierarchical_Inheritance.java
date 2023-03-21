package hierarchical_inheritance;
class student{
    void display(){
        System.out.println("CSE1903018137");
    }
}
class student1 extends student{
    void display1(){
        System.out.println("MD MAFUJUL HASAN");
    }
}
class student2 extends student1{
    void display2(){
        System.out.println("Sonargaon University");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        student2 information = new student2();
        information.display2();
        information.display1();
        information.display();
    }
}
