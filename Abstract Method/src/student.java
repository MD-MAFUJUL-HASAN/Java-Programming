abstract class student {
	public String name;
	public String ID;
	public void display() {
            System.out.println("Student Name = "+ name);
            System.out.println("ID = "+ ID);
	}
}
class information extends student {
	public static void main(String[] args) {
            information obj = new information();
            obj.name = "MD MAFUJUL HASAN";
            obj.ID = "CSE1903018137";
            obj.display();
	}
}