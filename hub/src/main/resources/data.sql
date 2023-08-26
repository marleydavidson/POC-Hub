-- Inserindo dados na tabela Vendedor
INSERT INTO Vendedor (id, nome, salario) VALUES
(1, 'João', 2000.00),
(2, 'Maria', 2500.00);

-- Inserindo dados na tabela Produto
INSERT INTO Produto (id, nome, preco) VALUES
(1, 'Camiseta', 29.90),
(2, 'Calça', 79.90);

-- Inserindo dados na tabela Cliente
INSERT INTO Cliente (id, nome, endereco) VALUES
(1, 'Pedro', 'Rua A, 123'),
(2, 'Ana', 'Avenida B, 456');

-- Inserindo dados na tabela Carrinho
INSERT INTO Carrinho (id, cliente_id, produto_id, quantidade) VALUES
(1, 1, 1, 3),
(2, 2, 2, 2);