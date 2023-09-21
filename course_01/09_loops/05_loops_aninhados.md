# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Loops aninhados
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [05_arquivos](./05_arquivos/)
- Projetos
  - [Projeto 1](./05_arquivos/proj_01/) [(iniciado em)](#aninhamento-de-loops)
- Conteúdo
  - [Aninhamento de loops](#aninhamento-de-loops)

### Aninhamento de loops
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O aninhamento de loops refere-se à prática de colocar um loop dentro de outro loop. Isso é útil quando você precisa realizar iterações em múltiplas dimensões ou executar loops dentro de loops para manipular dados de maneira mais complexa. Você pode aninhar loops for, while ou do-while em Java.

Aqui está um exemplo de aninhamento de loops usando um loop for:

```java
for (int i = 1; i <= 3; i++) {
  for (int j = 1; j <= 3; j++) {
    System.out.println("i: " + i + ", j: " + j);
  }
}
```

Neste exemplo, temos dois loops for aninhados. O loop externo itera sobre i de 1 a 3, e o loop interno itera sobre j de 1 a 3 para cada valor de i. Isso resultará na impressão de todas as combinações possíveis de i e j:

```
i: 1, j: 1
i: 1, j: 2
i: 1, j: 3
i: 2, j: 1
i: 2, j: 2
i: 2, j: 3
i: 3, j: 1
i: 3, j: 2
i: 3, j: 3
```

O aninhamento de loops é frequentemente usado em situações como processamento de matrizes bidimensionais, gerando combinações, manipulação de dados em várias dimensões, entre outros. No entanto, é importante usar o aninhamento com cuidado, pois pode aumentar a complexidade do código e torná-lo mais difícil de entender e depurar. Certifique-se de que o aninhamento seja necessário para resolver o problema específico em mãos.
