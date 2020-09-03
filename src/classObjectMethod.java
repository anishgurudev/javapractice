import java.util.Scanner;

/*How to add methods (subroutines) to your classes in Java, adding subroutines to our basic Person class,
    so that the Person objects can do stuff as well as containing data.*/
class Person {
    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain
    // 1. Data
    // 2. Subroutines (methods)

    void speak() {
        for (int i = 0; i < 2; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}

public class classObjectMethod {
    public static void main(String[] args) {

        // Create a Person object using the Person class
        Person person1 = new Person();

        Scanner Input = new Scanner(System.in);
        //output to user
        System.out.println("Enter you name");
        //storing the name
        person1.name = Input.nextLine();
        //output to user
        System.out.println("Enter you age");
        //storing the age
        person1.age = Input.nextInt();

        person1.speak();
        person1.sayHello();

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person1.sayHello();

        System.out.println(person1.name);

    }
}
