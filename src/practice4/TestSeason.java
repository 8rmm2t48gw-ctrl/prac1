package practice4;

public class TestSeason {
    public static void printSeason(Season season){
        switch(season){
            case WINTER:
                System.out.println("я люблю зиму");
                break;
            case SPRING:
                System.out.println("я люблю весну");
                break;
            case SUMMER:
                System.out.println("я люблю лето");
                break;
            case AUTUMN:
                System.out.println("я люблю осень");
                break;
        }
    }
    public static void main(String[] args){
        Season favourite=Season.SUMMER;
        System.out.println("любимое время года "+favourite);
        System.out.println("средняя температура "+favourite.getTemperature());
        System.out.println("описание "+favourite.getDescription());

        printSeason(favourite);
        System.out.println();

        for (Season season:Season.values()){
            System.out.println(season+", температура "+season.getTemperature()+", "+season.getDescription());

        }
    }
}
