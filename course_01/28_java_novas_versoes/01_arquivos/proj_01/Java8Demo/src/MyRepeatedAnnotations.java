import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Container annotation to hold multiple
// instances of MyAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnotations {
  MyAnnotation[] value();
}
