package practice7;

public class TestMathFunc {
    public static void main(String[] args){
        MathCalculable m=new MathFunc();

        System.out.println("2 в степени 3 "+m.pow(2, 3));
        System.out.println("модуль числа 3+4i "+m.abs(3, 4));
        MathFunc f=new MathFunc();
        System.out.println("длина окружности "+f.circle(5));
    }
}
