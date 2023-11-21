# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## LinkedList vs ArrayList, e notação Big O
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [05_arquivos](./05_arquivos/)
- Homework
  - [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)
  - [content_title](content_link)
  - ...
- Projetos
  - [Projeto 1](./05_arquivos/proj_01/) [(iniciado em)](#linkedlist)
- (se existir exercícios) Exercícios
  - [Exercício N](folder_link-exercicio_nn) ([enunciado](#statement_content_link))
  - ...
- Conteúdo
  - [LinkedList](#linkedlist)
  - [Notação Big O](#notação-big-o)
  - [Diferenças entre Arraylist e LinkedList](#diferenças-entre-arraylist-e-linkedlist)

### LinkedList
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A LinkedList em Java é uma implementação da interface List e Deque, fornecendo uma lista duplamente ligada. Aqui estão alguns pontos-chave sobre como ela funciona:

Estrutura de Dados Duplamente Ligada: Cada elemento (nó) na LinkedList contém três partes: um dado, um ponteiro para o próximo nó da lista e um ponteiro para o nó anterior. Isso permite a navegação eficiente para frente e para trás na lista.

Inserção e Remoção Eficientes: Inserir ou remover elementos de uma LinkedList é geralmente mais rápido do que em um ArrayList, especialmente se as operações ocorrerem perto do início ou do final da lista, pois não há necessidade de redimensionar um array ou de realocar todos os elementos.

Acesso Sequencial: A LinkedList é menos eficiente para operações de acesso aleatório (como get(index)) em comparação com um ArrayList, porque é necessário percorrer a lista sequencialmente para chegar ao elemento desejado.

Uso de Memória: Cada elemento em uma LinkedList requer mais memória do que um ArrayList, pois além do dado, também armazena dois ponteiros para os nós adjacentes.

Implementa Deque: Além de ser uma lista, a LinkedList também implementa a interface Deque, o que significa que ela pode ser usada como uma fila duplamente terminada (double-ended queue), permitindo a adição ou remoção de elementos tanto do início quanto do final da lista.

Iteradores: A LinkedList fornece iteradores que permitem a navegação bidirecional (para frente e para trás) na lista.

Não é Sincronizada: Assim como a maioria das coleções em Java, a LinkedList não é sincronizada. Se múltiplas threads acessam uma LinkedList simultaneamente, e pelo menos uma delas modifica a lista, deve ser feito um controle manual de sincronização.

Nulos Permitidos: A LinkedList permite a inserção de elementos nulos.

Em resumo, a LinkedList é uma escolha ideal para aplicações que exigem inserções e remoções frequentes e eficientes, especialmente perto das extremidades da lista, e onde o acesso aleatório não é uma operação comum. No entanto, para acesso aleatório frequente, outras estruturas de dados, como o ArrayList, podem ser mais apropriadas.

### Notação Big O
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A notação Big O é uma maneira de expressar a eficiência de um algoritmo em termos de tempo e espaço, focando no pior cenário possível.

Vamos analisar a notação Big O para diferentes operações em uma LinkedList em Java:

**Inserção e remoção**
- **No início ou no final da lista**: O(1) – Como a LinkedList mantém referências para o primeiro e último elementos, adicionar ou remover elementos dessas posições é uma operação de tempo constante.
- **Em uma posição arbitrária**: O(n) – Em média, pode ser necessário percorrer metade da lista para encontrar a posição desejada, o que leva a um tempo proporcional ao tamanho da lista (n).

**Acesso a um elemento (Busca)**

- **Acesso por índice**: O(n) – Acessar um elemento por seu índice requer percorrer a lista a partir do início ou do final (o que for mais próximo) até o índice desejado.
Acesso por valor (busca): O(n) – Encontrar um elemento pelo seu valor também requer percorrer a lista até encontrar o elemento desejado.
- **Tamanho da Lista**:
Obter o tamanho da lista: O(1) – A LinkedList em Java mantém um contador do número de elementos, então obter o tamanho da lista é uma operação de tempo constante.

**Iteração sobre a lista**

- **Iterar toda a lista**: O(n) – Percorrer todos os elementos da lista requer tempo proporcional ao número de elementos.

**Adicionar ou remover do meio da lista**

- **Quando um iterador é usado**: O(1) – Se você já tem um iterador apontando para um determinado elemento da lista, adicionar ou remover um elemento naquela posição é uma operação de tempo constante. No entanto, isso não inclui o tempo necessário para posicionar o iterador na localização desejada, o que pode ser O(n).

Em resumo, a LinkedList é eficiente para operações de adição e remoção no início ou no final da lista, mas menos eficiente para acessos aleatórios e buscas, que requerem percorrer a lista linearmente. A escolha entre LinkedList e outras estruturas de dados como ArrayList deve considerar essas características de desempenho.

### Diferenças entre Arraylist e LinkedList
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

ArrayList e LinkedList são duas implementações comuns da interface List em Java, mas cada uma tem características e eficiências diferentes devido às suas estruturas de dados subjacentes. Vamos comparar essas duas classes:

**Estrutura de Dados**

- **ArrayList**: Baseia-se em um array dinâmico. O tamanho do array aumenta automaticamente se a coleção cresce além de sua capacidade.
- **LinkedList** Implementa uma lista duplamente ligada. Cada elemento (nó) contém dados e dois ponteiros para os nós seguinte e anterior.

**Performance**

- **Acesso a elementos**:
  - **ArrayList**: Acesso rápido a elementos via índice (O(1)), pois é um array.
  - **LinkedList**: Acesso lento a elementos via índice (O(n)), pois requer percorrer a lista desde o início ou fim.
- **Inserção/Remoção de Elementos**:
  - **ArrayList**: Lento para inserções e remoções, especialmente no início da lista ou no meio, pois requer deslocamento de elementos (O(n)).
  - **LinkedList**: Rápido para inserções e remoções em qualquer ponto da lista, especialmente eficiente no início e no fim (O(1) se o nó é conhecido, O(n) para encontrar o nó).
- **Memória**:
  - **ArrayList**: Mais eficiente em termos de memória, pois armazena apenas os dados.
  - **LinkedList**: Menos eficiente em termos de memória, pois cada elemento armazena os dados e dois ponteiros.

**Uso**

- **ArrayList** é geralmente preferido quando:
  - Há uma necessidade de acesso rápido a elementos via índice.
  - As adições e remoções são principalmente no final da lista.
  - A preocupação com o uso da memória é secundária em relação ao tempo de acesso.
- **LinkedList** é mais adequada quando:
  - As inserções e remoções frequentes são no início, fim ou em locais conhecidos da lista.
  - O acesso aleatório aos elementos é menos frequente.
  - A memória adicional para armazenar os ponteiros não é uma preocupação.

**Outras Considerações**

- **LinkedList** implementa adicionalmente a interface Deque, permitindo que ela seja usada como uma fila duplamente terminada.
- **ArrayList** precisa de tempo para redimensionar o array interno quando a coleção ultrapassa a capacidade atual, o que pode afetar o desempenho durante adições.

Em resumo, a escolha entre ArrayList e LinkedList depende do tipo de operações que são mais frequentes em seu programa. Se o acesso rápido a elementos é crítico e as alterações na lista são principalmente adições e remoções no final, ArrayList é a escolha mais eficiente. Por outro lado, se sua aplicação envolve muitas inserções e remoções em várias partes da lista, LinkedList pode ser mais adequada.

### Comparação de desempenho

- Ver homework: [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)

Para comparar a performance siga os próximos passos:

- Crie um objeto ArrayList e adicione 1000000 de elementos nele (adicione objetos Integer em um loop).
- Crie um objeto LinkedList e adicione 1000000 de elementos nele (adicione objetos Integer em um loop).
- Crie um método que recebe uma lista como um argumento e adicione uma quantidade específica de inteiros no início da lista.

Declaração do método:

```java
public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e adicione uma quantidade específica de inteiros no meio da lista.

Declaração do método:

```java
public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e adicione uma quantidade específica de inteiros no fim da lista.

Declaração do método:

```java
public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no início da lista.

Declaração do método:

```java
public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no meio da lista.

Declaração do método:

```java
public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no fim da lista.

Declaração do método:

```java
public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove)
```

- Execute as seguintes operações para ambos: LinkedList e ArrayList:
  - Adicione 100 elementos no final da lista
  - Adicione 10000 elementos no final da lista
  - Adicione 100000 elementos no final da lista
  - Adicione 100 elementos no meio da lista
  - Adicione 10000 elementos no meio da lista
  - Adicione 100000 elementos no meio da lista
  - Adicione 100 elementos no início da lista
  - Adicione 10000 elementos no início da lista
  - Adicione 100000 elementos no início da lista
  - Remova 100 elementos no final da lista
  - Remova 10000 elementos no final da lista
  - Remova 100000 elementos no final da lista
  - Remova 100 elementos no meio da lista
  - Remova 10000 elementos no meio da lista
  - Remova 100000 elementos no meio da lista
  - Remova 100 elementos no início da lista
  - Remova 10000 elementos no início da lista
  - Remova 100000 elementos no início da lista
- Tome nota dos tempos necessários para fazer cada operação de teste
- Nota técnica 1: para medir o tempo você pode capturar o tempo em um momento específico, após isso executar o método específicado, e após isso calcular o delta em tempo dessa maneira:

```java
long mill = System.nanoTime();
removeElementsFromEnd(list, 100);
long delta = (System.nanoTime() - mill) / 10000;
```

- Nota técnica 2: É permitido adicionar alguns valores contantes como Integer.MAX_VALUE.
- Não se esqueça de resetar o estado dos elementos para 1000000 cada bez antes de testar um novo cenário.
- Preencha a tabela com os resultados:

- Inserção
  - No início
    - 100 -> ArrayList: 3516 - LinkedList: 7
    - 10000 -> ArrayList: 197938 - LinkedList: 146
    - 100000 -> ArrayList: 2014137 - LinkedList: 92
  - No meio
    - 100 -> ArrayList: 1716 - LinkedList: 10706
    - 10000 -> ArrayList: 104550 - LinkedList: 983179
    - 100000 -> ArrayList: 1056346 - LinkedList: 9748600
  - No fim
    - 100 -> ArrayList: 7 - LinkedList: 6
    - 10000 -> ArrayList: 89 - LinkedList: 22
    - 100000 -> ArrayList: 463 - LinkedList: 126
- Remoção
  - No início
    - 100 -> ArrayList: 2407 - LinkedList: 7
    - 10000 -> ArrayList: 190826 - LinkedList: 104
    - 100000 -> ArrayList: 1794962 - LinkedList: 64
  - No meio
    - 100 -> ArrayList: 1522 - LinkedList: 10065
    - 10000 -> ArrayList: 96516 - LinkedList: 949488
    - 100000 -> ArrayList: 849686 - LinkedList: 8892841
  - No fim
    - 100 -> ArrayList: 5 - LinkedList: 8
    - 10000 -> ArrayList: 50 - LinkedList: 37
    - 100000 -> ArrayList: 318 - LinkedList: 65



- Após ter completado todos os passos você pode comparar seus resultados com o do seu tutor. Preste atenção aos resultados e os números serão diferentes. Mas o padrão será o mesmo.

Dados do tutor:

- Inserção
  - No início
    - 100 -> ArrayList: 13947 - LinkedList: 4
    - 10000 -> ArrayList: 267291 - LinkedList: 178
    - 100000 -> ArrayList: 1759892 - LinkedList: 281
  - No meio
    - 100 -> ArrayList: 2290 - LinkedList: 22908
    - 10000 -> ArrayList: 67520 - LinkedList: 2146884
    - 100000 -> ArrayList: 706177 - LinkedList: 36050328
  - No fim
    - 100 -> ArrayList: 2 - LinkedList: 3
    - 10000 -> ArrayList: 81 - LinkedList: 47
    - 100000 -> ArrayList: 449 - LinkedList: 294
- Remoção
  - No início
    - 100 -> ArrayList: 8608 - LinkedList: 7
    - 10000 -> ArrayList: 211366 - LinkedList: 48
    - 100000 -> ArrayList: 1748510 - LinkedList: 269
  - No meio
    - 100 -> ArrayList: 2278 - LinkedList: 30275
    - 10000 -> ArrayList: 67952 - LinkedList: 2242008
    - 100000 -> ArrayList: 672554 - LinkedList: 22345702
  - No fim
    - 100 -> ArrayList: 7 - LinkedList: 8
    - 10000 -> ArrayList: 101 - LinkedList: 151
    - 100000 -> ArrayList: 292 - LinkedList: 310

> Exercício 1 (LinkedList vs ArrayList, e notação Big O): [05_arquivos/exercicio_01](./05_arquivos/exercicio_01/)

### Refatorar array para List

- Ver homework: [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)




Se homework:
- Ver homework: [file_name_no_extension](file_link)

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)
