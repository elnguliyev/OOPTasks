interface myLanguage {
    default void learn() {
        System.out.println("I learn English.");
    }

    public void speak();

}

class RussianLanguage implements myLanguage {
    public void speak() {
        learn();

        System.out.println("I can speak English.");
    }
}

public class MyInterface {
    public static void main(String[] args) {

        myLanguage eng = new RussianLanguage();
        eng.speak();

    }

}
