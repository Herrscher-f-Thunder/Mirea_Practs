package OLD;

public class P4_1N2 {
    public static void main(String[] args) {
        Phone model1 = new Phone();
        model1.setModel("1");
        model1.setNumber("11111");
        model1.setWeight("11");
        Phone model2 = new Phone();
        model2.setModel("2");
        model2.setNumber("22222");
        model2.setWeight("22");
        Phone model3 = new Phone();
        model3.setModel("3");
        model3.setNumber("33333");
        model3.setWeight("33");

        model1.DataOut();
        model2.DataOut();
        model3.DataOut();

        model1.receiveCalls("@*#$!& из Банка");
        System.out.println(model1.getNumber());
        model2.receiveCalls("Декан");
        System.out.println(model2.getNumber());
        model3.receiveCalls("Поликлиника");
        System.out.println(model3.getNumber());

        model1.receiveCalls("@*#$!& из Банка", "12345");
        model2.sendMessage("44444", "55555", "66666");
    }
}
