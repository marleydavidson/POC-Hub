-- Mensagem de início do script
SELECT 'Executando script init.sql...' AS 'Mensagem';

-- Criação da tabela RULE_SET
CREATE TABLE RULE_SET (
  id INT PRIMARY KEY AUTO_INCREMENT,
  rule_name VARCHAR(255),
  client_id INT,
  json_data JSON
);

-- Mensagem de conclusão do script
SELECT 'Script init.sql executado com sucesso!' AS 'Mensagem';