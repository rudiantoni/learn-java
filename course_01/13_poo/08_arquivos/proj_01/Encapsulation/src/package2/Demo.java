package package2;

public class Demo {
  public static void main(String[] args) {
    ClassB classB = new ClassB();
    classB.doSomethingClassB(); // Package private demo
//    classB.doSomethingClassBPrivate(); // Private modifier demo
  }
}
