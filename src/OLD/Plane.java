package OLD;

public class Plane extends Transport{
    public Plane(double maxPassengers, double speed, double maxWeight, double fuelCost) {
        super(maxPassengers, speed, maxWeight, fuelCost);
    }
    public double Time(int Passengers, double Weight, double Path, int BadWeatherDays){
        return ((Math.max(Math.ceil(Passengers/getMaxPassengers()),
                Math.ceil(Weight/getMaxWeight()))) * (Path/getSpeed()/24.0) + BadWeatherDays);
    }
    public double Cost(int Passengers, double Weight, double Path){
        return ( (Path/getSpeed()/24.0) * getFuelCost());
    }
}
