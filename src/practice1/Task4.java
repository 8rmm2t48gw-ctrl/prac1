package practice1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n;
        while (true){
            System.out.print("введите количество элекментов ");
            if (sc.hasNextInt()) {
                n=sc.nextInt();
                if (n>0) {
                    break;
                } else {
                    System.out.println("количество элементов должно быть больше нуля");
                }
            }else{
                System.out.println("введите целое число!");
                sc.next();
                }


        }

        int[] a=new int[n];
        int i=0;

        while (i<n){
            System.out.print("введите элемент "+(i+1)+": ");

            if (sc.hasNextInt()){
                a[i]=sc.nextInt();
                i++;
            }else{
                System.out.println("введите целое число!");
                sc.next();
            }
        }
        int sum=0;
        int min=a[0];
        int max=a[0];
        i=0;

        do{
            sum=sum+a[i];

            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
            i++;
        } while(i<n);

        System.out.println("сумма "+sum);
        System.out.println("минимальный элемент "+min);
        System.out.println("максимальный элемент "+max);
    }
}
