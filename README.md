# Sistema de Gerenciamento de Cursos e Professores

Este projeto é um sistema simples em Java para gerenciar cursos e professores. Ele permite adicionar, listar, remover e marcar cursos como concluídos, além de adicionar e listar professores.

## Funcionalidades

- **Adicionar Curso**: Adicione cursos com nome e descrição.
- **Adicionar Professor**: Adicione professores com nome e disciplina.
- **Listar Cursos**: Exiba todos os cursos disponíveis e concluídos.
- **Listar Professores**: Exiba todos os professores cadastrados.
- **Remover Curso**: Remova cursos da lista de disponíveis.
- **Remover Professor**: Remova professores cadastrados.
- **Marcar Curso como Concluído**: Transfira um curso da lista de disponíveis para a lista de concluídos.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de arquivos:

```
src/
├── Main.java            # Arquivo principal do programa
├── modules/
│   ├── Curso.java       # Classe representando um curso
│   └── Professor.java   # Classe representando um professor
```

### Classes

- **Curso**
  - Atributos:
    - `nome`: Nome do curso.
    - `descricao`: Descrição do curso.
  - Métodos:
    - `toString()`: Retorna uma representação textual do curso.

- **Professor**
  - Atributos:
    - `nome`: Nome do professor.
    - `disciplina`: Disciplina que o professor leciona.
  - Métodos:
    - `toString()`: Retorna uma representação textual do professor.

### Fluxo do Programa

1. O programa exibe um menu com as opções disponíveis.
2. O usuário interage digitando números correspondentes às operações desejadas.
3. O programa processa a entrada do usuário, executa as ações solicitadas e exibe os resultados.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```

2. Compile o código:
   ```bash
   javac src/**/*.java
   ```

3. Execute o programa:
   ```bash
   java src/Main
   ```

## Requisitos

- Java 8 ou superior.

## Exemplos de Uso

### Adicionar Curso
- Entrada:
  ```
  1
  Nome do curso: Java Básico
  Descrição: Introdução à programação em Java
  ```
- Saída:
  ```
  Curso adicionado com sucesso!
  ```

### Listar Professores
- Entrada:
  ```
  6
  ```
- Saída:
  ```
  Lista de Professores:
  Professor: João Silva, Disciplina: Matemática
  ```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo `LICENSE` para mais informações.

