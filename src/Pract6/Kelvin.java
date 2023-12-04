package Pract6;

public class Kelvin implements Convertable{
    private double temperature;
    public Kelvin(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void convert(){
        double c = (temperature-273);
        double f = ((temperature - 273) * 1.8 + 32);
        String str = String.format("\n" + temperature + " по Кельвину эквивалентно\n"
                + "%.3f" + " по Цельсию\n"
                + "%.3f" + " по Фарегейту", c, f);
        System.out.println(str);
    }
}
