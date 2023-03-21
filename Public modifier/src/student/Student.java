
package student;

public class Student {
    public String fname = "MD MAFUJUL";
    public String lname = "HASAN";
    public String id = "CSE1903018137";
    
    public static void main(String[] args) {
        Student x = new Student();
        System.out.println("Name : " + x.fname + " " + x.lname);
        System.out.println("ID : " + x.id);
    }
}
    
