# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.6. Java Core parte 5: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**CARACTERÍSTICAS DA CLASSE String E O MÉTODO intern()**

A classe String em Java possui várias características únicas:

1. **Imutabilidade**: Uma vez criada, o estado interno de um objeto String não pode ser alterado. Por exemplo, ao concatenar duas strings, um novo objeto String é criado ao invés de alterar um existente.
2. **Classe final**: String é declarada como final (`public final class String`), o que significa que não pode ser herdada.

3. **Método intern()**: O método `intern()` retorna uma representação canônica da string a partir do pool interno de strings mantido pela JVM. Isso permite usar o operador `==` em vez de `String.equals()` para comparações de referência, o que é mais rápido que a comparação caracter a caracter. O método `intern()` busca no pool de strings a presença da string específica e, se já existir no pool, retorna uma referência a ela.

**É POSSÍVEL HERDAR O TIPO String? POR QUÊ?**

Não, não é possível herdar de String, porque a classe String é final. Classes finais não podem ser estendidas.

**DESCREVA O QUE É UM "String POOL"**

Um pool de strings é uma coleção de strings armazenadas na memória heap do Java. Strings em Java são especiais, e podemos criar objetos dessa classe usando o operador `new` ou fornecendo um valor de string entre aspas duplas.

O pooling de strings é possível devido à imutabilidade das strings em Java e à implementação da ideia de internação de strings. O pool de strings ajuda a economizar muita memória, mas, por outro lado, a criação de uma string leva mais tempo. Ao usar aspas duplas para criar uma string, primeiro procura-se por uma string no pool com o mesmo valor; se encontrada, simplesmente retorna-se uma referência a ela; caso contrário, uma nova string é criada no pool.

**POR QUE A String É UMA CHAVE POPULAR EM UM HashMap EM JAVA?**

Devido à sua imutabilidade, o hashcode de uma String é calculado no momento da criação e não precisa ser recomputado. Isso torna as strings excelentes candidatas para chaves em um Map, e elas processam mais rápido do que outros objetos-chave do HashMap. Além disso, como o objeto String é imutável, você não pode perder o valor associado à chave String, pois a chave String não pode ser alterada ou modificada.

**O ACESSO À String PODE SER SINCRONIZADO?**

Não há sentido em sincronizar o acesso a objetos do tipo String, pois todos são imutáveis. Se você deseja trabalhar com strings mutáveis e sincronizar o acesso a elas, deve usar a classe StringBuffer.

**COMO COMPARAR CORRETAMENTE OS VALORES DE String DE DOIS OBJETOS DIFERENTES DOS TIPOS String E StringBuffer?**

Para compará-los corretamente, você deve trazer ambos para o mesmo tipo e comparar. Por exemplo, você pode converter um objeto StringBuffer em uma String usando o método `toString()` e, em seguida, comparar as duas strings usando o método `equals()`.

**POR QUE A String É IMUTÁVEL E FINALIZADA EM JAVA?**

Existem várias vantagens na imutabilidade das strings:

- **Economia de memória**: O pool de strings só é possível porque a string é imutável em Java, assim a máquina virtual economiza muito espaço no heap, já que diferentes variáveis de string apontam para a mesma variável no pool. Se a string não fosse imutável, então o internamento de strings não seria possível, porque se qualquer variável alterasse seu valor, o restante das variáveis que se referem àquela string também seriam afetadas.
- **Segurança**: Se a string fosse mutável, então ela se tornaria um sério risco de segurança para a aplicação. Por exemplo, o nome de usuário e a senha do banco de dados são passados como uma string para obter uma conexão com o banco de dados, e na programação de sockets, detalhes do host e da porta são passados como uma string. Como a string é imutável, seu valor não pode ser alterado, caso contrário, qualquer hacker poderia mudar o valor do link e causar problemas de segurança para a aplicação.
- **Carregamento correto no ClassLoader**: Strings são usadas no classloader do Java e a imutabilidade garante que a classe seja corretamente carregada pelo Classloader. Por exemplo, pense na instância da classe quando você está tentando carregar a classe java.sql.Connection, mas o valor da referência é alterado para a classe myhacked.Connection, que pode fazer coisas indesejadas no seu banco de dados.
- **Uso em hash tables**: Como a string é imutável, seu hashcode é armazenado em cache no momento da criação e não há necessidade de calculá-lo novamente. Isso torna a string uma excelente candidata para chave de um Map e será mais rápida de processar do que outras chaves de HashMap. Essa é a razão pela qual a string é o objeto mais comumente usado como chave de um HashMap.
