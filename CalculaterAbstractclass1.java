//Java Program to create a calculator and apply all  features of Abstract class
//Explanation:Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods in
//parent class which are defined in child class and we can call all these methods via making object
//of child class.as abstract methods in parent class which are defined
// in child class and we can call all these methods via making object of child class.
abstract class CalculatorAbstractclass1 {
    public abstract int add(int a,int b);
    public abstract int multiply(int a,int b);
    public abstract int divide(int a,int b);
    public abstract int subtract(int a,int b);
}
class addition extends CalculatorAbstractclass1{
    public int add(int a,int b){
        return a+b;

    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b) {
        return a / b;
    }
    public int subtract(int a,int b) {
        return a - b;
    }
}
class demo{
    public static void main(String[] args) {
        addition a=new addition();
        int resultAdd = a.add(10, 20);
        int resultMultiply = a.multiply(2, 5);
        int resultDivide = a.divide(2, 4);
        int resultSubtract = a.subtract(2, 5);

        // Printing results
        System.out.println("Addition: " + resultAdd);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
        System.out.println("Subtraction: " + resultSubtract);


    }
}