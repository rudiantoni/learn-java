import java.util.ArrayList;
import java.util.List;

public class Main {

  //  @SuppressWarnings("rawtypes")
  @SuppressWarnings(value = "rawtypes")
  public static void main(String[] args) {
    List list = new ArrayList();
  }

  @Override
  @Author(name = "Rudi Antoni")
  @Author(name = "John Doe")
  public String toString() {
    return "Demo{getClass()='getClass()', hashCode()='hashCode()', toString()='thisOne :D'}";
  }
}