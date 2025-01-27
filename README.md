# 🌱 Spring Boot para Iniciantes

Este repositório foi criado como parte do aprendizado de Spring Boot, com base em um vídeo introdutório no YouTube. O projeto demonstra os conceitos básicos, como a estrutura de pastas, principais anotações, estados (stateless e stateful), mapeamento de endpoints, configuração de perfis e variáveis de ambiente.

## 🚀 Funcionalidades
- Estrutura de pastas organizada
- Principais anotações do Spring
- Diferenças entre Stateless e Stateful
- Criação e mapeamento de endpoints REST
- Configuração de perfis (`application.properties` / `application.yml`)
- Uso de variáveis de ambiente

---

## 📂 Estrutura de Pastas
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

## 🔖 Principais Anotações

### 🌐 **Controladores**
- `@RestController`: Define a classe como um controlador REST.
- `@RequestMapping`: Configura o endpoint de base ou os métodos HTTP.

### 📦 **Camada de Serviço**
- `@Service`: Marca uma classe como pertencente à camada de serviço.

---

## 🌍 Tipos de Estado

### 🟢 **Stateless**
- Nenhum dado é armazenado entre as requisições.
- Exemplo: APIs RESTful tradicionais.

### 🔵 **Stateful**
- Armazena dados entre requisições.
- Exemplo: Sessões de usuário.

---

## 🔀 Mapeamento de Endpoints

```java
@RestController
@RequestMapping("/api/v1")
public class ExampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, Spring!";
    }

    @PostMapping("/data")
    public String processData(@RequestBody String data) {
        return "Dados recebidos: " + data;
    }
}
```

## ⚙️ Configuração de Perfis e Variáveis de Ambiente

### Configuração de Perfis

No arquivo application.properties:
```
spring.profiles.active=dev
```

No application-dev.properties:
```
server.port=8081
spring.datasource.url=jdbc:h2:mem:devdb
```

No application-prod.properties:
```
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/proddb
```

## Variáveis de Ambiente

No arquivo application.properties:
```
app.name=${APP_NAME:MeuAplicativo}
```

