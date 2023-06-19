create database DBPEDACINHODOCEU;

use DBPEDACINHODOCEU;

CREATE TABLE if not exists users (
    id SERIAL PRIMARY KEY,
    username  VARCHAR(1000),
    password  VARCHAR(1000)
);

CREATE TABLE TBPRODUTOS (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    categoria VARCHAR(30),
    quantidade INTEGER,
    custo NUMERIC(8,2),
    valor NUMERIC(8,2),
    descricao VARCHAR(1000)
);

CREATE TABLE TBCLIENTES (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    cpf VARCHAR(20),
    sexo VARCHAR(10),
    estadoCivil VARCHAR(20),
    dataNascimento VARCHAR(20),
    estado VARCHAR(20),
    cidade VARCHAR(20),
    bairro VARCHAR(50),
    logradouro VARCHAR(50),
    numero VARCHAR(10),
    email VARCHAR(50),
    telefoneCelular VARCHAR(20),
    telefoneOutros VARCHAR(20),
    observacoes VARCHAR(500)
);

CREATE TABLE TBVENDAS (
    id SERIAL PRIMARY KEY,
    data TIMESTAMP,
    qtdItens INTEGER,
    subtotal NUMERIC(8,2),
    pagamentoDinheiro NUMERIC(8,2),
    pagamentoCartao NUMERIC(8,2),
    nomeCliente VARCHAR(50),
    cpfCliente VARCHAR(15)
);

CREATE TABLE TBITEMVENDA (
    idVenda INTEGER,
    idItem INTEGER,
    nomeProduto VARCHAR(50),
    idProduto INTEGER,
    qtdItens INTEGER,
    valorTotal NUMERIC(8,2),
    valor NUMERIC(8,2)
);

INSERT INTO users (id, username, password) values (1, 'user', 'user');

select * from users;