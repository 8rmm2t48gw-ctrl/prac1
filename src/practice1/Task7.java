package practice1;

public class Task7 {
    public static void main(String[] args){
        int n=14;
        long result=factorial(n);
        System.out.println("факториал числа "+n+"="+result);
    }

    public static long factorial(int n){
        long result=1;
        for (int i=1; i<=n; i++){
            result=result*i;
        }
        return result;
    }
}
