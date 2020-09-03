//how to create constructor, using multiple constructors with different parameters and
// calling constructors from within other constructors
class Phone {
    private String name;
    private int os;

    public Phone() {
        this("ani", 2);
        System.out.println("costructor running");

    }

    public Phone(String name) {
        this();
        System.out.println("second constructor running");
    }

    public Phone(String name, int os) {
        System.out.println("Third constructor running");
        this.name = name;
        this.os = os;
    }

}

public class Constructors {
    public static void main(String[] args) {
        Phone machine = new Phone();
        Phone machine2 = new Phone("android");
        Phone machine3 = new Phone("iOS", 7);


    }
}
