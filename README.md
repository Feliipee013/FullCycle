# Prime Shoes API

## 🏗️ Arquitetura do Projeto

Este projeto segue uma arquitetura modular e limpa, organizada por domínios de negócio.

### Estrutura de Diretórios

```
src/main/java/br/com/primeshoes/api/
├── ApiApplication.java        # Ponto de entrada da aplicação
├── common/                   # Componentes compartilhados
│   ├── config/              # Configurações globais
│   ├── exceptions/          # Tratamento de exceções
│   ├── middleware/          # Middlewares da aplicação
│   ├── services/            # Serviços compartilhados
│   └── utils/               # Utilitários comuns
└── modules/                 # Módulos do domínio
    ├── address/             # Gestão de endereços
    ├── auth/                # Autenticação e autorização
    ├── cart/                # Carrinho de compras
    ├── order/               # Gestão de pedidos
    ├── payment/             # Processamento de pagamentos
    ├── product/             # Catálogo de produtos
    ├── promotion/           # Sistema de promoções
    ├── review/              # Avaliações de produtos
    ├── role/                # Gestão de papéis/permissões
    └── user/                # Gestão de usuários
```

## 📐 Padrões Arquiteturais

### Arquitetura Modular
O projeto é organizado em módulos independentes, cada um representando um domínio específico do negócio. Esta abordagem permite:

- **Baixo Acoplamento**: Módulos são independentes e podem ser modificados sem afetar outros
- **Alta Coesão**: Funcionalidades relacionadas são mantidas juntas
- **Manutenibilidade**: Facilita a manutenção e evolução do código

### Estrutura dos Módulos
Cada módulo segue uma estrutura consistente:

```
módulo/
├── controller/     # Endpoints da API
├── service/        # Lógica de negócio
├── repository/     # Acesso a dados
├── dto/            # Objetos de transferência de dados
└── model/          # Entidades do domínio
```

### Camada Common
A pasta `common` contém componentes reutilizáveis:

- **config/**: Configurações globais
- **exceptions/**: Tratamento centralizado de exceções
- **middleware/**: Interceptadores e filtros
- **services/**: Serviços compartilhados
- **utils/**: Funções utilitárias

## 📊 Diagrama da Arquitetura

### Diagrama de Classes UML
![Diagrama de Classes](docs/images/class-diagram.png)

O diagrama acima representa a estrutura completa do sistema, mostrando:
- Entidades principais e seus atributos
- Relacionamentos entre as entidades
- Métodos principais de cada classe
- Cardinalidade das relações

O código fonte do diagrama em formato PlantUML pode ser encontrado em [docs/diagrams/architecture.puml](docs/diagrams/architecture.puml).

## 🔍 Módulos do Sistema

### 1. Auth e Role
- Autenticação e autorização de usuários
- Controle de acesso baseado em papéis

### 2. User e Address
- Gestão de usuários
- Gerenciamento de endereços

### 3. Product e Review
- Catálogo de produtos
- Sistema de avaliações

### 4. Cart e Order
- Carrinho de compras
- Gestão de pedidos

### 5. Payment
- Processamento de pagamentos

### 6. Promotion
- Sistema de promoções e descontos

## 🚀 Começando

### Requisitos
- Java 17+
- Maven 3.8+
- PostgreSQL

### Instalação
1. Clone o repositório
2. Configure as variáveis de ambiente necessárias
3. Execute:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

### Documentação da API
Swagger UI disponível em:
```
http://localhost:8080/swagger-ui.html
```

## 🤝 Contribuindo

1. Fork o projeto
2. Crie uma branch (`git checkout -b feature/NovaMelhoria`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova melhoria'`)
4. Push para a branch (`git push origin feature/NovaMelhoria`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença [MIT](LICENSE). 