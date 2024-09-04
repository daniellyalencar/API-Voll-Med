# API-Voll-Med
API Rest para Consultório Voll_Med

Desenvolvimento de uma API Rest
CRUD (Creat, Read, Update e Delete) Médico, Paciente
- Classes controller
- Classes domain
- Classes service
- Classes repository
- Classes de entidade JPA
- Classes DTOs
- Classes infraestrutura
Migration

Métodos utilizando HTTP

Validações e Tratamento de erros

Paginação e Ordenação

Autorização e autenticação

Controle de acessos com JWT

Biblioteca SpringDoc para geração automatizada da documentação da API

Swagger UI para visualizar e testar a API Rest

Testes automatizados com JUnit e Mock para simular BD

Funcionalidades:
Agendamento/cancelamento de consultas
Documentação da API
Testes automatizados
Build do projeto

Ferramentas utilizadas no projeto:
- IntelliJ IDEA
- Insomnia

Princípios SOLID utilizados no projeto:
- S: Single Responsibility Principle (Princípio da responsabilidade única): porque cada classe de validação tem apenas uma responsabilidade.
- O: Open-Closed Principle (Princípio aberto-fechado): na classe service, AgendadeConsultas, porque ela está fechada para modificação, não precisamos mexer nela. Mas ela está aberta para extensão, conseguimos adicionar novos validadores apenas criando as classes implementando a interface.
- D: Dependency Inversion Principle (Princípio da inversão de dependência): porque nossa classe service depende de uma abstração, que é a interface, não depende dos validadores, das implementações especificamente. O módulo de alto nível, a service, não depende dos módulos de baixo nível, que são os validadores.
