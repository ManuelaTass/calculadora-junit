# Projeto Calculadora em Java com JUnit 5

Este projeto consiste em uma calculadora simples desenvolvida em Java, com operações matemáticas básicas (soma, subtração, multiplicação e divisão), acompanhada de testes automatizados utilizando o framework **JUnit 5**.

## Funcionalidades

A classe `Calculadora` implementa os seguintes métodos:

- `somar(int a, int b)`  
- `subtrair(int a, int b)`  
- `multiplicar(int a, int b)`  
- `dividir(int a, int b)` *(com tratamento para divisão por zero)*

## Testes Unitários

Os testes foram desenvolvidos com **JUnit 5** e cobrem todos os métodos da classe `Calculadora`. Incluem também testes de exceção para divisão por zero.

## Estrutura do Projeto

```
calculadora-junit/
├── src/
│   ├── Calculadora.java
│   └── CalculadoraTest.java
├── .gitignore
├── README.md
└── ...
```

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ManuelaTass/calculadora-junit.git
   ```

2. Abra o projeto em uma IDE como **IntelliJ IDEA** ou **Eclipse**.

3. Execute os testes unitários da classe `CalculadoraTest`.

> Certifique-se de que a biblioteca **JUnit 5** esteja corretamente configurada no projeto.

## GitHub e Controle de Versão

Este projeto foi hospedado no GitHub com os seguintes recursos utilizados:

- Criação de branches
- Commits com controle de versão
- Merge de branches
- Clone de repositórios
- Upload do código-fonte

##  Desenvolvido por

**Manuela Tassara**  
[github.com/ManuelaTass](https://github.com/ManuelaTass)
