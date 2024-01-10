# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 17.11. LinkedHashMap
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [11_arquivos](./11_arquivos/)
- Projetos
  - [Projeto 1](./11_arquivos/proj_01/) [(iniciado em)](#o-que-é-linkedhashmap)
- Conteúdo
  - [O que é LinkedHashMap](#o-que-é-linkedhashmap)
  - [Ordem de acesso VS ordem de inserção](#ordem-de-acesso-vs-ordem-de-inserção)
  - [Cache](#cache)
  - [Limitar elementos no LinkedHashMap](#limitar-elementos-no-linkedhashmap)

### O que é LinkedHashMap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./11_arquivos/proj_01/)

LinkedHashMap em Java é uma implementação de mapa que combina as características de HashMap e LinkedList. Ela estende HashMap, mantendo uma lista duplamente encadeada das entradas do mapa. Aqui estão alguns pontos chave sobre o LinkedHashMap:

- **Ordem de iteração**: Ao contrário do HashMap, que não garante nenhuma ordem para iteração, o LinkedHashMap mantém uma ordem de iteração previsível, que é geralmente a ordem na qual as chaves foram inseridas (ordem de inserção).
- **Modos de acesso**: O LinkedHashMap pode ser configurado em dois modos:
  - **Ordem de inserção**: Este é o comportamento padrão, onde as entradas são iteradas na ordem em que foram inseridas no mapa.
  - **Ordem de acesso**: Neste modo, o acesso a uma entrada move essa entrada para o final da lista. Isso é útil para estratégias de cache, como o cache Least Recently Used (LRU).
- **Performance**: O LinkedHashMap oferece quase a mesma performance de um HashMap em termos de tempo de inserção, exclusão e localização: O(1) sob condições normais. A diferença está na manutenção da lista encadeada, que adiciona uma pequena sobrecarga em comparação com o HashMap.
- **Uso de memória**: Devido à lista encadeada adicional, o LinkedHashMap consome mais memória do que um HashMap para armazenar a mesma quantidade de dados.
- **Uso**: O LinkedHashMap é frequentemente usado em situações onde é necessário manter a ordem de inserção, ou para implementações de cache LRU, devido à sua capacidade de acessar, inserir e iterar elementos de maneira eficiente enquanto mantém a ordem.
- **Herança**: Como uma subclasse de HashMap, o LinkedHashMap herda métodos como put(), get(), remove(), entre outros, e os implementa de maneira a manter a ordem de inserção ou de acesso, conforme configurado.

O LinkedHashMap é, portanto, uma escolha poderosa quando você precisa de um mapa que mantém a ordem de inserção ou acesso dos elementos, além de fornecer todas as funcionalidades de um mapa baseado em hash.

###  Ordem de acesso VS ordem de inserção
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./11_arquivos/proj_01/)

A diferença entre a ordem de acesso e a ordem de inserção em um LinkedHashMap em Java é uma característica importante que afeta a forma como os elementos são armazenados e acessados dentro da coleção. Vamos explorar cada uma delas:

#### Ordem de acesso

- **Definição**: Na ordem de acesso, os elementos são ordenados com base no seu último acesso. Sempre que um elemento é acessado (por meio de operações como get() ou put()), ele é movido para o final da lista. Isso significa que o elemento mais recentemente acessado estará no final da lista, enquanto os elementos menos acessados estarão no início.
- **Uso comum**: Este modo é particularmente útil para implementações de cache, como o cache LRU (Least Recently Used). Em um cache LRU, você geralmente quer descartar os elementos que foram menos recentemente acessados quando o cache está cheio. A ordem de acesso no LinkedHashMap facilita a identificação e remoção dos itens menos usados.
- **Configuração**: Para habilitar a ordem de acesso, você precisa criar um LinkedHashMap com o construtor que aceita um parâmetro booleano accessOrder. Definir este parâmetro como true ativa o modo de ordem de acesso.

```java
Map<KeyType, ValueType> cache = new LinkedHashMap<>(16, 0.75f, true); // true para ordem de acesso
```

Em resumo, a escolha entre ordem de acesso e ordem de inserção em um LinkedHashMap depende do uso específico. Se você precisa manter a ordem cronológica de inserção, use a ordem de inserção. Se você está implementando um algoritmo de cache onde os itens mais recentemente acessados são os mais importantes, a ordem de acesso é a mais adequada.

#### Ordem de inserção

- **Definição**: Na ordem de inserção, os elementos no LinkedHashMap são ordenados na sequência em que foram adicionados ao mapa. O primeiro elemento inserido é o primeiro na ordem de iteração, seguido pelo segundo elemento inserido, e assim por diante.
- **Uso comum**: Este modo é usado quando é importante preservar a ordem cronológica de inserção dos elementos. Por exemplo, se você está registrando eventos ou mantendo um histórico de operações, a ordem de inserção ajudaria a rastrear a sequência dos eventos como ocorreram.
- **Comportamento padrão**: Este é o comportamento padrão de um LinkedHashMap se não for especificado de outra forma.

### Cache
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./11_arquivos/proj_01/)

O cache é um conceito fundamental em computação que se refere a uma forma de armazenamento temporário e rápido, usado para melhorar a eficiência e a velocidade de acesso a dados frequentemente usados. O cache pode ser encontrado em diferentes níveis e formas dentro de um sistema computacional. Aqui estão alguns aspectos importantes do cache:

#### Propósito

O principal objetivo de um cache é armazenar cópias temporárias de dados que são acessados com frequência, permitindo que futuros acessos a esses dados sejam realizados mais rapidamente. Isso é particularmente útil quando o acesso aos dados originais é demorado, como pode ser o caso ao recuperar informações de um disco rígido ou de uma rede.

#### Níveis de cache

- **Cache de hardware**: Encontrado em processadores (como cache L1, L2, L3) e outros componentes de hardware, esse tipo de cache armazena instruções e dados para acesso rápido pelo processador.
- **Cache de software**: Implementado em nível de software, como em navegadores da web (para armazenar páginas da web frequentemente acessadas) ou em sistemas de banco de dados (para armazenar resultados de consultas recorrentes).

#### Tipos de Cache

- **Cache de memória**: Armazena dados temporariamente em uma memória de acesso rápido, reduzindo o tempo de acesso em comparação com a leitura de dados de unidades de armazenamento mais lentas.
- **Cache de disco**: Usa uma porção do disco rígido ou um disco de estado sólido para armazenar dados temporariamente. Embora mais lento do que o cache de memória, é mais rápido que acessar dados diretamente do disco.

#### Cache na programação

Em programação, o cache é usado para armazenar resultados de operações computacionalmente intensivas, dados frequentemente acessados ou informações que não mudam frequentemente.

Frameworks e bibliotecas de cache, como o Redis, Memcached, entre outros, são usados para implementar sistemas de cache em aplicações.

Eficiência: Um cache eficaz reduz significativamente o tempo de acesso aos dados e melhora o desempenho geral do sistema. No entanto, gerenciar o cache (decidir quais dados armazenar, quando atualizar ou descartar dados) é crucial para manter sua eficiência.

#### Políticas de cache

Algoritmos como Least Recently Used (LRU), First In First Out (FIFO), e Least Frequently Used (LFU) são usados para gerenciar quais dados são mantidos no cache e quais são descartados quando o espaço no cache é limitado.

Em resumo, o cache é uma técnica usada em praticamente todos os níveis de um sistema computacional para otimizar a velocidade e a eficiência no acesso a dados. Seu uso abrange desde o hardware, como nos processadores, até aplicações de software e serviços da web.

### Limitar elementos no LinkedHashMap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./11_arquivos/proj_01/)

Para limitar o número de elementos em um LinkedHashMap em Java, você pode sobrescrever o método `removeEldestEntry(Map.Entry<K,V> eldest)`. Este método é chamado automaticamente cada vez que um novo elemento é adicionado ao mapa. Ao retornar true neste método, você instrui o LinkedHashMap a remover a entrada mais antiga do mapa. Isso é útil para criar um mapa de tamanho fixo, como em implementações de cache LRU (Least Recently Used).

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
  private final int capacity;

  public LimitedLinkedHashMap(int capacity) {
    super(capacity, 0.75f, true); // Capacidade inicial, fator de carga e ordem de acesso
    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    return size() > capacity;
  }
}
```

Neste exemplo:

- capacity é o número máximo de elementos que você deseja manter no LinkedHashMap.
- O método removeEldestEntry() retorna true se o número de elementos no mapa for maior que a capacidade especificada. Isso sinaliza para o LinkedHashMap remover a entrada mais antiga.
- O construtor da classe LimitedLinkedHashMap pode receber a capacidade desejada, e você pode ajustá-la de acordo com suas necessidades.
- O parâmetro true no superconstrutor configura o LinkedHashMap para usar a ordem de acesso, o que significa que cada vez que um item é acessado, ele é movido para o final da lista. Se você quiser manter a ordem de inserção, altere esse valor para false.
- Essa abordagem é especialmente útil para implementações de cache, onde você quer restringir o número de entradas armazenadas para evitar o uso excessivo de memória.
