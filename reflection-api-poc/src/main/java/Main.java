import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Guilherme", "guilherme@test.com", 200);

        // ---------------------------
        // 1. READ
        // ---------------------------
        System.out.println("--- READ ---");

        Class<?> clazz = person.getClass();
        System.out.println("Class: " + clazz.getName());

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType().getSimpleName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }

        // ---------------------------
        // 2. INVOKE
        // ---------------------------
        System.out.println("--- INVOKE ---");

        try {
            //Public Method
            Method sayHelloMethod = clazz.getMethod("sayHello");
            sayHelloMethod.invoke(person);

            //Private Method
            Method privateTestMethod = clazz.getDeclaredMethod("greet", String.class);
            privateTestMethod.setAccessible(true);
            Object result = privateTestMethod.invoke(person, "Hello");
            System.out.println(result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        } catch (IllegalAccessException e) {
            System.out.println("No permission to access the method");
        } catch (InvocationTargetException e) {
            System.out.println("Error executing method: " + e.getCause());
        }

        // ---------------------------
        // 3. MODIFY
        // ---------------------------
        System.out.println("--- MODIFY ---");

        try {
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(person, "Carlos");
            System.out.println("New name: " + person.getName());

            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 333);
            System.out.println("New age: " + person.getAge());

        } catch (NoSuchFieldException e) {
            System.out.println("Field not found.");
        } catch (IllegalAccessException e) {
            System.out.println("No permission to change field.");
        }
    }

}
