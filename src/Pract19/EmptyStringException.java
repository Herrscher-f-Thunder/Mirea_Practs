package Pract19;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("Student Not Found");
    }
    public EmptyStringException(String text) {
        super(text);
    }
    public EmptyStringException(String text, Throwable e){
        super(text, e);
    }
}
