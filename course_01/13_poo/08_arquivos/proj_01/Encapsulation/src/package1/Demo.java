package package1;

import package2.ClassB;

public class Demo {
  public static void main(String[] args) {
    ClassA classA = new ClassA();
    classA.doSomething2(); // Protected modifier demo. Here we can use it, because it's inside package package1

    ClassB classB = new ClassB();
    // classB.doSomethingClassB(); // Package private demo. Can't use it here, it's default only for package2

  }
}
