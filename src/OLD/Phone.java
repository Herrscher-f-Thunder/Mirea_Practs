package OLD;

public class Phone {
    private String number = "00000";
    private String weight = "0.0";
    private String model = "00";
    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Phone(){};
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone (String number, String weight, String model) {
        this(number, model);
        this.weight = weight;
    }
    public void receiveCalls(String InName){
        System.out.println("Звонит " + InName);
    }
    public void receiveCalls(String InName, String InNumber){
        System.out.println("Звонит " + InName + " " + InNumber);
    }
    public void sendMessage(String ... OutNumber){
        for (String s : OutNumber) System.out.println(s);
    }
    public String getNumber() {
        return number;
    }
    public  void  DataOut(){
        System.out.println("Номер: " + number +"; Вес: " + weight +"; Модель: " + model);
    }
}
