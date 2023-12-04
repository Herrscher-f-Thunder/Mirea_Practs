package Pract13;

import java.util.Scanner;

public class PhoneConvertor {
    private String PhoneNumber;
    public PhoneConvertor(String phoneNumber){
        PhoneNumber = phoneNumber;
    }
    public String Convertor(){
        if (PhoneNumber.startsWith("+")){
            if (PhoneNumber.length() == 12){
                String countryCode = PhoneNumber.substring(1, 2);
                String areaCode = PhoneNumber.substring(2, 5);
                String localNumber1 = PhoneNumber.substring(5, 8);
                String localNumber2 = PhoneNumber.substring(8);
                return String.format("+%s-%s-%s-%s", countryCode, areaCode, localNumber1, localNumber2);
            }
            else {
                return "Ошибка. Неправильны формат номера";
            }
        }
        else if (PhoneNumber.startsWith("8") && PhoneNumber.length() == 11){
            String localNumber = PhoneNumber.substring(1);
            return String.format("+7-%s-%s-%s", localNumber.substring(0, 3), localNumber.substring(3, 6), localNumber.substring(6));
        }
        else
            return "Ошибка. Неправильны формат номера";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        PhoneConvertor convertor = new PhoneConvertor(number);
        System.out.print(convertor.Convertor());
    }
}
/*
+79683777686
89683777686
12454
*/
