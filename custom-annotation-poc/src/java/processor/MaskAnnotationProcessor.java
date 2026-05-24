package processor;

import annotation.Mask;

import java.lang.reflect.Field;

public class MaskAnnotationProcessor {

    public static String process(Object object, String fieldName) {

        try {

            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object value = field.get(object);

            if (value == null) return null;

            if (!field.isAnnotationPresent(Mask.class)) {
                return value.toString();
            }

            Mask mask = field.getAnnotation(Mask.class);
            int visible = mask.visibleCharacters();
            String text = value.toString();

            if (text.length() <= visible) {
                return "*".repeat(text.length());
            }

            String hidden = "*".repeat(text.length() - visible);
            return hidden + text.substring(text.length() - visible);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
