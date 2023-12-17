//Java Program to Implement Shape Interface using Circle and Rectangle Class
//Explanation:Interfaces are syntactically similar to classes, but they lack instance variables, and their
//methods are declared without any body. Here we make the interface as Shape with two methods as input() and
// area() which are implemented by further two classes as circle and rectangle who implements the interface Shape.
interface Shape {
    void input();
    double area();
}
class circle implements Shape {
    double radius;
    @Override
    public void input() {
        radius = 5.0;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class rectangle implements Shape {
  double length;
   double width;
   @Override
  public void input() {

        length = 10.0;
        width = 6.0;
    }
    @Override
    public double area() {

        return length * width;
    }
}
class ShapeDemo {
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();
        c.input();
        r.input();
      System.out.println("Area of Circle: " + c.area());
      System.out.println("Area of Rectangle: " + r.area());
   }
}
