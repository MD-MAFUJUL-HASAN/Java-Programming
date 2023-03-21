
package student;

public class Student {
    protected String fname = "MD MAFUJUL";
    protected String lname = "HASAN";
    protected String department = "Computer Science & Engineering";
    protected String id = "CSE1903018137";
    protected String section = "18A2";
    
    protected void display(){
        System.out.println("Name : " + fname + " " + lname);
        System.out.println("Department : "+ department);
        System.out.println("ID : " + id);
        System.out.println("Section : " + section);
    }
}

