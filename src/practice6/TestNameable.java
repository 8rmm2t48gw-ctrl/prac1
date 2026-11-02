package practice6;

public class TestNameable {
    public static void main(String[] args){
        Nameable a=new Planet("марс");
        Nameable b=new Car("Toyota");

        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
