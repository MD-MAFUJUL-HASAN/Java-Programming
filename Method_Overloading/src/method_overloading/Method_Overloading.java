
package method_overloading;


public class Method_Overloading {

    static int num(int x, int y)
    {
        return x+y;
    }
    static double num(double x, double y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        int a = num(15,7);
        double b = num(6.5,8.3);
        System.out.println("Int = "+a);
        System.out.println("Double = "+b);
    }
    
}
