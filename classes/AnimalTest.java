package classes;

public class AnimalTest {
    public static void main(String[] args) {
        Shape dog = new Shape();
        Rectangle a = new Rectangle ();
        dog.setN(5);
        dog.setLength(5);
        System.out.println(dog.getArea());
        a.setLength(4);
        a.setWidth(4);
        System.out.println(a.getArea());
    }
}
