package practice1;
public class Task3 {
    public static void main(String[] args){
        int[]a={1, 2, 3, 4, 5};

        int sum=0;
        for (int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        double avg=(double)sum/a.length;

        System.out.println("сумма "+sum);
        System.out.println("среднее значение "+avg);
    }
}
