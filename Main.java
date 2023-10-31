class Unit {
    private int a;
    private String b;
    public Unit(int a, String b) {
        this.a = a;
        this.b = b;
    }
    public void printInfo() {
        System.out.println("Имя: " + b);
        System.out.println("Здоровье: " + a);
    }
}
public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit(0, "4й цилиндр Subaru");
        unit.printInfo();
    }
}
