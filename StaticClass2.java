//Java Program to Illustrates Use of Static Inner Class
//Explanation:made an Outer class and define a static Inner class in it. We define a non-static
//method as the show() method in inner class and we try to call this method by inner
//class object and outer class object and we get the desired output.
public class StaticClass2 {
    static class inner {

        void show() {
            System.out.println("inside the inner class in show method()");
        }
    }
    void outer(){
        System.out.println("inside the outer class in outer method()");
    }
}
class test {
    public static void main(String[] args) {


        StaticClass2.inner a = new StaticClass2.inner();
        a.show();
        StaticClass2 s=new StaticClass2();
        s.outer();

    }
}