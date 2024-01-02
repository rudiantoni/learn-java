import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Child> children = new ArrayList<>();

    // Throws compilation error, because List<Child> is not the same as List<Parent>
    // processParentElements(children);

    // No error using a upper bounded wildcard on Parent class, allowing only classes that extends it
    processElementsUpperBoundOnParent(children);

    Child child = children.get(0);
    child.childSpecificMethod();

    List<Parent> parents = new ArrayList<>();
    List<Child> children2 = new ArrayList<>();
    processElementsLowerBoundOnChild(parents);
    processElementsLowerBoundOnChild(children2);

    List<Grandchild> grandchildren = new ArrayList<>();
    // Throws compilation error, because Grandchild is not a supertype (not a parent) of Child class
    // processElementsLowerBoundOnChild(grandchildren);

    Child child2 = children.get(0);
    child.childSpecificMethod();

  }

  public static void processParentElements(List<Parent> parents) {}

  // Upper bounded wildcard
  // Only classes that are children of Parent class (extends Parent class) are allowed here
  public static void processElementsUpperBoundOnParent(List<? extends Parent> elements) {
    Parent parent = elements.get(0);

    // Throws compilation error, because JVM can't guarantee the type of the element
    // Child child = elements.get(0);
    // elements.add(new Parent());
    // elements.add(new Child());
    // elements.add(new Grandchild());

    // You can't add any other elements in the collection because JVM doesn't know the correct type
    // and may cause issues, like adding superclasses which have methods that some other subclasses
    // doesn't. And both of them could be added there, so by safety, Java engineers not to allow this
    // and in order to do this, you need to use lower bounded wildcard.
    elements.add(null);
  }

  // Lower bounded wildcard
  // Only classes that are parents of Child class (Child or any that Child extends) are allowed here
  public static void processElementsLowerBoundOnChild(List<? super Child> elements) {
    Object element = elements.get(0);
    // Throws compilation error, because JVM can't guarantee the type of the element
    // Child parentElement = elements.get(0);

    // As before, to add elements in a collection is another story, so we can add any elements that are
    // from the Child class, and their children, like Grandchild
    elements.add(new Child());
    elements.add(new Grandchild());
    elements.add(null);

    // Throws compilation error, because neither Parent or Object are children from the Child class
    // elements.add(new Parent());
    // elements.add(new Object());

  }
}