package practice2;

public class Computer {
    private String name;
    private int price;

    public Computer(String name, int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name+", цена "+price;
    }
}
