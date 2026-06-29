package patterns;

public class RecordPatternsApp {

    // =========================================
    // RECORD PATTERNS
    // =========================================
    static void main(String[] args) {

        Object obj = new User("Guilherme", 30);

        if (obj instanceof User(String name, int age)) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}