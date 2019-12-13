package lab5;

public class Tara extends Dish {
    private String razmer;
    public String getRazmer() {
        return razmer;
    }
    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }
    public Tara(String material, String color, String razmer) {
        super(material, color);
        this.razmer = razmer;
    }
    @Override
    public String toString() {
        return "Tarelka{" +
                "razmer='" + razmer + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
