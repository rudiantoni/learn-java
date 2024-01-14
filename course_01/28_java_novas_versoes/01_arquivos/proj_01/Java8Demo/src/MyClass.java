@MyAnnotation("First")
@MyAnnotation("Second")
// Implementing the interface
class MyClass implements MyInterface {
  @Override
  public void regularMethod() {
    System.out.println("Implementation of regularMethod in MyClass");
  }

  // Overriding the default method is optional
  // Uncommenting the next block will override the default method
  // @Override
  // public void defaultMethod() {
  //     System.out.println("Custom implementation of defaultMethod in MyClass");
  // }
}