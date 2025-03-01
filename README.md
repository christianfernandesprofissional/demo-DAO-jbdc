# 🚀 Demonstração de Acesso a Dados utilizando JDBC

## 📌 Descrição
Este projeto implementa a biblioteca JDBC do Java para simular um acesso ao banco de dados MySQL, utilizando o padrão DAO (Data Access Object). O objetivo é demonstrar um CRUD completo (Create, Read, Update, Delete) para as entidades `Seller` e `Department`.

## 🛠 Tecnologias Utilizadas
- ☕ Java SE 21
- 🔌 JDBC (Java Database Connectivity)
- 🗄️ MySQL
- 🏗️ Padrão DAO (Data Access Object)

## 📂 Estrutura do Projeto
O projeto é organizado da seguinte forma:

```
/src
  /application
    Program.java
  /db
    DB.java
    DbException.java
    DbIntegrityException.java
  /model
    /dao
      SellerDAO.java
      DepartmentDAO.java
      DAOFactory.java
      /impl
          SellerDaoJDBC.java
          DepartmentDaoJDBC.java
    /entities
      Seller.java
      Department.java
```

### 📝 Descrição dos Componentes

- **🗃️ DB.java**: Classe responsável por gerenciar a conexão com o banco de dados MySQL.
- **🏭 DAOFactory.java**: Fábrica para criar instâncias das implementações DAO.
- **📄 SellerDAO.java** e **DepartmentDAO.java**: Interfaces que definem os métodos CRUD.
- **⚙️ SellerDaoJDBC.java** e **DepartmentDaoJDBC.java**: Implementações concretas das interfaces DAO, utilizando JDBC.
- **👤 Seller.java** e **🏢 Department.java**: Classes de entidades que representam os dados no banco.
- **🚀 Program.java**: Classe principal que demonstra o uso do DAO para realizar operações no banco de dados.

## 🔄 Funcionalidades CRUD
O projeto permite realizar as seguintes operações com as entidades:

### 👨‍💼 Seller (Vendedor)
- ➕ Criar um novo vendedor (`insert`)
- 🔍 Buscar vendedor por ID (`findById`)
- 📋 Buscar todos os vendedores (`findAll`)
- ✏️ Atualizar informações de um vendedor (`update`)
- ❌ Deletar um vendedor pelo ID (`deleteById`)
- 🏢 Encontrar os vendedores por um departamento (`findByDepartment`)

### 🏢 Department (Departamento)
- ➕ Criar um novo departamento (`insert`)
- 🔍 Buscar departamento por ID (`findById`)
- 📋 Buscar todos os departamentos (`findAll`)
- ✏️ Atualizar informações de um departamento (`update`)
- ❌ Deletar um departamento pelo ID (`deleteById`)

## 🏗️ Configuração do Banco de Dados

Para executar o projeto, é necessário configurar um banco de dados MySQL com a seguinte estrutura:

```sql
CREATE DATABASE jdbc_project;
USE jdbc_project;

CREATE TABLE department (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(50) NOT NULL
);

CREATE TABLE seller (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    BirthDate DATE NOT NULL,
    BaseSalary DOUBLE NOT NULL,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```

No arquivo `db.properties`, configure sua conexão com o banco de dados:

```java
user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/jdbc_project
useSSL=false
```

## ▶️ Como Executar o Projeto
1. 📥 Clone este repositório
   ```sh
   git clone https://github.com/seu_usuario/jdbc-dao-project.git
   ```
2. ⚙️ Configure seu banco de dados conforme a seção acima
3. ▶️ Compile e execute o programa
   ```sh
   javac application/Program.java
   java application.Program
   ```

## 🤝 Contribuição
Sinta-se à vontade para contribuir com melhorias no projeto. Para isso:
1. 🍴 Faça um fork do repositório
2. 🌿 Crie uma branch para suas mudanças (`git checkout -b minha-feature`)
3. 💾 Commit suas alterações (`git commit -m 'Minha nova feature'`)
4. 🚀 Envie para o repositório (`git push origin minha-feature`)
5. 📩 Abra um Pull Request

## 📜 Licença
Este projeto é de código aberto e está licenciado sob a [MIT License](LICENSE).

