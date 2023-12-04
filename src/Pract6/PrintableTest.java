package Pract6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable book1 = new Book("Solo Leveling", 200);
        Printable book2 = new Book("One Piece", 1093);
        Printable shop1 = new Shop8("M.Video", 1000000);
        Printable shop2 = new Shop8("Victoria", 324500);
        Printable[] printables = {book1, book2, shop1, shop2};
        for (Printable printable : printables){
            printable.print();
        }
    }
}
