package practice3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Converter {
    public static double convert(double sum, double from, double to){
        return sum*from/to;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] rate={1, 80, 92, 11};
        System.out.println("1-рубли");
        System.out.println("2-доллары");
        System.out.println("3-евро");
        System.out.println("4-юани");

        System.out.print("исходная валюта ");
        int from=sc.nextInt();

        System.out.print("нужная валюта ");
        int to=sc.nextInt();

        if (from<1||from>4||to<1||to>4){
            System.out.println("неверно выбрана валюта");
            return;
        }
        System.out.print("введите сумму ");
        double sum=sc.nextDouble();
        double result=convert(sum, rate[from-1], rate[to-1]);
        NumberFormat format;

        if (to==1){
            format=NumberFormat.getCurrencyInstance(Locale.forLanguageTag("ru-RU"));
        } else if (to==2){
            format=NumberFormat.getCurrencyInstance(Locale.US);
        } else if (to==3){
            format=NumberFormat.getCurrencyInstance(Locale.GERMANY);
        } else{
            format=NumberFormat.getCurrencyInstance(Locale.CHINA);
        }

        System.out.println("результат "+format.format(result));
    }
}
