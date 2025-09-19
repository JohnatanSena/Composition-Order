# Sistema de Pedidos em Java

Sistema de gerenciamento de pedidos implementado em Java puro, sem frameworks ou banco de dados, focado em conceitos fundamentais de POO.

## 🏛️ Estrutura Principal

**Order**: Gerencia pedidos com data e status  
**OrderItem**: Itens dos pedidos  
**Product**: Produtos com nome e preço  
**Client**: Clientes com dados pessoais  
**OrderStatus**: Enum com estados do pedido (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)

## 💡 Conceitos Implementados

### Enumeração
OrderStatus garante type safety para os estados dos pedidos:

```java
order.setStatus(OrderStatus.PROCESSING);
```

### Composição
Relações todo-parte entre classes:  
Order → OrderItem → Product  
Order → Client

### Matrizes/Coleções
Uso de Listas para armazenar itens e gerenciar pedidos.

### Datas em Java
Manipulação de datas com classe Date:

```java
Date orderDate = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
```

## 🚀 Execução

```bash
javac *.java
java Main
```

## 📋 Funcionalidades

- Criação de pedidos com múltiplos itens
- Cálculo automático de totais
- Controle de status dos pedidos
- Gestão de clientes e produtos

Desenvolvido para fins educacionais, focando em conceitos fundamentais de Java e POO.