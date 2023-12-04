package OLD;

public class Rectangle  extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){ return (width * length);}
    public double getPerimeter(){return  (2 * (width + length));}
    public String toString() {
        return ("Фигура: прямоугольник; Длина: " + length + "; Ширина: " + width +
                "; Цвет: " + color + "; Заполненность " + filled +
                "; Периметр: " + getPerimeter() +"; Площадь: " + getArea());
    }
}
