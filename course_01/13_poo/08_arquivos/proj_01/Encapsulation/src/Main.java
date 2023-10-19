import package1.ClassA;

public class Main {
  public static void main(String[] args) {
    ClassA classA = new ClassA();
    classA.doSomething(); // Public modifier demo
    // classA.doSomething2(); // Protected modifier demo. Can't use it here, because it'is protected for package1 only
  }
}