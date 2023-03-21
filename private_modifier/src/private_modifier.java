
class modifier {
   private String name;
   private String id;
   
   public String getname(){
       return this.name;
   }
   
   public String getid(){
       return this.id;
   }
   
   public void setinformation(String name, String id){
       this.name = name;
       this.id = id;
   }
}

public class private_modifier {
   public static void main(String[] args ){
        modifier student = new modifier();
        student.setinformation("MD MAFUJUL HASAN", "CSE1903018137");
        System.out.println(student.getname());
        System.out.println(student.getid());
    }
}
