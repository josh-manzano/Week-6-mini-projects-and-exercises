package week6.Inheritance.OopInheritance.IncapsulationPractice;

public class personMain {
    public static void main(String[] args) {
        Person me = new Person();
        me.setAge(20);
        me.setName("Josh");
        System.out.println("My name is " + me.getName() + " and I am " + me.getAge() + " years old.");
    }
}
