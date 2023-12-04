package OLD;

public class TestAuthor {
    public static void main(String[] args) {
        Author n1 = new Author("Andre", "VtAndre@gmail.com", 'M');
        System.out.println(n1.toString());
        n1.setEmail("Work-Ru.mail.ru");
        System.out.print(n1.toString());
    }
}
