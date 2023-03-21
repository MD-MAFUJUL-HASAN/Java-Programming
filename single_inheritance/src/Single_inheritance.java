
            /*---- Single Inheritance ----*/

            class information{
                void id(){
                    System.out.println("CSE1903018137");
                }
            }
            class inheritance extends information{
                void name(){
                    System.out.println("MD MAFUJUL HASAN");
                }
            }
            public class Single_inheritance {
                public static void main(String[] args){
                        inheritance student = new inheritance();
                        student.name();
                        student.id();
                    }
            }    
              
            
            