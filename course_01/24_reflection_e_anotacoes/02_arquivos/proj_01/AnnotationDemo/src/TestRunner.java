import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestRunner {
  public void runTests(Class clazz) {
    Method[] methods = clazz.getDeclaredMethods();
    Arrays.stream(methods)
      .filter(method -> method.getAnnotation(Test.class) != null) // Métodos com a nossa anotação
      .filter(method -> !Modifier.isStatic((method.getModifiers()))) // Que sejam não estáticos
      .forEach(method -> {
        try {
          Object obj = clazz.getConstructor().newInstance();
          Test testAnnotation = method.getAnnotation(Test.class);
          String testName = testAnnotation.name();
          Boolean shouldThrow = !testAnnotation.expected().equals(Test.None.class);
          Boolean success = false;
          try {
            method.invoke(obj);
            if (!shouldThrow) {
              success = true;
            } else {
              success = false;
              System.out.println("Teste \"" + testName + "\" falhou, era esperado uma exceção ser lançada e nenhuma exceção foi lançada.");
            }
          } catch (InvocationTargetException e) {
            Class cause = e.getCause().getClass();
            if (shouldThrow) {
              // alguma exception deve ser lançada
              if (!cause.equals(testAnnotation.expected())) {
                System.out.println("Teste \"" + testName + "\" falhou, o tipo da exceção lançada é diferente do tipo esperado.");
              } else {
                success = true;
              }
            } else {
              // nenhuma exception deve ser lançada
              System.out.println("Teste \"" + testName + "\" falhou, nenhuma exceção deveria ser lançada.");
            }
            if (!success) {
              e.printStackTrace();
            }
          }
          if (success) {
            System.out.println("Teste \"" + testName + "\" passou com sucesso.");
          }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException
                 | NoSuchMethodException | IllegalArgumentException | SecurityException e) {
          e.printStackTrace();
        }
      });
  }
}
