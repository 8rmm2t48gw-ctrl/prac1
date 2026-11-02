package practice7;

public class MathFunc implements MathCalculable{

    @Override
    public double pow(double x, int n){
        return Math.pow(x, n);
    }

    @Override
    public double abs(double a, double b){
        return Math.sqrt(a*a+b*b);
    }

    public double circle(double r){
        return 2*PI*r;
    }
}
