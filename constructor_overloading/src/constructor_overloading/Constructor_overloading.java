
package constructor_overloading;

public class Constructor_overloading {

    int year;
    String id,name,contuctNo,universityName;
    Constructor_overloading(String contuctNo, String universityName, int year){
        this.contuctNo = contuctNo;
        this.universityName = universityName;
        this.year = year;
    }
    
    public Constructor_overloading(String id, String name){
        this("01932771015", "Sonargaon University", 2022);
        this.id = id;
        this.name =name;
    }
    
    public static void main(String[] args) {
        Constructor_overloading s = new Constructor_overloading("CSE1903018137" , "MD MAFUJUL HASAN");
        System.out.println("Printing Student Information: \n");
        System.out.println("Name: "+s.name+"\nID: "+s.id+"\nContuct No.: "+s.contuctNo+
                "\nUniversity Name: "+s.universityName+"\nYear: "+s.year);
    }
    
}
