package Pract13;

public class N3_15 {
    public static void main(String[] args) {
        String addressString1 = "Russia, Moscow, Moscow, 16-aya Parkovaya, 26, 3, 148";
        String addressString2 = "Russia; Moscow; Moscow; Golyanovo; 78; A; 223";
        Address address1 = Address.parseComma(addressString1);
        Address address2 = Address.parseAll(addressString2);
        if (address1 != null) System.out.print(address1.toString());
        if (address2 != null)System.out.print(address2.toString());
    }
}
