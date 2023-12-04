package OLD;

public enum Seasons {
    WINTER(-15.5, "Зима - самое холодное время года. Короткий день и длинная ночь"),
    SPRING(+18.9, "Весна - сезон потепления. Растения начинают цвести"),
    SUMMER(+29.2, "Лето - самое жаркое время года. Длинный день и короткая ночь"){
        public String getDescription(){
            return ("Тёплое время года");
        }
    },
    AUTUMN(+11.4, "Осень - сезон похолодания. Растения начинают увядать, а животные готовятся к зимовке");

    private final double MidTemperature;
    public double getMidTemperature() {
        return MidTemperature;
    }
    private final String Inf;
    public String getInf() {
        return Inf;
    }
    private Seasons(double MidTemperature, String Inf){
        this.MidTemperature = MidTemperature;
        this.Inf = Inf;
    }
    public String getDescription(){
        return ("Холодное время года");
    }

}
