package practice2;
import java.util.Scanner;
public class Poker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] suit={"пики", "черви", "бубны", "крести"};
        String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};
        String[] deck=new String[52];
        int k=0;

        for (int i=0; i<suit.length; i++) {
            for (int j=0; j<rank.length; j++) {
                deck[k]=rank[j]+" "+suit[i];
                k++;
            }
        }

        for (int i=deck.length-1; i>0; i--) {
            int r=(int)(Math.random()*(i+1));
            String temp=deck[i];
            deck[i]=deck[r];
            deck[r]=temp;
        }
        int n;

        do {
            System.out.println("введите количество игроков(1-10)");
            n=sc.nextInt();

        } while (n<1 || n>10);
        k=0;

        for (int i=1; i<=n; i++) {
            System.out.println("игрок " + i);

            for (int j=0; j<5; j++) {
                System.out.println(deck[k]);
                k++;
            }
            System.out.println();
        }
    }
}