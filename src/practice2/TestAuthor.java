package practice2;

public class TestAuthor {
    public static void main(String[] args){
        Author a=new Author("Artem", "artem@mail.ru", 'M');

        System.out.println(a);
        System.out.println("имя: "+a.getName());
        System.out.println("email: "+a.getEmail());
        System.out.println("пол: "+a.getGender());

        a.setEmail("new@mail.ru");
        System.out.println("новый email: "+a.getEmail());
    }
}
