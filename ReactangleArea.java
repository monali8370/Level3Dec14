//Java Program to Create a Method with 2 Parameters and without Return Type
//Explanation:Enter the length and breadth of the rectangle as input. Now we pass these values
// as parameters to the new method where we calculate the area and print the ou
import java.util.*;
public class ReactangleArea {
    public void show(double l,double b){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length:");
        l=sc.nextDouble();
        System.out.println("enter a breadth");
        b=sc.nextDouble();
        double res=l*b;
        System.out.println("the area of reactange is:"+res);
    }
}
class A{
    public static void main(String[] args) {
        ReactangleArea r=new ReactangleArea();
        r.show(4,6);

    }
}
