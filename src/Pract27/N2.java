package Pract27;

import java.util.HashMap;
import java.util.Map;

public class N2 {
    public static Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Адамян", "Арсений");
        map.put("Разон", "Владислав");
        map.put("Слизков", "Арсений");
        map.put("Севков", "Михаил");
        map.put("Трусов", "Егор");
        map.put("Самойлов", "Егор");
        map.put("Иванов", "Арсений");
        map.put("Смирнов", "Георгий");
        map.put("Сидоров", "Егор");
        map.put("Войл", "Семён");
        return map;
    }

    public static int sameFistName(Map<String, String> map){
        Map<String, Integer> count = new HashMap<>();
        for (String firstName : map.values()){
            count.put(firstName, count.getOrDefault(firstName, 0) + 1);
        }
        int res = 0;
        for (int value : count.values()){
            if (value > 1)
                res += value;
        }
        return res;
    }

    public static int sameSecondName(Map<String, String> map){
        Map<String, Integer> count = new HashMap<>();
        for (String secondName : map.keySet()){
            count.put(secondName, count.getOrDefault(secondName, 0) + 1);
        }
        int res = 0;
        for (int value : count.values()){
            if (value > 1)
                res += value;
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirst = sameFistName(map);
        int sameSecond = sameSecondName(map);
        //System.out.println("Повторы фамилий: " + sameSecond);
        //System.out.println("Повторы имён: " + sameFirst);
    }
}
