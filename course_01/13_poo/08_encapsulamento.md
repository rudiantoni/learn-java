# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Encapsulamento
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [08_arquivos](./08_arquivos/)
  - [Projeto 1](./08_arquivos/) [(iniciado em)](#o-que-é-encapsulamento)
- Conteúdo
  - [O que é encapsulamento](#o-que-é-encapsulamento)
  - [Modificadores de acesso](#modificadores-de-acesso)
  - [Regras de sobrescrita](#regras-de-sobrescrita)

### O que é encapsulamento
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

O encapsulamento é um conceito fundamental na programação orientada a objetos (POO). Ele se refere à prática de ocultar os detalhes internos de um objeto e fornecer uma interface pública consistente para interagir com esse objeto. O encapsulamento ajuda a promover a modularidade e a organização do código, tornando-o mais fácil de entender e manter.

A ideia por trás do encapsulamento é que um objeto deve ser responsável por suas próprias operações internas e que outras partes do programa não devem precisar conhecer os detalhes internos desse objeto para usá-lo. Para alcançar isso, as classes em POO geralmente definem atributos (variáveis de instância) e métodos (funções) que operam nesses atributos. No entanto, os detalhes de implementação desses atributos e métodos são mantidos ocultos do mundo exterior.

Em muitas linguagens de programação orientada a objetos, o encapsulamento é implementado usando modificadores de acesso, como "public", "private" e "protected".

Em resumo, o encapsulamento é um dos princípios-chave da programação orientada a objetos que visa esconder detalhes internos e fornecer uma interface controlada e consistente para interagir com objetos, melhorando a modularidade e a organização do código.

### Modificadores de acesso
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

Os modificadores de acesso são palavras-chave usadas em linguagens de programação, especialmente em linguagens orientadas a objetos, para controlar o nível de visibilidade e acesso aos membros (atributos e métodos) de uma classe ou estrutura de dados. Eles determinam quem pode acessar esses membros e de que maneira. Os modificadores de acesso são uma parte fundamental do encapsulamento, um dos princípios-chave da programação orientada a objetos.

- **public**: Os membros declarados como públicos são acessíveis a partir de qualquer lugar no programa. Isso significa que eles podem ser acessados por outras classes, objetos ou partes do programa sem restrições. Os membros públicos têm alta visibilidade, mas também podem aumentar a exposição dos detalhes internos de uma classe.
- **private**: Os membros declarados como privados são acessíveis apenas dentro da própria classe. Isso significa que eles são inacessíveis fora da classe em que foram definidos. Os membros privados são usados para ocultar os detalhes internos de uma classe e para fornecer um nível de proteção de dados.
- **protected**: Os membros declarados como protegidos são semelhantes aos membros privados, mas têm a diferença de que podem ser acessados por subclasses da classe em que foram definidos. Isso permite que as subclasses herdem e acessem esses membros, mas eles ainda são inacessíveis fora das subclasses.

Além desses três modificadores de acesso principais, algumas linguagens de programação também possuem outros modificadores mais específicos, como "internal" (acessível apenas dentro do módulo ou pacote atual), "package-private" (acessível apenas dentro do pacote) e assim por diante.

O uso adequado dos modificadores de acesso é essencial para aplicar o princípio da encapsulação e para criar classes bem projetadas e seguras. Eles permitem controlar a visibilidade e o acesso aos membros de uma classe, garantindo que somente as partes do código relevantes possam interagir com eles, o que ajuda a reduzir erros e tornar o código mais organizado e seguro.

### Regras de sobrescrita
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

Quando você está substituindo (override) um método em uma subclasse, as regras para o modificador de acesso (também conhecido como visibilidade) são geralmente determinadas pelas regras de herança e pelo sistema de controle de acesso da linguagem de programação em questão. Aqui estão algumas regras gerais relacionadas ao modificador de acesso no contexto do override de método:

- **Modificador de Acesso na Superclasse**: O método que você está substituindo na superclasse define o modificador de acesso inicial. Por exemplo, se o método na superclasse é público (public), protegido (protected) ou de pacote (package-private), a subclasse pode substituí-lo com um modificador de acesso igual ou menos restritivo, mas não mais restritivo.
- **Modificador de Acesso na Subclasse**: O modificador de acesso na subclasse pode ser igual ou menos restritivo do que o modificador de acesso na superclasse, mas não mais restritivo.

Aqui estão as combinações típicas:

- Se o método na superclasse é público (public), você pode substituí-lo com um modificador de acesso público ou protegido.
- Se o método na superclasse é protegido (protected), você pode substituí-lo com um modificador de acesso público, protegido ou de pacote.
- Se o método na superclasse é de pacote (package-private), você só pode substituí-lo com um modificador de acesso público ou de pacote dentro do mesmo pacote.

- **Modificador de Acesso na Subclasse não pode ser mais restritivo**: Você não pode usar um modificador de acesso mais restritivo (como private) ao substituir um método da superclasse, pois isso violaria o princípio da substituição. Se um método na superclasse é acessível a partir de classes externas, a subclasse não pode torná-lo menos acessível.

```java
class Superclasse {
  public void metodoPublico() { }
  protected void metodoProtegido() { }
  void metodoDePacote() { }
}

class Subclasse extends Superclasse {
  // Esses são exemplos válidos de override com modificador de acesso
  @Override
  public void metodoPublico() { }  // Modificador igual
  @Override
  protected void metodoProtegido() { }  // Modificador igual
  @Override
  void metodoDePacote() { }  // Modificador igual ou de pacote
}
```

Lembre-se de que essas regras podem variar dependendo da linguagem de programação, mas as diretrizes gerais mencionadas acima são aplicáveis à maioria das linguagens orientadas a objetos. Sempre consulte a documentação da linguagem específica que você está usando para obter detalhes precisos sobre o comportamento do modificador de acesso ao substituir métodos.
