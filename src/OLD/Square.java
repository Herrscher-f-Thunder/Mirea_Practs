package OLD;

public class Square extends  Rectangle{
        protected double side;
        public Square() {
        }
        public Square(double side) {
            this.side = side;
        }
        public Square(double side, String color, boolean filled){
            this.side = side;
            this.color = color;
            this.filled = filled;
        }
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        public void setWidth(double side){
            width = side;
        }
        public void setLength(double side){
            length = side;
        }
        public String toString() {
            return ("Фигура: прямоугольник; Сторона: " + side +
                    "; Цвет: " + color + "; Заполненность " + filled +
                    "; Периметр: " + getPerimeter() +"; Площадь: " + getArea());
        }
    }
