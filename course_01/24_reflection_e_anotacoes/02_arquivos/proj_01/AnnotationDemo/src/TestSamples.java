public class TestSamples {
  @Test(name = "teste sem exceção")
  public void shouldNotThrowException() {
    // Método que não lança uma exceção
  }

  @Test(name = "teste com exceção", expected = RuntimeException.class)
  public void shouldThrowException() {
    throw new RuntimeException();
  }
}
