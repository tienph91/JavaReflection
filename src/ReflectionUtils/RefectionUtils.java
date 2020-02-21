package ReflectionUtils;

import java.lang.reflect.Field;

public class RefectionUtils {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Student student = new Student();
        student.setAge(9);
        student.setName(" tienph ");
        student.setStreet(new Street("32 Hoang Cau"));

        System.out.println(student.getName());

        for (Field field : student.getClass().getDeclaredFields()) {

            field.setAccessible(true);
            if (field.getType() == String.class) {
                String fieldValue = (String) field.get(student);

                if (fieldValue != null) {
                    field.set(student, fieldValue.trim());
                }

            }
        }

        System.out.println(student.getName());
    }
}
