CREATE TABLE Vendedor (
  id INT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  salario DECIMAL(10,2) NOT NULL
);

CREATE TABLE Produto (
  id INT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE Cliente (
  id INT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  endereco VARCHAR(100) NOT NULL
);

CREATE TABLE Carrinho (
  id INT PRIMARY KEY,
  cliente_id INT,
  produto_id INT,
  quantidade INT,
  FOREIGN KEY (cliente_id) REFERENCES Cliente(id),
  FOREIGN KEY (produto_id) REFERENCES Produto(id)
);