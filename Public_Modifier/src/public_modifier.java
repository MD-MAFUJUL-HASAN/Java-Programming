
class modifier {
    public String name;
    public String ID;

    public void display() {
        System.out.println("Student Name = "+ name);
        System.out.println("ID = "+ ID);
    }
}

public class public_modifier {
    public static void main( String[] args ) {
    	modifier student = new modifier();
    	student.name = "MD MAFUJUL HASAN";
    	student.ID = "CSE1903018137";
    	student.display();
    }
}
