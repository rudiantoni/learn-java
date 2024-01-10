import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
  String author();

  Priority priority() default Priority.LOW;

  Status status() default Status.NOT_STARTED;

  enum Priority {
    LOW, MEDIUM, HIGH;
  }

  enum Status {
    NOT_STARTED, STARTED;
  }

}
