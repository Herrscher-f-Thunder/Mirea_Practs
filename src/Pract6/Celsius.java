package Pract6;

public class Celsius implements Convertable{
    private double temperature;
    public Celsius(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void convert(){
        double k = (temperature-273);
        double f = (temperature * 1.8 + 32);
        String str = String.format("\n" + temperature + " по Цельсию эквивалентно\n"
                + "%.3f" + " по Кельвину\n"
                + "%.3f" + " по Фарегейту", k, f);
        System.out.println(str);
    }
}
