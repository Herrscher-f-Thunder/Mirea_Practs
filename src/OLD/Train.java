package OLD;

public class Train  extends Transport{
    protected int Stations;
    public Train(double maxPassengers, double speed, double maxWeight, double fuelCost, int stations) {
        super(maxPassengers, speed, maxWeight, fuelCost);
        Stations = stations;
    }
    public double Time(int Passengers, double Weight, double Path, int BadWeatherDays){
        return (Path/getSpeed()/24.0 + Stations*0.007);
    }
    public double Cost(int Passengers, double Weight, double Path){
        return (Math.ceil(Weight/getMaxWeight()) / 100 * getFuelCost());
    }
}
