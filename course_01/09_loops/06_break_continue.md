# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Instruções de salto - break e continue
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [06_arquivos](./06_arquivos/)
- Projetos
  - [Projeto 1](./06_arquivos/) [(iniciado em)](#break-e-continue)
- Conteúdo
  - [Break e continue](#break-e-continue)
  - [Utilização](#utilização)
  - [Onde eles podem ser usados](#onde-eles-podem-ser-usados)
  - [Funcionamento em loops aninhados](#funcionamento-em-loops-aninhados)

### Break e continue
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

As instruções de salto break e continue são usadas em loops para controlar o fluxo de execução. Elas permitem que você saia precocemente de um loop (break) ou ignore a iteração atual e vá para a próxima (continue).

- **break**: A instrução break é usada para sair imediatamente de um loop, interrompendo a execução do loop e continuando com a próxima instrução após o loop.
- **continue**: A instrução continue é usada para pular a iteração atual de um loop e ir para a próxima iteração, ignorando o restante do código dentro do loop para a iteração atual.

### Utilização
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

Aqui estão exemplos de como usar as instruções de salto break e continue em loops:

**break**

```java
for (int i = 1; i <= 5; i++) {
  if (i == 3) {
    break; // Sai do loop quando i for igual a 3
  }
  System.out.println(i);
}
```

Neste exemplo, quando i se torna igual a 3, a instrução break é acionada e o loop é encerrado imediatamente.

**continue**

```java
for (int i = 1; i <= 5; i++) {
  if (i == 3) {
    continue; // Pula a iteração quando i for igual a 3
  }
  System.out.println(i);
}
```

Neste exemplo, quando i se torna igual a 3, a instrução continue é acionada, e a iteração atual é interrompida. O loop continua com a próxima iteração.

### Onde eles podem ser usados
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

As instruções break e continue podem ser usadas em loops for, while, e do-while.

Elas são utilizadas para controlar o fluxo de execução dentro desses loops.

### Funcionamento em loops aninhados
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

As instruções break e continue funcionam de maneira semelhante em loops aninhados. Quando usadas em um loop aninhado, elas afetam apenas o loop no qual são declaradas, não afetando loops externos. Aqui está um exemplo de como break e continue funcionam em loops aninhados:

```java
for (int i = 1; i <= 3; i++) {
  System.out.println("Iteração externa " + i);
  for (int j = 1; j <= 3; j++) {
    if (j == 2) {
      continue; // Pula a iteração interna quando j for igual a 2
    }
    System.out.println("  Iteração interna " + j);
  }
}
```

Neste exemplo, o continue é usado no loop interno para pular a iteração quando j é igual a 2. O break também pode ser usado para sair do loop interno ou do loop externo, dependendo de onde é colocado.

O resultado será:

```
Iteração externa 1
  Iteração interna 1
  Iteração interna 3
Iteração externa 2
  Iteração interna 1
  Iteração interna 3
Iteração externa 3
  Iteração interna 1
  Iteração interna 3
```

Observe que o continue afeta apenas o loop interno, pulando a iteração quando j é igual a 2, mas o loop externo continua normalmente.
