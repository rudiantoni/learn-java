# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 3.2. Sistemas Numéricos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Homework
  - [Arquivo: HW - Number Systems](./02_arquivos/homework/HW%20-%20Number%20Systems.pdf)
  - [Homework: Conversão de hexadecimal](#homework-conversão-de-hexadecimal)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#sistema-numérico-hexadecimal)
- Conteúdo
  - [Bases](#bases)
  - [Sistema numérico binário](#sistema-numérico-binário)
  - [Sistema numérico octal](#sistema-numérico-octal)
  - [Sistema numérico hexadecimal](#sistema-numérico-hexadecimal)

### Bases
[[Topo]](#)<br />

- Binary: Base 2 (0, 1)
- Octal: Base 8 (0, 1, 2, 3, 4, 5, 6, 7)
- Decimal: Base 10 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
- Hexadecimal: Base 16 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

### Sistema numérico binário
[[Topo]](#)<br />

- Sistema de base 2 (possui apenas 2 caracteres)
- 0, 1

Para converter um número binário para decimal, você pode seguir os passos a seguir:

- Identifique o número binário que você deseja converter para decimal. Lembre-se de que os dígitos binários são 0 e 1.
- Comece a partir do dígito mais à direita do número binário (o bit menos significativo) e atribua a ele o valor 2^0 (1).
- Mova para a esquerda e, para cada dígito binário subsequente, dobre o valor atribuído ao dígito anterior. Portanto, o próximo dígito à esquerda tem um valor de 2^1 (2), o próximo é 2^2 (4), o seguinte é 2^3 (8), e assim por diante.
- Para cada dígito binário "1" no número binário, adicione o valor atribuído a ele à soma total.
- Repita o processo para todos os dígitos binários no número.
- A soma total é o equivalente decimal do número binário.

Aqui está um exemplo:
- Número binário: 1101
- Começando da direita para a esquerda:
```text
Binário: 1011
1 * 2^0 = 1
0 * 2^1 = 0
1 * 2^2 = 4
1 * 2^3 = 8
```

Agora some esses valores:
```text
1 + 0 + 4 + 8 = 13
```

Portanto, o número binário 1101 é equivalente a 13 em decimal.

### Sistema numérico octal
[[Topo]](#)<br />

- Sistema de base 8 (possui 8 caracteres)
- 0, 1, 2, 3, 4, 5, 6, 7

Para converter um número octal (base 8) em decimal (base 10), você pode seguir estes passos simples:

- Identifique o número octal que deseja converter para decimal.
- Comece do dígito mais à direita do número octal, que é o dígito menos significativo.
- Atribua a esse dígito o valor 8^0, que é igual a 1.
- Mova para a esquerda e, para cada dígito octal subsequente, dobre o valor atribuído ao dígito anterior. Portanto, o próximo dígito à esquerda tem um valor de 8^1 (8), o seguinte é 8^2 (64), o seguinte é 8^3 (512), e assim por diante.
- Para cada dígito octal, multiplique o valor atribuído a ele pelo dígito em si.
- Some todos os valores calculados para cada dígito octal no número.
- O resultado é o equivalente decimal do número octal.

Aqui está um exemplo:
- Número octal: 235
- Começando da direita para a esquerda:
```text
5 * 8^0 = 5
3 * 8^1 = 24
2 * 8^2 = 128
```

Agora some esses valores:
```text
5 + 24 + 128 = 157
```

Portanto, o número octal 235 é equivalente a 157 em decimal.

### Sistema numérico hexadecimal
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

- Sistema de base 16 (possui 16 caracteres)
- 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

Para converter um número hexadecimal (base 16) em decimal (base 10), você pode seguir estes passos simples:

- Identifique o número hexadecimal que deseja converter para decimal.
- Comece do dígito mais à direita do número hexadecimal, que é o dígito menos significativo.
- Atribua a esse dígito o valor 16^0, que é igual a 1.
- Mova para a esquerda e, para cada dígito hexadecimal subsequente, dobre o valor atribuído ao dígito anterior. Portanto, o próximo dígito à esquerda tem um valor de 16^1 (16), o seguinte é 16^2 (256), o seguinte é 16^3 (4096), e assim por diante.
- Para cada dígito hexadecimal, converta-o em seu equivalente decimal. Os dígitos hexadecimais variam de 0 a 9 e de A a F, onde A representa 10, B representa 11, C representa 12, D representa 13, E representa 14 e F representa 15.
- Multiplique o valor atribuído a cada dígito pelo equivalente decimal do dígito hexadecimal.
- Some todos os valores calculados para cada dígito hexadecimal no número.
- O resultado é o equivalente decimal do número hexadecimal.

Aqui está um exemplo:
- Número hexadecimal: 1A3
- Começando da direita para a esquerda:
```text
3 * 16^0 = 3
A (equivalente a 10 em decimal) = 10 * 16^1 = 160
1 * 16^2 = 256
```

Agora some esses valores:
```text
3 + 160 + 256 = 419
```

Portanto, o número hexadecimal 1A3 é equivalente a 419 em decimal.

### Homework: Conversão de hexadecimal

- Ver homework: [HW - Number Systems](./02_arquivos/homework/HW%20-%20Number%20Systems.pdf)

1. Pegue um pedaço de papel e faça alguns cálculos: Qual número decimal está codificado em
nome hexadecimal da banda de rock - ACDC?

Número hexadecimal: ACDC
- A (hex) = 10 (dec)
- B (hex) = 11 (dec)
- C (hex) = 12 (dec)
- D (hex) = 13 (dec)
- E (hex) = 14 (dec)
- F (hex) = 15 (dec)
```text
C = 12 * 16 ^ 0 = 12 * 1 = 12
D = 13 * 16 ^ 1 = 13 * 16 = 208
C = 12 * 16 ^ 2 = 12 * 256 = 3072
A = 10 * 16 ^ 3 = 10 * 4096 = 40960
Soma = 12 + 208 + 3072 + 40960 = 44252
```

**Resposta**: ACDC em hexadecimal equivale a 44252 em decimal.
