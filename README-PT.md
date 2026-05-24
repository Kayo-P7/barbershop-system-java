# Sistema de Barbearia em Java

Projeto simples desenvolvido em Java para treinar:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Classes e Objetos
- Regex (Expressões Regulares)
- Datas com LocalDateTime
- Organização em pacotes

## Funcionalidades

- Cadastro de cliente
- Validação de número de telefone
- Registro da data e hora do atendimento
- Exibição das informações da barbearia

## Estrutura do Projeto

```text
src/
│
├── application/
│   └── Program.java
│
├── entities/
│   ├── Barbearia.java
│   └── Client.java
```

## Tecnologias Utilizadas

- Java
- LocalDateTime
- DateTimeFormatter
- Regex

## Como Funciona

O sistema:

1. Solicita um número de telefone
2. Cria um cliente
3. Registra o atendimento
4. Verifica se o número está válido

Formato aceito:

```text
91-986363455
```

Regex utilizada:

```java
91-9\\d{8}
```

## Exemplo de Saída

```text
BARBEARIA: DATE: 23/05/2026 21:30:15 CLIENT: NAME: Kayo Albuquerque NUMBER: 91-986363455

Número válido
```

## Conceitos Praticados

- Construtores
- Métodos
- ToString
- Encapsulamento
- Validação com Regex
- Manipulação de datas

## Autor

Kayo Albuquerque
