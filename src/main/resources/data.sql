/*
INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);
*/

INSERT INTO ALUNO (cpf, nome, email, fone, DATA_NASC, tipo) VALUES  
('11111111111', 'Huguinho', 'aluno111@escola.com', '81 1234-5555', '2000-05-10','CONVENCIONAL');

INSERT INTO ALUNO (cpf, nome, email, fone, DATA_NASC, tipo) VALUES  
('22222222222', 'Zezinho', 'aluno222@escola.com', '81 1234-5555', '1999-03-23','CONVENCIONAL');

INSERT INTO ALUNO (cpf, nome, email, fone, DATA_NASC, tipo) VALUES  
('33333333333', 'Luizinho', 'aluno333@escola.com', '81 1234-5555', '1995-11-15','MONITOR');
