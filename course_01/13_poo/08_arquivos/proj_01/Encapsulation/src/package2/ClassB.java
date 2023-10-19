package package2;

import package1.ClassA;

public class ClassB extends ClassA {
  void doSomethingClassB() {
    doSomething(); // Public modifier demo
    doSomethingClassBPrivate(); // Private modifier demo
  }

  private void doSomethingClassBPrivate() { }
}
