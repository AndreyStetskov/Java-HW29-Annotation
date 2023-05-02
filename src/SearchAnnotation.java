import java.lang.annotation.Annotation;
import java.util.Arrays;

@SuppressWarnings("rawtypes")
public class SearchAnnotation {

    public void example(Class cls) {

        Annotation[] annotations = cls.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Example ann) {
                System.out.printf("I found you!)\n\n Your value is %s", ann.value());
            }
        }
    }
}
