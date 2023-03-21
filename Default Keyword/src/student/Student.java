
package student;

class Student {

    String fname = "MD MAFUJUL";
    String lname = "HASAN";
    String id = "CSE1903018137";
    
    public static void main(String[] args) {
        Student x = new Student();
        System.out.println("Name : " + x.fname + " " + x.lname);
        System.out.println("ID : " + x.id);
    }
    
}
