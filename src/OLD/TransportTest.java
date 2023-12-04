package OLD;

public class TransportTest {
    public static void main(String[] args) {
        Car car = new Car(4, 100, 500, 100);
        Plane plane = new Plane(70, 800, 70000, 1000);
        Train train = new Train(700, 200, 500000, 30000, 20);
        Ship ship = new Ship(150, 80, 100000, 0, 20, 100);
        int passengers = 100;
        double weight = passengers * 50;
        double path = 1000;
        int badDays = 3;
        double Time;
        double Cost;
        System.out.println("Рассчёт затрат на перевозку: " + passengers +
                " Пассажиров с Грузом: "  + weight + " КГ, на Расстояние: " +
                path + " КМ. Плохая погода будет длиться дней: " + badDays);

        Time = car.Time(passengers, weight, path, badDays);
        Cost = car.Cost(passengers, weight, path);
        String time = String.format("%.4f", Time);
        String cost = String.format("%.4f", Cost);
        System.out.println("Машина. Дни: " + time + ". Стоиомть: " + cost);

        Time = train.Time(passengers, weight, path, badDays);
        Cost = train.Cost(passengers, weight, path);
        time = String.format("%.4f", Time);
        cost = String.format("%.4f", Cost);
        System.out.println("Поезд. Дни: " + time + ". Стоиомть: " + cost);

        Time = plane.Time(passengers, weight, path, badDays);
        Cost = plane.Cost(passengers, weight, path);
        time = String.format("%.4f", Time);
        cost = String.format("%.4f", Cost);
        System.out.println("Самолёт. Дни: " + time + ". Стоиомть: " + cost);

        Time = ship.Time(passengers, weight, path, badDays);
        Cost = ship.Cost(passengers, weight, path);
        time = String.format("%.4f", Time);
        cost = String.format("%.4f", Cost);
        System.out.println("Корабль. Дни: " + time + ". Стоиомть: " + cost);
    }
}
