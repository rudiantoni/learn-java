# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.11. SOLID: Open/close
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [11_arquivos](./11_arquivos/)
- Projetos
  - [Projeto 1](./11_arquivos/) [(iniciado em)](#openclosed)
- Conteúdo
  - [Open/Closed](#openclosed)
  - [Exemplo sem a aplicação do princípio](#exemplo-sem-a-aplicação-do-princípio)
  - [Exemplo com a aplicação do princípio](#exemplo-com-a-aplicação-do-princípio)

### Open/Closed
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./11_arquivos/proj_01/)

O Princípio do Aberto/Fechado, em inglês "Open/Closed Principle" (OCP), é um dos cinco princípios do SOLID, um conjunto de diretrizes de design de software que visam criar sistemas de software mais flexíveis, extensíveis e fáceis de manter. O OCP foi formulado por Bertrand Meyer e popularizado por Robert C. Martin.

O princípio do OCP estabelece o seguinte princípio fundamental: "Entidades do software (classes, módulos, funções, etc.) devem estar abertas para extensão, mas fechadas para modificação."

Isso significa que, uma vez que uma classe ou módulo foi escrito e testado, ele não deve ser alterado para adicionar novas funcionalidades. Em vez disso, a extensão de funcionalidades deve ser feita por meio de extensões, herança, composição ou implementações de interfaces, sem alterar o código existente.

Principais conceitos do Princípio do OCP:

- **Aberto para Extensão**: Isso significa que você deve ser capaz de adicionar novas funcionalidades ou comportamentos a um sistema sem precisar modificar o código-fonte existente. Isso é geralmente alcançado por meio de herança, interfaces, composição e polimorfismo.
- **Fechado para Modificação**: Isso implica que as partes já testadas e em funcionamento do sistema não devem ser alteradas. Modificar código existente pode introduzir bugs e problemas inesperados. Portanto, a extensão deve ocorrer sem afetar o código existente.
- **Utilização de Abstrações**: O OCP incentiva o uso de abstrações (por exemplo, interfaces ou classes abstratas) para definir contratos que as novas implementações devem seguir. Isso permite que novas funcionalidades sejam adicionadas por meio da criação de novas classes que implementam as abstrações existentes, sem afetar as classes existentes.

O OCP ajuda a criar sistemas mais flexíveis e sustentáveis, facilitando a extensão do software sem o risco de introduzir problemas em partes já testadas e funcionais do código.

### Exemplo sem a aplicação do princípio
[[Topo]](#)<br />

Suponha que temos uma classe Calculadora que possui um método para calcular a área de várias formas geométricas.

O código abaixo viola o OCP porque, para adicionar uma nova forma, precisamos modificar a classe Calculadora, o que é indesejável:

```java
public class Calculadora {

  public double calcularArea(Forma forma) {
  
    if (forma instanceof Retangulo) {
      Retangulo retangulo = (Retangulo) forma;
      return retangulo.getAltura() * retangulo.getLargura();
    } else if (forma instanceof Circulo) {
      Circulo circulo = (Circulo) forma;
      return Math.PI * Math.pow(circulo.getRaio(), 2);
    }
    // E se quisermos adicionar uma nova forma, teremos que modificar esta classe.
    return 0.0;
  
  }
}
```

Neste exemplo, se quisermos adicionar uma nova forma, como um triângulo, precisaremos modificar a classe Calculadora, o que não segue o OCP.

### Exemplo com a aplicação do princípio
[[Topo]](#)<br />

Aqui está um exemplo que segue o Princípio do OCP, usando abstrações e polimorfismo para estender o comportamento sem modificar a classe existente:

```java
interface Forma {
  double calcularArea();
}

class Retangulo implements Forma {
  private double altura;
  private double largura;

  public Retangulo(double altura, double largura) {
    this.altura = altura;
    this.largura = largura;
  }

  @Override
  public double calcularArea() {
    return altura * largura;
  }
}

class Circulo implements Forma {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * Math.pow(raio, 2);
  }
}

class CalculadoraDeArea {
  public double calcularArea(Forma forma) {
    return forma.calcularArea();
  }
}

```

Neste exemplo, introduzimos uma interface Forma que define o método calcularArea().

As classes Retangulo e Circulo implementam essa interface e fornecem suas próprias implementações do método calcularArea().

A classe CalculadoraDeArea agora pode calcular a área de qualquer forma que implemente a interface Forma, sem precisar ser modificada.

Dessa forma, estamos seguindo o Princípio do OCP, pois podemos adicionar novas formas (por exemplo, um triângulo) sem modificar a classe CalculadoraDeArea.

Isso torna o código mais extensível e de fácil manutenção.
