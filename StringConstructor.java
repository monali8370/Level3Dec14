//Java Program to use of String Constructor
//Explanation:Constructor is used to initialize an object. Here you need to make two classes
// as Super and Sub class using Inheritance. We initialize two different strings in the
// constructors of these two classes and with the help of the object of Subclass we print
// these strings.Java Program to Allocate and Initialize Super Class Members using Constructor
public class StringConstructor {
    String s;
    StringConstructor(String s)
    {
        System.out.println(this.s = s);
    }
}
class StringClass extends StringConstructor
{
    StringClass(String s)
    {
        super("Monali");
        System.out.println(s);
    }
    public static void main(String[] args) {
        StringClass ob=new StringClass("Monali");
    }

}
