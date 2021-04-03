CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30),
	ativo BOOLEAN NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Thiago Calcagniti', 'Rua Madrid', '193', null, 'Vila Prudente', '03540-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Renan Calcagniti', 'Rua Artur Bernardes', '254', null, 'Vila Invernada', '03533-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Divanir Calcagniti', 'Rua Madrid', '193', null, 'Vila Prudente', '03540-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Vito Calcagniti', 'Rua Madrid', '193', null, 'Vila Prudente', '03540-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Maria Gomes', 'Rua Gal', '226', null, 'Vila Invernada', '07540-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Rebeca Calcagniti', 'Rua Artur Bernardes', '254', null, 'Vila Invernada', '03533-000', 'São Paulo', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Leandro Alves', 'Rua Santo André', '335', null, 'Vila dos Pássaros', '03222-010', 'Santo André', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Felipe Fanti', 'Rua Mauá', '223', 'apartamento', 'Vila Assunção', '03452-010', 'Santo André', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Thamires Conceição', 'Rua dos Moradores', '22', 'casa', 'Vila Planejada 2', '05452-010', 'Bragança Paulista', 'Santo André', true);