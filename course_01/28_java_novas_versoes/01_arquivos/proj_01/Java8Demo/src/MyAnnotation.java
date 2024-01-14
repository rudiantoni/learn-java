import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MyRepeatedAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
  String value();
}
