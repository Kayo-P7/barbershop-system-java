# Barber Shop System in Java

Simple Java project created to practice:

- Object-Oriented Programming (OOP)
- Encapsulation
- Classes and Objects
- Regex (Regular Expressions)
- Date handling with LocalDateTime
- Package organization

## Features

- Client registration
- Phone number validation
- Service date and time registration
- Barber shop information display

## Project Structure

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

## Technologies Used

- Java
- LocalDateTime
- DateTimeFormatter
- Regex

## How It Works

The system:

1. Requests a phone number
2. Creates a client
3. Registers the service
4. Validates the phone number

Accepted format:

```text
91-986363455
```

Regex used:

```java
91-9\\d{8}
```

## Output Example

```text
BARBER SHOP: DATE: 23/05/2026 21:30:15 CLIENT: NAME: Kayo Albuquerque NUMBER: 91-986363455

Valid number
```

## Practiced Concepts

- Constructors
- Methods
- ToString
- Encapsulation
- Regex validation
- Date manipulation

## Author

Kayo Albuquerque
