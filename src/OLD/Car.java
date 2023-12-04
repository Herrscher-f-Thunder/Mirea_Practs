package OLD;

public class Car extends Transport{
    public Car(double maxPassengers, double speed, double maxWeight, double fuelCost) {
        super(maxPassengers, speed, maxWeight, fuelCost);
    }
    public double Time(int Passengers, double Weight, double Path, int BadWeather){
        return ((Math.max(Math.ceil(Passengers/getMaxPassengers()),
                Math.ceil(Weight/getMaxWeight()))) * (Path/getSpeed()/24.0));
    }
    public double Cost(int Passengers, double Weight, double Path){
        return ((Math.max(Math.ceil(Passengers/getMaxPassengers()),
                Math.ceil(Weight/getMaxWeight()))) * getFuelCost());
    }
}
