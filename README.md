# Projeto: Operações com Conjuntos em Java

Este projeto é uma aplicação em Java que permite realizar operações entre conjuntos numéricos, como **união** e **interseção**.

O programa possui uma interface gráfica feita com **Java Swing**, onde o usuário pode digitar os elementos de dois conjuntos e clicar nos botões disponíveis para visualizar o resultado.

## Funcionalidades

* Inserir elementos para o conjunto LA.
* Inserir elementos para o conjunto LB.
* Calcular a união entre os conjuntos.
* Calcular a interseção entre os conjuntos.
* Exibir o resultado diretamente na interface gráfica.
* Impedir elementos repetidos dentro de um conjunto.
* Organizar os elementos usando uma lista duplamente ligada circular.

## Tecnologias usadas

* Java
* Java Swing
* Programação Orientada a Objetos
* Lista Duplamente Ligada
* Interfaces em Java

## Estrutura do projeto

O projeto é dividido em algumas classes principais:

### `InterfaceGrafica`

Classe responsável pela interface visual do programa.

Ela cria a janela, os campos de texto, os botões e a área onde o resultado aparece.

Também é nela que o texto digitado pelo usuário é transformado em objetos do tipo `Conjunto`.

### `Conjunto`

Classe responsável por representar um conjunto.

Ela permite:

* adicionar elementos;
* verificar se um elemento já existe;
* calcular a união entre dois conjuntos;
* calcular a interseção entre dois conjuntos;
* mostrar os elementos armazenados.

### `ListaDuplamenteLigada`

Classe usada como estrutura interna para armazenar os elementos do conjunto.

Ela trabalha com nós ligados entre si, permitindo percorrer os elementos adicionados.

### `No`

Classe que representa cada elemento da lista.

Cada nó guarda:

* um valor inteiro;
* uma referência para o próximo nó;
* uma referência para o nó anterior.

### `IConjunto`

Interface que define os métodos principais que a classe `Conjunto` deve implementar.

### `IListaLigada`

Interface que define métodos básicos esperados para uma lista ligada.

## Como usar

Ao abrir o programa, a interface exibe dois campos:

* `Conjunto LA`
* `Conjunto LB`

O usuário deve digitar os valores separados por vírgula.

Exemplo:

```text
1, 2, 3, 4
```

Depois disso, é possível clicar em:

* **União**: para juntar os elementos dos dois conjuntos.
* **Interseção**: para mostrar apenas os elementos que aparecem nos dois conjuntos.

## Exemplo de entrada

```text
Conjunto LA: 1, 2, 3
Conjunto LB: 2, 3, 4
```

## Exemplo de resultado da união

```text
{1, 2, 3, 4}
```

## Exemplo de resultado da interseção

```text
{2, 3}
```

## Como executar

Compile os arquivos Java:

```bash
javac *.java
```

Depois execute a classe da interface gráfica:

```bash
java InterfaceGrafica
```

## Observações

O programa usa uma estrutura própria de conjunto, em vez de utilizar diretamente estruturas prontas do Java, como `HashSet`.

Isso foi feito com objetivo de praticar:

* criação de classes;
* uso de interfaces;
* manipulação de nós;
* listas ligadas;
* lógica de conjuntos;
* integração entre lógica e interface gráfica.

## Possíveis melhorias futuras

* Validar melhor a entrada do usuário.
* Impedir letras ou símbolos inválidos nos campos.
* Mostrar mensagens de erro amigáveis.
* Adicionar botão para limpar os campos.
* Melhorar o visual da interface.
* Criar um método próprio para transformar o conjunto em texto.
* Adicionar outras operações, como diferença e complemento.
* Permitir salvar os resultados em arquivo.

## Autor

Projeto desenvolvido como prática de Java, estruturas de dados e interface gráfica com Swing.
