package practice4;

public class TestPerson {
    public static void main(String[] args){
        Person p1=new Person();
        p1.fullName="Artem";
        p1.age=19;

        Person p2=new Person("Ivan", 20);

        p1.move();
        p1.talk();
        p2.move();
        p2.talk();
    }
}
