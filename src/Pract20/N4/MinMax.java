package Pract20.N4;

public class MinMax <T extends Number> {
    private T[] mas;
    public MinMax(T[] m){
        mas = m;
    }
    public T FindMin(){
        Comparator comparator = new Comparator();
        if (mas.length == 0)
            return null;
        T min = mas[0];
        for (T ma : mas) {
            if (comparator.compare(ma, min) < 0)
                min = ma;
        }
        return min;
    }
    public T FindMax(){
        Comparator comparator = new Comparator();
        if (mas.length == 0)
            return null;
        T max = mas[0];
        for (T ma : mas) {
            if (comparator.compare(ma, max) > 0)
                max = ma;
        }
        return max;
    }

    class Comparator implements java.util.Comparator<T>{
        public int compare(T ob1, T ob2){
            return Double.compare(ob1.doubleValue(), ob2.doubleValue());
        }
    }
}
