CREATE DATABASE IF NOT EXISTS testebancodados;
USER testebancodados;
CREATE TABLE IF NOT EXISTS user( id INT(11) AUTO_INCREMENT, full_name VARCHAR(100), email VARCHAR(100), nickname VARCHAR(50), password VARCHAR(255), created_at TIMESTAMP, PRIMARY KEY(id));
INSERT INTO user VALUE(0, 'ANDRE PEREIRA', 'andre@pareira.com', 'andre', '123', NOW());
INSERT INTO user VALUE(0, 'MARCOS CINTRA', 'marcos@cintra.com', 'marcos', '456', NOW());
