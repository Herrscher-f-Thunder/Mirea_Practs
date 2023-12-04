package Pract6;

public class Farengate implements Convertable{
    private double temperature;
    public Farengate(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void convert() {
        double c = ((temperature - 32)*5./9.);
        double k = ((temperature - 32)*5./9. + 273);
        String str = String.format("\n" + temperature + " по Фареншейту эквивалентно\n"
                + "%.3f" + " по Цельсию\n"
                + "%.3f" + " по Кельвину", c, k);
        System.out.println(str);
    }
}
