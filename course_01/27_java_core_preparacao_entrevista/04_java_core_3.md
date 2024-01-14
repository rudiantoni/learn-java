# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.4. Java Core parte 3: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**É POSSÍVEL ALTERAR AO SOBRESCREVER UM MÉTODO**

1. **Modificador de acesso**: Sim, se você expandir (package -> protected -> public).
2. **Tipo de retorno**: Sim, se for realizado um downcasting (conversão descendente na hierarquia), ou seja, o tipo de retorno no método sobrescrito da classe herdeira não deve ser mais amplo que na classe pai (Object -> Number -> Integer).
3. **Tipo ou número de argumentos**: Não, nesse caso ocorre uma sobrecarga (overload), e não uma sobrescrita.
4. **Nome do argumento**: Sim.
5. **Alterar a ordem, quantidade ou remover completamente a seção throws**: É possível alterar a ordem. É possível remover completamente a seção throws do método, uma vez que já está definida. Também é possível adicionar novas exceções que herdam de exceções declaradas ou runtime exceptions.

A sobrescrita de método é válida quando classes são herdadas, ou seja, um método com a mesma assinatura é declarado na classe descendente como na classe pai. Isso significa que este método sobrescreveu o método de sua superclasse.

Alguns pontos sobre isso:

- O modificador de acesso no método da classe descendente não deve ser mais restritivo que na classe pai, caso contrário, ocorrerá um erro de compilação.
- A descrição da exceção no método sobrescrito da classe descendente não deve ser mais ampla que na classe pai, caso contrário, aparecerá um erro de compilação.
- Um método declarado como "privado" em uma classe pai não pode ser sobrescrito!

**O QUE É AUTOBOXING?**

Autoboxing/Unboxing é a conversão automática entre tipos primitivos do Java e seus tipos de wrapper correspondentes (por exemplo, entre int e Integer). Ter essa capacidade reduz o código porque elimina a necessidade de realizar conversões de tipo explícitas em casos óbvios.

**O QUE SÃO GENÉRICOS?**

"Java Generics" é um termo técnico para um conjunto de recursos da linguagem que permitem definir e usar tipos e métodos genéricos. Tipos ou métodos genéricos diferem dos regulares pelo fato de terem parâmetros tipados.

Um exemplo de genéricos ou tipos genéricos é a biblioteca de coleções em Java. Por exemplo, a classe `LinkedList<E>` é um tipo genérico típico. Ela contém um parâmetro E que representa o tipo de elementos que serão armazenados na coleção. Em vez de apenas usar LinkedList sem dizer nada sobre o tipo de elemento na lista, podemos usar `LinkedList<String>` ou `LinkedList<Integer>`. Objetos de tipo genérico são criados substituindo tipos parametrizados por tipos de dados reais.

Usando genéricos, você pode descrever classes, métodos e propriedades em diferentes níveis de abstração e depois usar instâncias da classe parametrizadas por qualquer tipo.

**COMO AS VARIÁVEIS SÃO PASSADAS PARA MÉTODOS, POR VALOR OU POR REFERÊNCIA?**

Em Java, os parâmetros são passados para métodos por valor, ou seja, cópias dos parâmetros são criadas e trabalhadas dentro do método. No caso de tipos primitivos, ao passar um parâmetro, a variável em si não muda, pois seu valor é simplesmente copiado para o método.

Mas, ao passar um objeto, uma referência ao objeto é copiada, ou seja, se mudarmos o estado do objeto dentro do método, então o estado do objeto também mudará após o método. No entanto, se tentarmos atribuir uma nova referência a este objeto à cópia da referência, a referência original não mudará.

Podemos dizer que tudo em Java é passado por valor. Mas no caso de tipos de referência, passamos a cópia da variável, e no caso de tipos primitivos, passamos a cópia do primitivo.

**REGRAS PARA REDEFINIÇÃO DO MÉTODO Object.equals()**

1. Use o operador `==` para testar a referência do objeto passado ao método equals. Se as referências coincidirem, retorne `true`. Isso é mais para otimização, mas pode economizar tempo em comparações "pesadas".
2. Use o operador `instanceof` para verificar o tipo de um argumento. Se os tipos não coincidirem, retorne `false`.
3. Converta o argumento para o tipo correto. Como já realizamos a verificação no passo anterior, a conversão é adequada.
4. Compare todos os campos significativos dos objetos entre si. Se todos os campos forem iguais, retorne `true`. Use `==` para comparar tipos simples. Para campos com referências a objetos, use `equals`.
5. Converta `float` para `int` com `Float.floatToIntBits` e compare com `==`.
6. Converta `double` para `long` com `Double.doubleToLongBits` e compare com `==`.
7. Para coleções, as regras acima se aplicam a cada elemento da coleção. É necessário considerar a possibilidade de campos/objetos nulos. A ordem na qual os campos são comparados pode ter um impacto significativo no desempenho.

