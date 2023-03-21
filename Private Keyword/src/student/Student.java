
package student;

public class Student {
    private String fname = "MD MAFUJUL";
    private String lname = "HASAN";
    private String department = "Computer Science & Engineering";
    private String id = "CSE1903018137";
    private String section = "18A2";
    
    void display(){
        System.out.println("Name : " + fname + " " + lname);
        System.out.println("Department : "+ department);
        System.out.println("ID : " + id);
        System.out.println("Section : " + section);
    }
    
    public static void main(String[] args) {
        Student x = new Student();
        x.display();
    }
}
    
