package pract9.N4;
public class Videocard implements Comparable<Videocard> {
    private  int model;
    private  int cost;

    public Videocard(int model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public int getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int compareTo(Videocard nw) {
        return Integer.compare(model, nw.model);
    }

    @Override
    public String toString() {
        return "Videocard{" +
                "model=" + model +
                ", cost='" + cost + '\'' +
                '}';
    }
}