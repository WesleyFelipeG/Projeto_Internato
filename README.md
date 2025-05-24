# Projeto_Internato P4 2025.1

Grupo
- Wesley Felipe
- Pedro Marra
- Hilton Luan

---

## Funcionalidades Principais

- Cadastro e configuração do semestre letivo
- Cadastro de hospitais, clínicas e especialidades
- Escalonamento automático de alunos em plantões (rodízios)
- Registro de check-in e check-out com validação de localização
- Controle de faltas, reposições e advertências
- Geração de relatórios de carga horária por aluno e especialidade

---

## Padrão de Arquitetura Utilizado: **Camadas (Layered Architecture)**

### Camadas definidas no projeto:

1. **Controller (Apresentação)**  
   Expõe os endpoints da API REST para os diferentes tipos de usuários (coordenador, aluno, preceptor). Recebe requisições, trata dados de entrada e delega para os serviços.


2. **Service (Regras de Negócio)**  
   Contém a lógica da aplicação: verificação de presença, escalonamento de plantões, controle de carga horária e regras como atrasos, faltas e validações de check-in.


3. **Repository (Acesso a Dados)**  
   Camada responsável por acessar e manipular os dados no banco usando `Spring Data JPA`.


4. **Model (Entidades)**  
   Representa as tabelas do banco de dados com anotações JPA (`@Entity`, `@Id`, etc.).


5. **DTO (Data Transfer Objects)**  
   Estruturas usadas para enviar e receber dados da API de forma segura, sem expor diretamente as entidades.


## Por que escolhemos esse padrão?

- **Separação de responsabilidades (SoC)**: facilita a divisão de trabalho, manutenção, testes e leitura do código.
- **Escalabilidade**: permite adicionar funcionalidades e integrações (ex.: autenticação, módulos mobile) sem bagunçar o núcleo do sistema.
- **Compatibilidade com Spring Boot**: a arquitetura em camadas segue o que o Spring já propõe como padrão de mercado.
- **Testabilidade**: cada camada pode ser testada isoladamente (services com mocks de repository, controllers com testes de integração, etc.)

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- PostgreSQL
- pgModeler (modelagem do banco)
