# 🌱 Spring Boot para Iniciantes

Este repositório foi criado como parte dos estudos iniciais sobre Spring Boot. Aqui você encontrará exemplos práticos e explicações sobre conceitos fundamentais para começar a desenvolver aplicações com essa poderosa ferramenta.

## 🚀 Objetivo

O objetivo deste repositório é fornecer uma base sólida para quem está começando com Spring Boot, abordando tópicos como:

- Inicialização de um projeto Spring Boot
- Anotações de endpoints em controllers
- Estrutura de pastas em um projeto Spring Boot
- Principais anotações em projetos REST
- Mapeamento de classes externas no Spring
- Utilização do springdoc.org para documentação de APIs
- Configuração e uso de variáveis de ambiente

## Conteúdo
- Exemplos de código comentados
- Explicações sobre anotações comuns
- Configurações básicas para projetos REST
- Integração com ferramentas como Springdoc OpenAPI

### 📂 Exemplo de Estrutura de Pastas no projeto Java com Spring
```
src ├── main │
      ├── java │
      │ └── com.example.springproject │
        │ ├── controller # Controladores REST (Camada de API) │
        │ ├── service # Regras de Negócio │
        │ ├── repository # Acesso ao Banco de Dados │
        │ ├── model # Entidades e modelos de dados │
        │ └── SpringProjectApplication.java # Classe principal 
      │ ├── resources 
        │ ├── application.properties # Configuração padrão 
        │ ├── application-dev.properties # Configuração para ambiente de DEV 
        │ └── application-prod.properties # Configuração para ambiente de PRODUÇÃO
    └── test └── java # Testes automatizados

```
