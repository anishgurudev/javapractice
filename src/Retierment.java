import java.util.Scanner;

class People {
    String name;
    int age;

    void speak() {
        System.out.println("my name is " + name + "& I am " + age);
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    int calculateYearsToRetierment() {
        int yearLeft = 65 - age;
        return yearLeft;
    }
}

public class Retierment {
    public static void main(String[] args) {
        People people = new People();
        Scanner Input = new Scanner(System.in);
        //output to user
        System.out.println("Enter your Name");
        people.name = Input.nextLine();
        //output to user
        System.out.println("Enter your age");
        people.age = Input.nextInt();
        int years = people.calculateYearsToRetierment();
        people.speak();
        System.out.println("Years till retirement " + people.calculateYearsToRetierment());

    }
}
