//How to use setters, also known as set methods or mutators, in Java and'this' keyword and when to use it.
class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class SetterAndThis {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "jackey";
        dog1.age = 1;

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        dog1.setName("rockey");
        dog1.setAge(2);

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        dog1.setInfo("tyson", 4);
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());


    }
}
