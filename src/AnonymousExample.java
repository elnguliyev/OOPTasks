interface Language {
    public void learn();
}

class englishLanguage {
    public void createClass() {

        Language lang = new Language() {
            public void learn() {
                System.out.println("I learn new language.");
            }
        };
        lang.learn();
    }
}

public class AnonymousExample {
    public static void main(String[] args) {

        englishLanguage enLang = new englishLanguage();
        enLang.createClass();
    }
}
