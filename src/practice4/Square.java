package practice4;

public class Square extends Rectangle{
    public Square(){
    }

    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width=side;
        length=side;
    }

    @Override
    public void setWidth(double side){
        width=side;
        length=side;
    }

    @Override
    public void setLength(double side){
        width=side;
        length=side;
    }

    @Override
    public String toString(){
        return "квадрат, сторона "+width+", "+"цвет "+color+", заполнена "+filled;
    }
}
