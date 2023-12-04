package Pract13;

public class Shirt {
    private String ID;
    private String Description;
    private String Color;
    private String Size;

    public Shirt(String ID, String description, String color, String size) {
        this.ID = ID;
        Description = description;
        Color = color;
        Size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "ID='" + ID + '\'' +
                ", Description='" + Description + '\'' +
                ", Color='" + Color + '\'' +
                ", Size='" + Size + '\'' +
                "}\n";
    }
}
