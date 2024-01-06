# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios 6 - Strings em Java
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [6.5. Expressões regulares em Java](#65-expressões-regulares-em-java)
    - [Arquivo: HW - Strings](./05_arquivos/homework/HW%20-%20Strings.pdf)
- Exercícios
  - [6.5. Expressões regulares em Java](#65-expressões-regulares-em-java)
    - Exercício 1 ([enunciado](#praticando-regex))
    - [Exercício 2](./exercicio_02/) ([enunciado](#formatando-mathpi))
    - [Exercício 3](./exercicio_03/) ([enunciado](#separando-palavras))

### 6.5. Expressões regulares em Java

#### Praticando regex
[[Topo]](#)<br />

- Ver homework: [HW - Strings](./05_arquivos/homework/HW%20-%20Strings.pdf)

Completar 15 (16) lições do site: https://regexone.com/

1. Combinar em todas as palavras selecionando totalmente pelo menos uma delas: `abcdefg`, `abcde`, `abc`
  - Resposta: `abc`
2. Combinar em todas as palavras selecionando todos os números: `abc123xyz`, `define "123"`, `var g = 123`
  - Resposta: `123`
3. Combinar tudo em `cat.`, `896.` e `?=+.` mas nada em `abc1`
  - Resposta: `...\.`
4. Combinar tudo em `can`, `man` e `fan` mas nada em `dan`, `ran` e `pan`
  - Resposta: `[cmf]an`
5. Combinar tudo em `hog` e `dog` mas nada em `bog`
  - Resposta: `[^b]og`
6. Combinar tudo em `Ana`, `Bob` e `Cpc` mas nada em `aax`, `bby` e `ccz`
  - Resposta: `[A-C][n-p][a-c]`
7. Combinar tudo em `wazzzzzup` e `wazzzup` mas nada em `wazup`
  - Resposta: `[waz{3,}up]`
8. Combinar tudo em `aaaabcc`, `aabbbbc` e `aacc` mas nada em `a`
  - Resposta: `aa+b*c+`
9. Combinar tudo em `1 file found?`, `2 files found?` e `24 files found?` mas nada em `No files found`
  - Resposta: `[0-9][0-9]?.*\?`
10. Combinar tudo em `1.   abc`, `2.	abc` e `3.           abc` mas nada em `4.abc`
  - Resposta: `\d\.\s+abc`
11. Combinar tudo em `Mission: successful` mas nada em `Last Mission: unsuccessful` e `Next Mission: successful upon capture of target`
  - Resposta: `^Mission: successful$`
12. Combinar tudo em ``file_record_transcript.pdf` (grupo: *file_record_transcript*) e `file_07241999.pdf` (grupo: *file_07241999*) mas nada em `testfile_fake.pdf.tmp`
  - Resposta: `^(file.+)\.pdf$`
13. Combinar tudo em `Jan 1987` (grupo: *Jan 1987* e *1987*), `May 1969` (grupo: *May 1969* e *1969*) e `Aug 2011` (grupo: *Aug 2011* e *2011*)
  - Resposta: `(\w+ (\d+))`
14. Combinar tudo em `1280x720` (grupo:  *1280* e *720*), `1920x1600` (grupo: *1920* e *1600*) e `1024x768` (grupo: *1024* e *768*).
  - Resposta: `((\d+)x(\d+))`
15. Combinar tudo em `I love cats` e `I love dogs` mas nada em `I love logs` e `I love cogs`.
  - Resposta: `I love (cats|dogs)`
16. Combinar tudo em `The quick brown fox jumps over the lazy dog.`, `There were 614 instances of students getting 90.0% or above.` e `The FCC had to censor the network for saying &$#*@!.`
  - Resposta: `.*`

> Exercício 1 (Expressões regulares em Java)

#### Formatando Math.PI
[[Topo]](#)<br />

- Ver homework: [HW - Strings](./05_arquivos/homework/HW%20-%20Strings.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
1. O programa inicia e imprime o valor de Math.PI cinco vezes na saída do console.
2. A primeira vez que Math.PI for impresso, ele deve conter apenas uma casa decimal.
3. A segunda vez que Math.PI for impresso, ele deve conter duas casas decimais.
4. A terceira vez que Math.PI for impresso, ele deve conter três casas decimais.
5. A quarta vez que Math.PI for impresso, ele deve conter quatro casas decimais.
6. A quinta vez que Math.PI for impresso, ele deve conter cinco casas decimais.

> Exercício 2 (Expressões regulares em Java): [exercicio_02](./exercicio_02/)

#### Separando palavras
[[Topo]](#)<br />

- Ver homework: [HW - Strings](./05_arquivos/homework/HW%20-%20Strings.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
1. O programa inicia e solicita ao usuário que insira qualquer texto.
2. O programa imprime um array de palavras inseridas pelo usuário sem espaços ou sinais de pontuação.

> Exercício 3 (Expressões regulares em Java): [exercicio_03](./exercicio_03/)
