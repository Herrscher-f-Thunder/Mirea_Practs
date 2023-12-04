package Pract6.N10;

public class Monitor {
    private int cost;
    private String format;

    public Monitor(int cost, String format) {
        this.cost = cost;
        this.format = format;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
