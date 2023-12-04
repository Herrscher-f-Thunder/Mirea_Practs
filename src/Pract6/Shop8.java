package Pract6;
public class Shop8 implements Printable{
    private String name;
    private int cost;
    public Shop8(String Name, int Cost){
        name = Name;
        cost = Cost;
    }
    public void print(){
        System.out.println("Shop: " + name + " Cost: " + cost);
    }
}
