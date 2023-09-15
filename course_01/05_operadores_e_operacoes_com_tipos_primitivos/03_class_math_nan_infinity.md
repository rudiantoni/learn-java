# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Classe Math, NaN, Infinity
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#classe-math)
- Conteúdo
  - [Classe Math](#classe-math)
  - [Números aleatórios](#números-aleatórios)
  - [Operações com decimais](#operações-com-decimais)

### Classe Math
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Existem vários métodos e atributos, na classe Math, segue uma lista dos mais utilizados.

- **Math.PI**: Retorna o valor da constante matemática π (pi), que é aproximadamente 3.141592653589793.
- **Math.max(x, y)**: Retorna o maior valor entre x e y.
- **Math.min(x, y)**: Retorna o menor valor entre x e y.
- **Math.sqrt(x)**: Retorna a raiz quadrada de x.
- **Math.abs(x)**: Retorna o valor absoluto de x.
- **Math.round(x)**: Arredonda o número x para o valor inteiro mais próximo.

### Números aleatórios
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Com a classe Math, também é possível gerar alguns números aleatórios, seguem algumas maneiras:

- **Math.random()**: Retorna um número pseudoaleatório entre 0.0 (inclusivo) e 1.0 (exclusivo), ou seja, um número decimal aleatório no intervalo entre 0.0 e 1.0.
- **(int) (Math.random() * 100)**: Gera um número inteiro aleatório entre 1 e 100, convertendo o resultado de Math.random() em um número inteiro.
**(int) (Math.random() * 100) + 100**: Gera um número inteiro aleatório entre 100 e 200, adicionando 100 ao resultado anterior.

### Operações com decimais
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

É importante verificar que ao realizarmos operações com números decimais, podemos ter que lidar com alguns valores diferentes de resultados inesperados.

- **0 / 0.0**: Qualquer tentativa de dividir zero por zero resulta em NaN, pois a operação é indefinida na matemática.
- **(0 / 0.0) + 5**: Adicionar qualquer valor a NaN ainda resulta em NaN. Portanto, o resultado é NaN.
- **5 / 0.0**: Dividir um número por zero (0.0) positivo resulta em Infinity (Infinito Positivo).
- **-5 / 0.0**: Dividir um número negativo por zero (0.0) positivo resulta em -Infinity (Infinito Negativo).

Você pode identificar se um valor é *NaN* (Not-a-Number) usando a função `Double.isNaN(valor)` (para doubles) ou `Float.isNaN(valor)` (para floats). Isso retorna *true* se o valor for *NaN* e *false* caso contrário.

Para verificar se um valor é *Infinity* (infinito positivo), você pode usar `Double.isInfinite(valor)`/`Float.isInfinite(valor)` juntamente com uma verificação adicional para garantir que o valor seja positivo (maior que 0).

Da mesma forma, para verificar se um valor é -Infinity (infinito negativo), use `Double.isInfinite(valor)`/`Float.isInfinite(valor)` e uma verificação adicional para garantir que o valor seja negativo (menor que 0).
