package practice2;

public class Shop {
    private Computer[] computers;

    public Shop(int n) {
        computers=new Computer[n];
    }

    public void add(Computer c) {
        for (int i=0; i<computers.length; i++) {
            if (computers[i]==null) {
                computers[i]=c;
                System.out.println("компьютер добавлен");
                return;
            }
        }
        System.out.println("в магазине нет свободного места");
    }

    public void remove(String name) {
        for (int i=0; i<computers.length; i++) {
            if (computers[i]!=null&&computers[i].getName().equals(name)) {
                computers[i]=null;
                System.out.println("компьютер удалён");
                return;
            }
        }
        System.out.println("компьютер не найден");
    }

    public Computer find(String name){
        for (int i=0; i<computers.length; i++){
            if (computers[i]!=null&&computers[i].getName().equals(name)){
                return computers[i];
            }
        }
        return null;
    }
}