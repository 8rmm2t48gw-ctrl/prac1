package practice4;

public class TestShape {
    public static void main(String[] args){
        Shape s1=new Circle(5, "красный", true);
        Shape s2=new Rectangle(4, 6, "синий", false);
        Shape s3=new Square(3, "зеленый", true);

        System.out.println(s1);
        System.out.println("площадь "+s1.getArea());
        System.out.println("периметр "+s1.getPerimeter());

        System.out.println();
        System.out.println(s2);
        System.out.println("площадь "+s2.getArea());
        System.out.println("периметр "+s2.getPerimeter());

        System.out.println();
        System.out.println(s3);
        System.out.println("площадь "+s3.getArea());
        System.out.println("периметр "+s3.getPerimeter());
    }
}
