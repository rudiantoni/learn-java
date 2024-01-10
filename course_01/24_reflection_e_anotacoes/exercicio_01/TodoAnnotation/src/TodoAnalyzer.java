import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoAnalyzer {
  public static String getTodoReport(Class clazz) {
    List<String> reportList = new ArrayList<>();

    Arrays.stream(clazz.getDeclaredMethods())
      .filter(method -> method.getAnnotation(Todo.class) != null)
      .forEach(method -> {
        Todo annotation = method.getAnnotation(Todo.class);
        String methodName = method.getName();
        String author = annotation.author();
        String priority = annotation.priority().name();
        String status = annotation.status().name();
        String reportItem = String.format("Nome do método: %s, Autor: %s, Prioridade: %s, Status: %s", methodName, author, priority, status);
        reportList.add(reportItem);
      });

    String report = String.join("\n", reportList);
    return report;
  }
}
