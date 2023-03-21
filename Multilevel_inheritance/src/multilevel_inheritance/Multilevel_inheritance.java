package multilevel_inheritance;
class student_information{
    void id(){
        System.out.println("CSE1903018137");
    }
}
class inheritance extends student_information{
    void name(){
        System.out.println("MD MAFUJUL HASAN");
    }
}
class information extends inheritance{
    void uname(){
        System.out.println("Sonargaon University");
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args){
            information student = new information();
            student.uname();
            student.name();
            student.id();
        }
}