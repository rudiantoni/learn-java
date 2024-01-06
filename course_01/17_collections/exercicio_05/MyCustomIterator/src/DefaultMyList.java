import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyList implements MyList {

  private class Node {
    Object element;
    Node next;
    Node prev;

    Node(Object element) {
      this.element = element;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  private Node iteratorCurrent = null;
  private Node removable = null;

  @Override
  public void add(Object e) {
    Node newNode = new Node(e);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    size++;
  }

  @Override
  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public boolean remove(Object o) {
    Node current = head;
    while (current != null) {
      if (current.element.equals(o)) {
        if (current.prev != null) {
          current.prev.next = current.next;
        } else {
          head = current.next;
        }

        if (current.next != null) {
          current.next.prev = current.prev;
        } else {
          tail = current.prev;
        }

        size--;
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public Object[] toArray() {
    Object[] array = new Object[size];
    Node current = head;
    int index = 0;
    while (current != null) {
      array[index++] = current.element;
      current = current.next;
    }
    return array;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean contains(Object o) {
    Node current = head;
    while (current != null) {
      if (current.element.equals(o)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public boolean containsAll(MyList c) {
    Object[] elements = c.toArray();
    for (Object element : elements) {
      if (!contains(element)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("{");
    Node current = head;
    while (current != null) {
      sb.append(current.element.toString());
      if (current.next != null) {
        sb.append(", ");
      }
      current = current.next;
    }
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Iterator<Object> iterator() {
    return new IteratorImpl();
  }

  private class IteratorImpl implements Iterator<Object> {

    @Override
    public boolean hasNext() {
      if (iteratorCurrent == null && head != null) {
        return true;
      } else if (iteratorCurrent != null && iteratorCurrent.next != null) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (iteratorCurrent == null && head != null) {
        iteratorCurrent = head;
        removable = iteratorCurrent;
        return head.element;
      } else if (iteratorCurrent != null && iteratorCurrent.next != null) {
        iteratorCurrent = iteratorCurrent.next;
        removable = iteratorCurrent;
        return iteratorCurrent.element;
      }
      throw new NoSuchElementException("No more elements in the current iterator.");
    }

    @Override
    public void remove() {
      if (removable == null) {
        throw new IllegalStateException("You need to call .next() before.");
      }
      else {
        DefaultMyList.this.remove(removable.element);
        removable = null;
      }
    }
  }

}
