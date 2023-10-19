package package2;

public class ClassC extends ClassB {
  @Override
  public void doSomething() { }

  // Weaker access modifier on override demo
//  @Override
//  protected void doSomething() { }

  // Stronger access modifier on override demo
  @Override
  public void doSomethingClassB() { }
}
