package Pract15;

import javax.swing.*;
import java.util.Map;
import java.util.Objects;

public class N2 extends JFrame {

    private final Map<String, String> information = Map.ofEntries(
            Map.entry("Австралия", "Австралия – это страна, занимающая одноименный материк, который омывается Индийским и Тихим океанами. На побережьях континента находятся такие крупные города, как Сидней, Брисбен, Мельбурн, Перт и Аделаида. Столица Австралии – Канберра – расположена вдали от моря."),
            Map.entry("Китай", "Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км. Столица страны, Пекин."),
            Map.entry("Англия", "Англия, родина Шекспира и группы The Beatles, входит в состав Соединенного Королевства Великобритании и Северной Ирландии. Она расположена на Британских островах и граничит с Шотландией и Уэльсом. Столица Англии Лондон."),
            Map.entry("Россия", "государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в международно признанных границах составляет 17 098 246 км².")
    );
    private final JComboBox<String> comboBox = new JComboBox<>(information.keySet().toArray(new String[0]));
    public N2(){
        super("Countries");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        comboBox.addActionListener(e ->
            JOptionPane.showMessageDialog(null,
                    information.get(Objects.requireNonNull(comboBox.getSelectedItem()).toString()),
                    "description", JOptionPane.INFORMATION_MESSAGE)
        );
        add(comboBox);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new N2();
    }
}
