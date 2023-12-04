package OLD;

public class Ship extends  Transport{
    protected int Workers;
    protected double Payment;
    public Ship(double maxPassengers, double speed, double maxWeight, double fuelCost, int workers, double payment) {
        super(maxPassengers, speed, maxWeight, fuelCost);
        Workers = workers;
        Payment = payment;
    }
    public int getWorkers() {
        return Workers;
    }
    public double getPayment() {
        return Payment;
    }
    public double Time(int Passengers, double Weight, double Path, int BadWeatherDays){
        return ((Math.max(Math.ceil(Passengers/(getMaxPassengers()-getWorkers())),
                Math.ceil(Weight/getMaxWeight()))) * (Path/getSpeed()/24.0) + BadWeatherDays);
    }
    public double Cost(int Passengers, double Weight, double Path){
        return (getTime() * getFuelCost() + getWorkers()*getPayment());
    }
}
