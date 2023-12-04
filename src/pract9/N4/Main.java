package pract9.N4;

public class Main {

    public static void main(String[] args) {
        Videocard videocard1 = new Videocard(3050, 100250),
               videocard2 = new Videocard(3060, 40000);

        System.out.println(videocard1.compareTo(videocard2) > 0 ? videocard1 : videocard2);
    }
}