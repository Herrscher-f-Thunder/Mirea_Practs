package OLD;

public class P4N1 {
    public static void main(String[] args) {
        Seasons MySeason = Seasons.SUMMER;
            System.out.println(MySeason.getInf());
            switch (MySeason){
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SUMMER -> System.out.println("Я люблю лето");
            case SPRING -> System.out.println("Я люблю весну");
        }
        for (Seasons season : Seasons.values()){
            System.out.println(season.toString() + ". Средняя температура: " + season.getMidTemperature() + ". Описание: " + season.getDescription());
        }
    }
}
