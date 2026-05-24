package processor;

import annotation.Encrypt;

import java.lang.reflect.Field;

public class EncryptAnnotationProcessor {

    public static void process(Object object) {

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Encrypt.class)) {

                Encrypt encrypt = field.getAnnotation(Encrypt.class);
                field.setAccessible(true);

                try {

                    Object value = field.get(object);
                    System.out.println("Field: " + field.getName());
                    System.out.println("Original Value: " + value);
                    System.out.println("Encrypt Value: " + encrypt.value());

                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
