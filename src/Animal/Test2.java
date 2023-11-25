package Animal;

public class Test2 {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Bird b1 = new Bird();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        test(a1);
        test(b1);
        test(c1);
        test(d1);
    }
    public static void test (Animal a1){
        a1.makeSound();


    }
}
