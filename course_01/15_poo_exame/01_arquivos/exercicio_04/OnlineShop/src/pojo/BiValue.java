package pojo;

import java.util.Objects;

public class BiValue<A, B> {
  private A valueA;
  private B valueB;

  public BiValue() {}
  public BiValue(A valueA, B valueB) {
    this.valueA = valueA;
    this.valueB = valueB;
  }

  public A getValueA() { return valueA; }
  public void setValueA(A valueA) { this.valueA = valueA; }

  public B getValueB() { return valueB; }
  public void setValueB(B valueB) { this.valueB = valueB; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BiValue<?, ?> biValue = (BiValue<?, ?>) o;
    return Objects.equals(valueA, biValue.valueA) && Objects.equals(valueB, biValue.valueB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueA, valueB);
  }

  @Override
  public String toString() {
    return "(" +valueA+ "," +valueB+ ")";
  }
}