Uma vez que você tenha terminado de implementar `equals`, pergunte-se se o método é simétrico, transitivo e consistente.

E mais uma regra: ao sobrescrever `equals`, sempre sobrescreva `hashCode` pelo bem das tabelas hash.

**SE VOCÊ QUISER SOBRESCREVER equals(), QUAIS CONDIÇÕES DEVEM SER SATISFEITAS PARA UM MÉTODO SOBRESCRITO?**

O método `equals()` denota uma relação de equivalência de objetos. Uma relação de equivalência é aquela que é simétrica, transitiva e reflexiva.

- Reflexividade: para qualquer x não nulo, x.equals(x) deve retornar `true`;
- Transitividade: para quaisquer x, y e z não nulos, se x.equals(y) e y.equals(z) retornarem `true`, então x.equals(z) também deve retornar `true`;
- Simetria: para quaisquer x e y não nulos, x.equals(y) deve retornar `true` se e somente se y.equals(x) retornar `true`.
- Além disso, para qualquer x não nulo, x.equals(null) deve retornar `false`.

**QUAL É A RELAÇÃO ENTRE hashCode E equals?**

Objetos são iguais quando a.equals(b) = true e a.hashCode() == b.hashCode() -> verdadeiro.

No entanto, não é necessário que dois objetos diferentes retornem diferentes hash codes (essa situação é chamada de colisão). Isso é possível porque hashCode retorna um valor do tipo int, e o valor int tem seus limites, enquanto o conjunto de objetos teoricamente pode ser próximo do infinito.

**O QUE ACONTECERÁ SE equals FOR SOBRESCRITO SEM SOBRESCREVER hashCode? QUAIS PROBLEMAS PODEM APARECER?**

Os elementos em estruturas de dados baseadas em tabelas de hash, como HashMap e HashSet, não poderiam ser encontrados. Isso ocorre porque, para uma busca rápida, a estrutura de dados baseada em tabela de hash calcula o hashCode de cada elemento para definir o balde onde colocar o elemento. Também usa o método hashCode() para encontrar o balde onde o elemento está localizado quando é hora de recuperar o elemento. Uma vez encontrado, o elemento é comparado com o elemento que usamos como critério de busca através do método equals(). Portanto, equals() e hashCode() trabalham juntos, e é importante sobrescrever o método hashCode() também.

**HÁ ALGUMA RECOMENDAÇÃO SOBRE QUAIS CAMPOS DEVEM SER USADOS NO CÁLCULO DO hashCode?**

Sim, há. É necessário usar campos únicos, preferencialmente primitivos, como id ou uuid, por exemplo. Além disso, se esses campos estão envolvidos no cálculo de hashCode, então você precisa usá-los ao executar equals.

Conselho geral: escolha campos que provavelmente sejam diferentes. E use os mesmos campos que você usou no método equals() para comparação.

**PARA QUE SERVE O MÉTODO hashCode()?**

Existem coleções (HashMap, HashSet) que usam o código hash como base para trabalhar com objetos. E se o hash para objetos iguais for diferente, então o HashMap terá dois valores iguais, o que é um erro. Portanto, é necessário sobrescrever o método hashCode() adequadamente.

Hashing é a conversão de um array de dados de entrada de comprimento arbitrário em uma string de bits de comprimento fixo. Tais transformações também são chamadas de funções hash ou funções de convolução, e seus resultados são chamados de hashes ou códigos hash.

Uma tabela hash é uma estrutura de dados que implementa a interface de um array associativo, ou seja, permite armazenar pares (chave, valor) e realizar pelo menos três operações principais: adicionar um novo par, buscar e deletar um par pela chave.

**REGRAS PARA REDEFINIÇÃO DO MÉTODO Object.hashCode()**

A implementação de hashCode() usa algumas regras simples. Primeiramente, ao calcular o código hash, você deve usar os mesmos campos que são comparados no método equals(). Isso dará igualdade de hash codes para objetos iguais e distribuirá o valor resultante da mesma forma que os dados originais. Teoricamente, você pode fazer o hash code ser sempre igual a 0, e isso seria uma implementação legal. No entanto, isso não traria nenhum benefício prático.

Embora os códigos hash de objetos iguais devam ser iguais, o inverso não é verdadeiro! Dois objetos desiguais podem ter códigos hash iguais.

Outro requisito importante para o método hashCode() é a velocidade de cálculo, pois isso tem que ser feito com frequência. Portanto, em alguns casos, faz sentido calcular o hash code antecipadamente e simplesmente emiti-lo sob demanda. Isso deve ser feito principalmente quando o cálculo é longo, pesado e o objeto é imutável.
