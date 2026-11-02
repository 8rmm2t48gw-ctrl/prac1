package practice2;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("количество мест в магазине ");
        int n=sc.nextInt();
        sc.nextLine();

        Shop shop=new Shop(n);
        for (int i=0; i<n; i++) {
            int a;
            do {
                System.out.println();
                System.out.println("1-добавить компьютер");
                System.out.println("2-найти компьютер");
                System.out.println("3-удалить компьютер");
                System.out.println("0-выход");
                System.out.print("выберите действие ");
                a=sc.nextInt();
                sc.nextLine();
                if (a==1) {
                    System.out.print("введите название компьютера ");
                    String name=sc.nextLine();

                    System.out.print("введите цену компьютера ");
                    int price=sc.nextInt();
                    sc.nextLine();

                    shop.add(new Computer(name, price));
                }
                if (a==2) {
                    System.out.print("введите название компьютера ");
                    String name=sc.nextLine();

                    Computer c=shop.find(name);

                    if (c!=null) {
                        System.out.println("компьютер найден " + c);
                    } else {
                        System.out.println("компьютер не найден");
                    }
                }
                if (a==3) {
                    System.out.print("введите название компьютера ");
                    String name=sc.nextLine();

                    shop.remove(name);
                }
            } while (a!=0);
        }
    }
}