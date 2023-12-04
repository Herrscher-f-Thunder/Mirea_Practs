package OLD;

abstract public class Transport {
    protected double MaxPassengers;
    protected double Speed;
    protected  double MaxWeight;
    private final double FuelCost;
    protected double Time;
    public Transport(double maxPassengers, double speed, double maxWeight, double fuelCost) {
        MaxPassengers = maxPassengers;
        Speed = speed;
        MaxWeight = maxWeight;
        FuelCost = fuelCost;
    }
    public double getMaxPassengers() {
        return MaxPassengers;
    }
    public double getSpeed() {
        return Speed;
    }
    public double getMaxWeight() {
        return MaxWeight;
    }
    public double getFuelCost() {
        return FuelCost;
    }
    public double getTime() {
        return Time;
    }
    abstract double Time(int Passengers, double Weight, double Path, int BadWeather);
    abstract double Cost(int Passengers, double Weight, double Path);
}
