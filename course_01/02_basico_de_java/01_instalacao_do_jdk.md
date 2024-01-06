# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 2.1. Instalação do JDK
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Versões do JDK - Qual versão escolher?](#versões-do-jdk---qual-versão-escolher)
  - [OracleJDK vs OpenJDK](#oraclejdk-vs-openjdk)
  - [Instalação no Windows](#instalação-no-windows)
  - [Instalação no Linux](#instalação-no-linux)
  - [Instalação no macOS](#instalação-no-macos)

### Versões do JDK - Qual versão escolher?

- Versão mais popular atualmente: Java 11

- Versão LTS mais recente: Java 17

- Um lançamento Java LTS (que significa long-rerm support, ou suporte de longo prazo) é uma versão do Java que se manterá como um padrão na indústria por vários anos.

Para este curso, utilizaremos o Java 8 na maioria dos casos.

### OpenJDK vs OracleJDK

OpenJDK
- Completamente gratuito incluindo uso comercial.
- Desenvovido pela Oracle e a comunidade Java juntos.

OracleJDK
- Não é gratuito para uso comercial
- A JVM possui uma responsividade e performance muito maior.
- Desenvovido inteiramente pela Oracle.

Para este curso, utilizaremos o OpenJDK.

### Instalação no Windows

**Baixar o JDK**: Acesse o site oficial da Oracle ou da OpenJDK e faça o download da versão mais recente do JDK.
- Oracle JDK: https://www.oracle.com/java/technologies/javase-jdk16-downloads.html
- OpenJDK: https://openjdk.java.net/
- Escolha a versão adequada para o seu sistema operacional (Windows) e a arquitetura (x86 ou x64).

**Executar o Instalador**: Após o download, execute o instalador que você baixou.

**Configuração**: Siga as instruções do instalador para configurar o JDK. Você provavelmente precisará concordar com os termos de licença e escolher a localização de instalação. Geralmente, o diretório padrão é o mais recomendado.

**Configurar Variáveis de Ambiente**: Para que o JDK funcione corretamente, você precisará configurar algumas variáveis de ambiente.
- *JAVA_HOME*: Essa variável deve apontar para o diretório de instalação do JDK. Por exemplo, C:\Program Files\Java\jdk-16.
- *PATH*: Adicione o caminho para o diretório bin do JDK ao seu PATH. Isso permite que você execute comandos Java de qualquer lugar no prompt de comando.

**Para configurar essas variáveis**
- Clique com o botão direito em *Este Computador* ou *Meu Computador* e selecione *Propriedades*.
- No painel esquerdo, clique em *Configurações avançadas do sistema*.
- Na guia *Avançado*, clique no botão *Variáveis de Ambiente*.
- Na seção *Variáveis do Sistema*, clique em *Novo* e defina *JAVA_HOME* com o caminho para a pasta do JDK.
- Na variável *Path*, adicione *%JAVA_HOME%\bin* ao final da lista de valores.

**Verificar a Instalação**: Abra um novo prompt de comando e digite `java -version`. Deverá exibir a versão do JDK que você instalou.

Parabéns! Agora você tem o JDK instalado no seu sistema Windows e está pronto para desenvolver aplicativos Java. Lembre-se de que as instruções podem variar ligeiramente com base na versão específica do JDK que você baixou e no sistema operacional Windows que você está usando.

### Instalação no Linux

Para instalar o Java Development Kit (JDK) em uma distribuição Linux, você pode seguir estas etapas gerais. Note que os comandos específicos podem variar com base na distribuição que você está utilizando. Aqui, vou usar exemplos que se aplicam a distribuições baseadas em Debian, como o Ubuntu.

**Atualizar o Sistema**: Antes de instalar qualquer pacote, é uma boa prática atualizar os repositórios e pacotes existentes no seu sistema. Use os seguintes comandos:
```bash
sudo apt update
sudo apt upgrade
```

**Instalar o JDK**: Use o comando apt (ou o gerenciador de pacotes da sua distribuição) para instalar o JDK. Você pode instalar o OpenJDK, que é uma implementação de código aberto do Java.
```bash
# Java 8
sudo apt install openjdk-8-jdk

# Java 11
sudo apt install openjdk-11-jdk

# Java 17
sudo apt install openjdk-17-jdk
```

**Verificar a Instalação**: Após a instalação, você pode verificar se o JDK foi instalado corretamente usando o comando: `java -version`. Isso deve exibir a versão do JDK que você instalou.

**Configurar versão da JDK**: Ao instalar uma versão, normalmente o Linux adota a versão mais atual instalada como a versão atual. Mas é possível alterar a versão atual manualmente. Para isso, podemos usar o *update-alternatives* ou a *configuração de variável de ambiente*:

**Mudar versão do Java com o update-alternatives**: Para abrir o prompt de configuração, execute o seguinte comando no terminal:
```bash
sudo update-alternatives --config java
```

A partir daí é bem autoexplicativo, basta selecionar uma opção e salvar.

Em alguns casos, é necessário utilizar esse comando também sem *sudo*, pois ele altera apenas o usuário normal.

Para verificar as diferentes instâncias de versões, utilize `java -version` e `sudo java -version`.

**Mudar versão do Java configurando variáveis de ambiente**: Geralmente, no Linux, as variáveis de ambiente não precisam ser configuradas manualmente, pois o gerenciador de pacotes faz isso automaticamente. No entanto, você pode querer configurar manualmente as variáveis de ambiente *JAVA_HOME* e *PATH* para facilitar o uso do JDK.

Adicione as seguintes linhas ao final do arquivo *~/.bashrc* ou *~/.zshrc* (dependendo do shell que você está usando):

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64   # Verifique o caminho correto
export PATH=$PATH:$JAVA_HOME/bin
```

Lembre-se de substituir o caminho do *JAVA_HOME* pelo diretório de instalação correto.

**Recarregar o Shell**: Para que as alterações nas variáveis de ambiente tenham efeito, recarregue o shell atual ou abra um novo terminal.
```bash
source ~/.bashrc   # Ou source ~/.zshrc, se estiver usando o Zsh
```

Agora você deve ter o JDK instalado e configurado no seu sistema Linux. Lembre-se de que as instruções podem variar um pouco com base na distribuição específica que você está usando, mas esses passos fornecem uma base sólida para a instalação do JDK em muitas distribuições Linux.

### Instalação no macOS

Para instalar o Java Development Kit (JDK) no macOS, você pode seguir estas etapas:

**Baixar o JDK**: Acesse o site oficial da Oracle ou da OpenJDK e faça o download da versão mais recente do JDK para macOS.
- Oracle JDK: https://www.oracle.com/java/technologies/javase-jdk16-downloads.html
- OpenJDK: https://openjdk.java.net/
- Escolha a versão adequada para o macOS.

**Executar o Instalador**: Após o download, execute o instalador que você baixou. Isso normalmente envolve um pacote DMG.

**Instalar o JDK**: Arraste o ícone do JDK para a pasta *Applications* para instalá-lo.

**Configurar variáveis de ambiente (opcional)**: No macOS, as variáveis de ambiente não precisam ser configuradas manualmente para que o JDK funcione corretamente. No entanto, se você desejar, pode configurar manualmente as variáveis de ambiente *JAVA_HOME* e *PATH*.

Abra o Terminal e execute os seguintes comandos:

```bash
echo 'export JAVA_HOME=$(/usr/libexec/java_home)' >> ~/.bash_profile
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bash_profile
source ~/.bash_profile
```

Esses comandos configurarão automaticamente as variáveis de ambiente e as carregarão sempre que você iniciar um novo terminal.

**Verificar a Instalação**: Após a instalação, você pode verificar se o JDK foi instalado corretamente usando o comando: `java -version`.

Isso deve exibir a versão do JDK que você instalou.

Agora você deve ter o JDK instalado no seu sistema macOS e está pronto para desenvolver aplicativos Java. Lembre-se de que as instruções podem variar um pouco dependendo da versão do macOS, mas esses passos fornecem uma base sólida para a instalação do JDK em muitas versões do sistema operacional.
