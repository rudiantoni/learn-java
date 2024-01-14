# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.7. Java Core parte 6: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**O QUE É REFLEXÃO (Reflection) EM JAVA?**

Reflexão em Java é usada para obter ou modificar informações de tipos durante a execução de um programa. Esse mecanismo permite obter informações sobre classes, interfaces, campos, métodos e construtores durante a execução do programa. Não é necessário conhecer os nomes das classes, métodos ou interfaces. Além disso, permite criar novos objetos, executar métodos e obter e definir valores de campos.

**O QUE SÃO INTERNACIONALIZAÇÃO E LOCALIZAÇÃO?**

- **Internacionalização (i18n)**: É uma maneira de construir aplicações de modo que possam ser facilmente adaptadas para diferentes públicos que falam diferentes idiomas. Consiste em preparar o código para suportar essa adaptação.
- **Localização (l10n)**: É a adaptação da interface da aplicação para vários idiomas. Envolve traduzir textos, formatar datas e números de acordo com a cultura local, entre outros aspectos.

**O QUE SÃO ANOTAÇÕES EM JAVA?**

As anotações em Java são uma espécie de metadados adicionados ao código, aplicados a declarações de pacotes, classes, construtores, métodos, campos, parâmetros e variáveis locais. Elas sempre têm alguma informação e vinculam esses "dados adicionais" a todas as construções de linguagem listadas. Na prática, as anotações são modificadores adicionais, cujo uso não acarreta mudanças no código previamente criado.

**QUAIS FUNÇÕES AS ANOTAÇÕES DESEMPENHAM?**

As anotações desempenham funções como:
- Fornecer informações necessárias ao compilador.
- Fornecer informações para várias ferramentas gerarem outro código, configurações, etc.
- Podem ser usadas durante a execução do código.

A anotação mais comum encontrada por programadores, até mesmo iniciantes, é `@Override`.

**O QUE FAZEM AS ANOTAÇÕES @Retention, @Documented, @Target E @Inherited?**

- `@Retention`: Define o ciclo de vida da anotação, especificando se ela estará presente apenas no código-fonte, no arquivo compilado ou também visível durante a execução.
- `@Documented`: Indica que a anotação deve ser documentada.
- `@Target`: Especifica os tipos de declaração aos quais a anotação pode ser aplicada (como campo, método, tipo, etc.).
- `@Inherited`: Indica que uma anotação é automaticamente herdada, permitindo que uma anotação de superclasse seja herdada em uma subclasse.

**O QUE FAZEM AS ANOTAÇÕES @Override, @Deprecated, @SafeVarargs E @SuppressWarnings?**

- `@Override`: Indica que um método deve sobrescrever um método da superclasse.
- `@Deprecated`: Indica que a declaração está obsoleta e deve ser substituída por uma forma mais recente.
- `@SafeVarargs`: Aplicada a métodos e construtores, especifica que nenhum comportamento inseguro associado à opção de número variável de argumentos é permitido.
- `@SuppressWarnings`: Especifica que um ou mais avisos emitidos pelo compilador devem ser suprimidos.

**QUAL O CICLO DE VIDA DE UMA ANOTAÇÃO QUE PODE SER ESPECIFICADO COM @Retention?**

Existem 3 opções possíveis para especificar onde a anotação será mantida. Elas estão encapsuladas no enum java.lang.annotation.RetentionPolicy. São elas: SOURCE, CLASS, RUNTIME.

- **SOURCE**: a anotação está contida apenas no arquivo fonte e é descartada ao compilar.
- **CLASS**: armazenada em um arquivo, no entanto, as anotações não estão disponíveis para a JVM em tempo de execução.
- **RUNTIME**: as anotações são armazenadas em um arquivo no momento da compilação e permanecem disponíveis para a JVM em tempo de execução.

**A QUAIS ELEMENTOS É POSSÍVEL APLICAR O SUMÁRIO (ALVO, TARGET) E COMO INDICÁ-LO?**

Para limitar o uso de uma anotação, ela deve ser anotada. Existe uma anotação @Target para isso.

- **@Target(ElementType.PACKAGE)**: apenas para pacotes;
- **@Target(ElementType.TYPE)**: apenas para classes;
- **@Target(ElementType.CONSTRUCTOR)**: apenas para construtores;
- **@Target(ElementType.METHOD)**: apenas para métodos;
- **@Target(ElementType.FIELD)**: apenas para atributos de classe (variáveis);
- **@Target(ElementType.PARAMATER)**: apenas para parâmetros de métodos;
- **@Target(ElementType.LOCAL_VARIABLE)**: apenas para variáveis locais.

**COMO CRIAR SUA PRÓPRIA ANOTAÇÃO?**

Escrever sua anotação não é tão difícil quanto pode parecer.

No lugar onde normalmente escrevemos class ou interface, escrevemos @interface.

A estrutura é quase a mesma que para interfaces, apenas escrevemos @interface.

@interface - indica que isso é uma anotação

default - indica que o método padrão retornará um determinado valor.

A anotação está pronta, agora ela pode ser usada, e a anotação também pode ser configurada. Você pode configurar @Target e @Retention para esta anotação.

**QUAIS TIPOS DE ATRIBUTOS SÃO PERMITIDOS EM ANOTAÇÕES?**

Os atributos só podem ter os seguintes tipos:

- primitivos
- String
- Class
- enum
- anotação
- um array de elementos de qualquer um dos tipos acima

O último ponto deve ser entendido como o fato de que apenas arrays unidimensionais são permitidos.

**QUAIS MECANISMOS GARANTEM SEGURANÇA NA TECNOLOGIA JAVA?**

Na tecnologia Java, a segurança é proporcionada pelos seguintes três mecanismos:

- funcionalidade estrutural da linguagem (por exemplo, verificação dos limites de arrays, a proibição de conversões de tipo não verificadas, a ausência de ponteiros, etc.).
- controles de acesso que determinam as ações que são permitidas ou proibidas de serem realizadas no código (por exemplo, se o código pode acessar arquivos, transferir dados pela rede, etc.).
- um mecanismo de assinatura digital que permite aos autores usar algoritmos padrão para autenticar seus programas e aos usuários determinar exatamente quem criou o código e se ele foi alterado desde que foi assinado.

**O QUE É REFATORAÇÃO?**

Refatoração é o processo de mudar a estrutura interna de um programa sem afetar seu comportamento externo e com o objetivo de facilitar a compreensão de como ele funciona. A refatoração baseia-se em uma série de pequenas transformações equivalentes (ou seja, que preservam o comportamento).
