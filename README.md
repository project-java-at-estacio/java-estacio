<!-- Elemento com ID "topo" -->
<div id="topo"></div>

  <!-- ![Java logo](https://www.oracle.com/a/ocom/img/cb71-java-logo.png) -->

<p align="center">
  <img alt="Java logo" src="https://www.oracle.com/a/ocom/img/cb71-java-logo.png">
</p>

**⚠️ Este repositório contém uma biblioteca de código aberto escrita em Java. É mantido pela comunidade e suporta várias funcionalidades para facilitar a criação de aplicativos Java.[Visit stable repository →](https://github.com/estevam5s/estacio-project)**

|           | Status                                                                                                                                                        |
| --------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Build     |
| Community | [![Contributors](https://img.shields.io/github/contributors/estevam5s/estacio-project.svg)](https://github.com/estevam5s/estacio-project/graphs/contributors) |

<br>

# Sistema de Gerenciamento de Biblioteca

<!-- Adicionando ícones de linguagem de programação -->

[![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java&logoColor=white)](https://www.java.com/pt-BR/)
[![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/-Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Git](https://img.shields.io/badge/-Git-F05032?style=flat-square&logo=git&logoColor=white)](https://git-scm.com/)
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github)](https://github.com/)

## Índice

- [📱 Descrição](#descrição)
- [🎉 Instalação do Java no Windows, MacOS e Linux](#instalação-do-java-no-windows-macos-e-linux)
  - [Windows](#windows)
  - [Linux](#linux)
  - [MacOS](#macos)
- [⚙️ Tecnologias utilizadas no Projeto Biblioteca](#tecnologias-utilizadas-no-projeto-biblioteca)
  - [Backend](#backend)
  - [Deploy](#deploy)
  - [Testes](#testes)
  - [Ferramentas](#ferramentas)
  - [Outras tecnologias](#outras-tecnologias)
- [🔮 TODO](#todo)
- [🗝 Requisitos Funcionais](#requisitos-funcionais)
- [🏪 Requisitos Não Funcionais](#requisitos-não-funcionais)
- [🧠 Instruções de Instalação e Configuração](#instruções-de-instalação-e-configuração)
  - [Pré-requisitos](#pré-requisitos)
  - [Rodando o projeto](#rodando-o-projeto)
    - [1. Requisitos](#requisitos)
    - [2. Clonando o projeto](#clonando-o-projeto)
    - [3. Configurando o servidor](#configurando-o-servidor)
    - [4. Iniciando o servidor](#iniciando-o-servidor)
    - [5. Testando o projeto](#testando-o-projeto)
    - [6. Testando as rotas no Insomnia](#testando-as-rotas-no-insomnia)
    - [7. Encerrando o servidor](#encerrando-o-servidor)
- [📏 Utilizando Docker para executar o projeto](#utilizando-docker-para-executar-o-projeto)
  - [Etapa 1: Instalação do Docker](#instalação-do-docker)
  - [Etapa 2: Configuração do Dockerfile](#configuração-do-dockerfile)
  - [Etapa 3: Construção da imagem do Docker](#construção-da-imagem-do-docker)
  - [Etapa 4: Execução do container do Docker](#execução-do-container-do-docker)
  - [Etapa 5: Teste do ambiente Dockerizado](#teste-do-ambiente-dockerizado)
  - [Etapa 6: Distribuição do ambiente Dockerizado](#distribuição-do-ambiente-dockerizado)
- [📚 Variáveis de Ambiente](#variáveis-de-ambiente)
- [💖 Configuração do Banco de Dados](#configuração-do-banco-de-dados)
- [💬 Executando o Sistema](#executando-o-sistema)
- [💎 Árvore de Arquivos](#árvore-de-arquivos)
- [🔮 Adicionando a funcionalidade RESTful](#adicionando-a-funcionalidade-restful)
  - [1. Adicione a biblioteca Spring](#1.-adicione-a-biblioteca-spring)
  - [2. Implemente a camada de serviço](#2.-implemente-a-camada-de-serviço)
  - [3. Crie os endpoints RESTful](#3.-crie-os-endpoints-restful)
  - [4. Teste os endpoints](#4.-teste-os-endpoints)
- [🚀 Deploy da Biblioteca](#deploy-da-biblioteca)
  - [Introdução](#introdução)
  - [Nível Básico](#nível-básico)
  - [O que é Deploy?](#o-que-é-Deploy?)
  - [Considerações Importantes](#considerações-importantes)
  - [Provedores de nuvem](#provedores-de-nuvem)
  - [Configuração do ambiente](#configuração-do-ambiente)
- [👾 Implantação da aplicação na nuvem](#implantação-da-aplicação-na-nuvem)
  - [1. Crie uma conta no Heroku](#1.-crie-uma-conta-no-Heroku)
  - [2. Instale o Heroku CLI](#2.-instale-o-Heroku-CLI)
  - [3. Faça o login no Heroku](#3.-faça-o-login-no-Heroku)
  - [4. Crie um novo app](#4.-crie-um-novo-app)
  - [5. Faça o deploy do projeto](#5.-faça-o-deploy-do-projeto)
  - [6. Execute as migrações](#6.-execute-as-migrações)
  - [7. Acesse o app](#7.-acesse-o-app)
  - [Configuração do ambiente](#configuração-do-ambiente)
- [✨ Features](#features)
  - [Nível Básico](#nível-básico)
  - [Nível Intermediário](#nível-intermediário)
  - [Nível Avançado](#nível-avançado)
  - [Nível Especialista](#nível-especialista)
- [🤝 Contribuindo para o projeto](#contribuindo-para-o-projeto)
- [🔥 Contribuidores](#contribuidores)
- [📝 Licença](#licença)
- [🌃 Arquitetura da Aplicação](#arquitetura-da-aplicação)
- [🎆 Conclusão](#conclusão)

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Descrição

- Bem-vindo à documentação do projeto da biblioteca. Este projeto consiste em uma aplicação backend que gerencia os empréstimos e devoluções de livros em uma biblioteca.

- Este projeto tem como objetivo criar um sistema de gerenciamento de biblioteca que permita o cadastro e gerenciamento de livros, usuários e empréstimos. O sistema será desenvolvido em Java e usará uma interface gráfica para interação com o usuário.

- Este documento tem como objetivo fornecer informações detalhadas sobre o projeto, incluindo os objetivos, tecnologias utilizadas, arquitetura de software, além de instruções para a instalação e utilização da aplicação.

<img src="https://media2.giphy.com/media/YOvOkaS5ZKfimDIgwJ/giphy.gif?cid=ecf05e472ipczxdp8km6z40b4fb7q2vin64hh9xqswqyq0gb&rid=giphy.gif&ct=g" />

### Objetivos

> **Note**: O objetivo principal deste projeto é criar uma aplicação backend que possa gerenciar empréstimos e devoluções de livros em uma biblioteca. Dentre os objetivos específicos, destacam-se:

1. Permitir o cadastro de livros e usuários;
2. Permitir o empréstimo e devolução de livros;
3. Gerar relatórios com estatísticas de empréstimos e devoluções.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Ambiente de Configuração

Antes de executar o projeto, é necessário garantir que o ambiente esteja devidamente configurado.

### Configuração:

    1. Certifique-se de que o JDK esteja instalado e configurado corretamente em sua máquina.
    2. Certifique-se de que o Maven esteja instalado e configurado corretamente em sua máquina.
    3. Faça o download do código fonte do projeto a partir do repositório oficial.
    4. Descompacte o arquivo baixado em um diretório de sua preferência.
    5. Abra o terminal ou prompt de comando e navegue até o diretório onde o projeto foi descompactado.
    6. Execute o comando mvn package para compilar o projeto e gerar o arquivo JAR.
    7. Execute o comando java -jar target/biblioteca-1.0-SNAPSHOT.jar para iniciar a aplicação.

### Observação:

> **Note**: Certifique-se de que a porta 8080 esteja disponível em sua máquina para que a aplicação possa ser executada corretamente.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Instalação do Java no Windows, MacOS e Linux

### Windows

1. Acesse o site oficial da Oracle: https://www.oracle.com/br/java/technologies/javase-downloads.html
2. Clique no botão "Download gratuito do Java" na seção "Java SE"
3. Aceite os termos e condições e escolha a versão do Java que deseja baixar (recomendamos a versão mais recente)
4. Selecione o arquivo apropriado para o seu sistema operacional (32 ou 64 bits) e clique em "Download"

### MacOS

1. Acesse o site oficial da Oracle: https://www.oracle.com/br/java/technologies/javase-downloads.html
2. Clique no botão "Download gratuito do Java" na seção "Java SE"
3. Aceite os termos e condições e escolha a versão do Java que deseja baixar (recomendamos a versão mais recente)
4. Selecione o arquivo apropriado para o seu sistema operacional e clique em "Download"

### Linux

> Ubuntu e outras distribuições baseadas no Debian

1. Abra o terminal e execute o seguinte comando: `sudo apt update && sudo apt install default-jre`
2. Aguarde até que o processo de instalação seja concluído

> Fedora, CentOS e outras distribuições baseadas no Red Hat

1. Abra o terminal e execute o seguinte comando: `sudo dnf install java-latest-openjdk`
2. Aguarde até que o processo de instalação seja concluído

### Verificando a instalação

Para verificar se o Java foi instalado corretamente, abra o terminal e execute o seguinte comando:

```bash
  java -version

  # Saída esperada:
  # openjdk version "11.0.10" 2021-01-19
  # OpenJDK Runtime Environment (build 11.0.10+9-Ubuntu-0ubuntu1.20.04)
  # OpenJDK 64-Bit Server VM (build 11.0.10+9-Ubuntu-0ubuntu1.20.04, mixed mode, sharing)
```

> Se tudo estiver correto, o terminal exibirá a versão do Java instalada no seu sistema operacional.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Tecnologias utilizadas no Projeto Biblioteca

### Backend

- Java 11: linguagem de programação utilizada para o desenvolvimento do sistema backend.
- Spring Boot 2.4.4: framework utilizado para criar aplicativos Spring-powered, de maneira rápida e fácil.
- Maven: ferramenta de gerenciamento de dependências utilizada para a compilação e empacotamento do projeto.
- PostgreSQL 13: banco de dados relacional utilizado para armazenar os dados do sistema.

### Deploy

- Docker: tecnologia de contêiner utilizada para facilitar o deploy do sistema.
- Docker Compose: ferramenta utilizada para orquestrar a execução de vários contêineres Docker.
- Amazon EC2: serviço de computação em nuvem da Amazon utilizado para hospedar a aplicação.

### Testes

- JUnit 5: framework utilizado para realizar testes unitários na aplicação.
- Mockito: framework utilizado para criar objetos mock para testes.

### Ferramentas

- Eclipse: IDE utilizada para desenvolvimento do projeto.
- Postman: ferramenta utilizada para testar as APIs REST.
- Git: sistema de controle de versão utilizado para gerenciar o código fonte do projeto.
- GitHub: plataforma utilizada para hospedar o repositório Git do projeto.

### Outras tecnologias

- Lombok: biblioteca Java que ajuda a reduzir a quantidade de código escrito.
- Swagger: framework utilizado para criar a documentação da API REST.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## TODO

<details>

### Instalação

#### Windows

    - [ ] Instruções para a instalação do Docker no Windows.

#### Mac

    - [ ] Instruções para a instalação do Docker no Mac.

#### Linux

    - [ ] Instruções para a instalação do Docker no Linux.

### Utilização

#### Comandos básicos do Docker

    - [ ] Instruções para a execução do container da aplicação.
    - [ ] Instruções para a criação de uma imagem customizada do Docker.
    - [ ] Instruções para o uso do Docker Compose.

#### Integração com outras ferramentas

    - [ ] Instruções para a integração com o Jenkins para automação de builds e testes.
    - [ ] Instruções para a integração com o Kubernetes para orquestração de containers.

#### Troubleshooting

    - [ ] Instruções para a resolução de problemas comuns ao utilizar o Docker com o projeto da biblioteca.

### Melhorias futuras

- [ ] Adicionar testes automatizados com o uso do Docker Compose.
- [ ] Utilizar o Docker Swarm para orquestração de containers em ambientes de produção.
- [ ] Adicionar suporte para diferentes bancos de dados com o uso de containers.
- [ ] Implementar o uso de microserviços com o uso do Docker.

</details>

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Requisitos Funcionais

1. O sistema deve permitir o cadastro de livros, incluindo informações como título, autor, editora, ano de publicação, número de páginas e ISBN.
2. O sistema deve permitir o cadastro de usuários, incluindo informações como nome, endereço, telefone e e-mail.
3. O sistema deve permitir o registro de empréstimos de livros, incluindo informações como o livro emprestado, o usuário que fez o empréstimo e a data de empréstimo.
4. O sistema deve permitir a devolução de livros emprestados e atualizar o status do livro para disponível.
5. O sistema deve permitir a consulta de livros por título, autor, ISBN ou palavra-chave.
6. O sistema deve permitir a consulta de usuários por nome, endereço ou telefone.
7. O sistema deve permitir a visualização de empréstimos atuais e histórico de empréstimos de um usuário específico.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Requisitos Não Funcionais

O sistema será desenvolvido em Java, usando a biblioteca Swing para criar a interface gráfica do usuário. Para armazenamento de dados, o sistema utilizará o banco de dados relacional MySQL. O projeto será organizado em três camadas: a camada de apresentação, a camada de negócios e a camada de dados.

A camada de apresentação será responsável pela interface gráfica do usuário e interação com o usuário. A camada de negócios será responsável pela lógica de negócios do sistema, incluindo validação de dados, processamento de transações de empréstimo e devolução e consulta de informações do banco de dados. A camada de dados será responsável pelo acesso ao banco de dados relacional, incluindo operações de inserção, atualização e consulta de dados.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Funcionalidades do Sistema

Cadastro de Livros: Permite ao usuário cadastrar informações sobre um livro, incluindo título, autor, editora, ano de publicação, número de páginas e ISBN.
Cadastro de Usuários: Permite ao usuário cadastrar informações sobre um usuário, incluindo nome, endereço, telefone e e-mail.
Registro de Empréstimo: Permite ao usuário registrar o empréstimo de um livro para um usuário específico, incluindo a data de empréstimo.
Devolução de Livros: Permite ao usuário registrar a devolução de um livro emprestado.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Instruções de Instalação e Configuração

Para executar o sistema de gerenciamento de biblioteca, siga as instruções abaixo:

### Pré-requisitos

Antes de iniciar a instalação do sistema, é necessário ter as seguintes ferramentas instaladas:

- JDK 8 ou superior
- IDE Java, como Eclipse ou IntelliJ IDEA
- Maven 3 ou superior
- PostgreSQL 9.6 ou superior

### Rodando o projeto

1. Requisitos

   > Antes de começar, é necessário ter instalado na máquina o Java Development Kit (JDK) e o Maven. Além disso, é importante ter um servidor local como o Apache Tomcat ou o Jetty instalado e configurado.

2. Clonando o projeto
   > Abra o terminal e navegue até a pasta onde deseja clonar o projeto. Em seguida, execute o seguinte comando:

```bash
git clone https://github.com/seu-usuario/biblioteca.git
```

Substitua "seu-usuario" pelo nome de usuário da sua conta no GitHub.

3. Configurando o servidor

   > Copie o arquivo "biblioteca.war" que se encontra na pasta "target" do projeto e cole na pasta "webapps" do servidor.

4. Iniciando o servidor
   > Abra o terminal e navegue até a pasta "bin" do servidor. Em seguida, execute o seguinte comando:

```bash
./startup.sh
```

5. Testando o projeto

   > Abra o navegador e digite o endereço "http://localhost:8080/biblioteca". A página inicial da aplicação deve ser exibida.

6. Testando as rotas no Insomnia
   > Abra o Insomnia e crie um novo workspace para o projeto. Em seguida, crie as requisições para testar as rotas da aplicação, seguindo a documentação da API.

Exemplo de requisição para cadastrar um novo livro:

- Método: POST
- URL: http://localhost:8080/biblioteca/api/livros
- Headers:
  - Content-Type: application/json
- Body:

```json
{
  "titulo": "O Senhor dos Anéis",
  "autor": "J.R.R. Tolkien",
  "anoPublicacao": 1954
}
```

Ao enviar a requisição, o livro será cadastrado na base de dados e será retornado um objeto JSON com os dados do livro, incluindo o ID gerado automaticamente pelo sistema.

7. Encerrando o servidor

> Abra o terminal e navegue até a pasta "bin" do servidor. Em seguida, execute o seguinte comando:

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Utilizando Docker para executar o projeto

### Etapa 1: Instalação do Docker

1. Verificar se o sistema operacional suporta a instalação do Docker
2. Baixar o Docker de acordo com o sistema operacional utilizado
3. Instalar o Docker e verificar se a instalação foi concluída com sucesso

### Etapa 2: Configuração do Dockerfile

1. Criar um arquivo Dockerfile na raiz do projeto
2. Definir a imagem base a ser utilizada
3. Adicionar os comandos necessários para instalar as dependências do projeto
4. Adicionar os comandos necessários para copiar os arquivos do projeto para o container
5. Definir o comando a ser executado ao iniciar o container

### Etapa 3: Construção da imagem do Docker

1. A partir do terminal, navegar até a pasta onde o Dockerfile está localizado
2. Executar o comando `docker build -t <nome-da-imagem> .` para construir a imagem do Docker
3. erificar se a imagem foi criada com sucesso utilizando o comando `docker images`

### Etapa 4: Execução do container do Docker

1. Executar o comando `docker run -p <porta-externa>:<porta-interna> <nome-da-imagem>` para executar o container do Docker
2. Verificar se o container está sendo executado corretamente utilizando o comando `docker ps`

### Etapa 5: Teste do ambiente Dockerizado

1. Acessar a aplicação a partir do navegador utilizando a URL `http://localhost:<porta-externa>`
2. Verificar se a aplicação está funcionando corretamente

### Etapa 6: Distribuição do ambiente Dockerizado

1. Armazenar a imagem do Docker em um repositório de imagens Docker
2. Disponibilizar o arquivo Dockerfile e as instruções necessárias para executar o container em um repositório de código-fonte
3. Documentar o processo de utilização do ambiente Dockerizado para facilitar o uso por parte da equipe e comunidade.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Variáveis de Ambiente

> As variáveis de ambiente são uma maneira conveniente de armazenar informações sensíveis ou em constante mudança fora do código-fonte do projeto, permitindo que as informações sejam facilmente atualizadas sem a necessidade de alterar o código.

### Definindo variáveis de ambiente:

Para definir uma variável de ambiente, basta adicionar uma linha no arquivo `.env` na raiz do projeto com o nome da variável e seu valor, separados por um sinal de igual:

```bash
MINHA_VARIAVEL=valor-da-variavel
```

### Usando variáveis de ambiente

Para usar uma variável de ambiente em seu código Java, basta acessá-la através do objeto `System.getenv()`:

```java
String minhaVariavel = System.getenv("MINHA_VARIAVEL");
```

### Dicas

- Certifique-se de não armazenar informações sensíveis, como senhas, chaves de API ou tokens de acesso, em arquivos de código-fonte ou variáveis de ambiente públicas.

- Use nomes de variáveis descritivos e claros para facilitar a leitura e a manutenção do código.

- Evite definir variáveis de ambiente que já são comuns no sistema operacional, como `PATH` e `HOME`, para evitar conflitos.

- Verifique se todas as variáveis de ambiente necessárias estão definidas antes de executar o código.

### Variáveis de ambiente utilizadas no projeto

> O projeto utiliza as seguintes variáveis de ambiente:

- **BIBLIOTECA_DB_URL**: URL de conexão com o banco de dados
- **BIBLIOTECA_DB_USERNAME**: nome de usuário do banco de dados
- **BIBLIOTECA_DB_PASSWORD**: senha do banco de dados

### Exemplo de arquivo .env

```bash
BIBLIOTECA_DB_URL=jdbc:mysql://localhost:3306/biblioteca
BIBLIOTECA_DB_USERNAME=root
BIBLIOTECA_DB_PASSWORD=123456
```

### Valores Permitidos

Os valores permitidos para a variável `APP_ENV` são:

- `development`: para desenvolvimento
- `staging`: para ambiente de homologação
- `production`: para ambiente de produção

### Exemplo

> Para definir o ambiente como desenvolvimento, basta definir a variável `APP_ENV` com o valor `development`:

```javascript
export APP_ENV=development
```

Para verificar se a variável foi corretamente definida, basta executar o comando echo:

```bash
echo $APP_ENV
```

> O resultado deverá ser `development`.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Configuração do Banco de Dados

Antes de iniciar o sistema, é necessário configurar o banco de dados. Siga os passos abaixo para criar o banco de dados e a tabela necessária:

1. Abra o MySQL Server e crie um novo banco de dados com o seguinte comando:

```sql
CREATE DATABASE biblioteca;
```

2. Em seguida, crie a tabela "livros" com o seguinte comando:

```sql
CREATE TABLE livros (
  id INT PRIMARY KEY AUTO_INCREMENT,
  titulo VARCHAR(100) NOT NULL,
  autor VARCHAR(100) NOT NULL,
  editora VARCHAR(100) NOT NULL,
  ano_publicacao YEAR NOT NULL,
  num_paginas INT NOT NULL,
  isbn VARCHAR(20) NOT NULL,
  status VARCHAR(20) NOT NULL
);
```

3. Crie a tabela "usuarios" com o seguinte comando:

```sql
CREATE TABLE usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  endereco VARCHAR(200) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  email VARCHAR(100) NOT NULL
);
```

4. Crie a tabela "emprestimos" com o seguinte comando:

```sql
CREATE TABLE emprestimos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  livro_id INT NOT NULL,
  usuario_id INT NOT NULL,
  data_emprestimo DATE NOT NULL,
  data_devolucao DATE,
  FOREIGN KEY (livro_id) REFERENCES livros(id),
  FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
```

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Executando o Sistema

1. Clone o repositório do projeto para a sua máquina local usando o comando abaixo:

```bash
git clone https://github.com/seunome/sistemabiblioteca.git
```

2. Abra o IDE Java de sua preferência e importe o projeto clonado.
3. Abra o arquivo "Biblioteca.java" e execute o arquivo.

Com isso, o sistema será iniciado e estará pronto para uso.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Árvore de Arquivos

Abaixo está a árvore de arquivos do projeto:

```json
📦sistema-de-grenciamento-de-biblioteca
 ┣ 📂.vscode
 ┣ ┗ 📜settings.json
 ┣ 📂bin
 ┣ 📂doc
 ┣ ┣ 📜arquitetura.md
 ┣ ┣ 📜artigo-projeto.md
 ┣ ┣ 📜commitando-corretamente.md
 ┣ ┣ 📜diagnóstico-do-projeto.md
 ┣ ┣ 📜organizador.md
 ┣ ┣ 📜relato-coletivo.md
 ┣ ┣ 📜relato-de-experiência-individual.md
 ┣ ┗ 📜roadmap-do-projeto-biblioteca.md
 ┣ 📂docker
 ┣ ┣ 📜.dockerignore
 ┣ ┣ 📜docker-compose.yml
 ┣ ┗ 📜Dockerfile
 ┣ 📂lib
 ┣ 📂src
 ┣ 📜.gitingore
 ┣ 📜changelogs.md
 ┣ 📜CONTRIBUTORS.md
 ┣ 📜LICENSE
 ┣ 📜readme.md
 ┗ 📜startup.sh
```

O diretório src contém o código-fonte do projeto, dividido em três pacotes:

- `com.minhaempresa.biblioteca`: contém as classes principais do sistema, incluindo a classe `Biblioteca`, que é responsável por inicializar o sistema.
- `database`: contém as classes responsáveis pela conexão com o banco de dados e pela execução de consultas SQL.
- `exceptions`: contém as classes de exceção personalizadas do sistema.

O arquivo README.md contém a documentação do projeto e o arquivo LICENSE contém a licença do software. O arquivo .gitignore lista os arquivos e diretórios que devem ser ignorados pelo sistema de controle de versão Git.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Adicionando a funcionalidade RESTful

A funcionalidade RESTful será adicionada ao projeto Biblioteca por meio da criação de um endpoint REST que permitirá que outras aplicações possam acessar informações sobre livros, usuários e empréstimos. O endpoint será implementado por meio de uma camada de serviço que encapsulará a lógica de negócio do sistema e exibirá essa funcionalidade por meio de uma interface REST.

Para isso, siga as etapas abaixo:

### 1. Adicione a biblioteca Spring

Abra o arquivo pom.xml do projeto e adicione a seguinte dependência ao arquivo:

```java
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

Essa dependência adicionará o Spring ao projeto Biblioteca e permitirá a criação de endpoints RESTful.

### 2. Implemente a camada de serviço

Crie uma classe BibliotecaService que encapsule a lógica de negócio do sistema. Essa classe deve incluir métodos para buscar livros, usuários e empréstimos do banco de dados.

```java
@Service
public class BibliotecaService {

    @Autowired
    private LivroDAO livroDAO;

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private EmprestimoDAO emprestimoDAO;

    public List<Livro> buscarLivros() throws DAOException {
        return livroDAO.buscarTodos();
    }

    public List<Usuario> buscarUsuarios() throws DAOException {
        return usuarioDAO.buscarTodos();
    }

    public List<Emprestimo> buscarEmprestimos() throws DAOException {
        return emprestimoDAO.buscarTodos();
    }
}
```

Observe que a classe BibliotecaService faz uso de classes DAO para buscar informações no banco de dados.

### 3. Crie os endpoints RESTful

Crie uma classe BibliotecaController que irá receber as requisições HTTP e chamará os métodos da camada de serviço para buscar as informações necessárias. Essa classe deve ser anotada com @RestController para indicar que ela é um controlador RESTful.

```java
@RestController
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping("/livros")
    public List<Livro> buscarLivros() throws DAOException {
        return bibliotecaService.buscarLivros();
    }

    @GetMapping("/usuarios")
    public List<Usuario> buscarUsuarios() throws DAOException {
        return bibliotecaService.buscarUsuarios();
    }

    @GetMapping("/emprestimos")
    public List<Emprestimo> buscarEmprestimos() throws DAOException {
        return bibliotecaService.buscarEmprestimos();
    }
}
```

Essa classe cria três endpoints RESTful, um para buscar livros, outro para buscar usuários e outro para buscar empréstimos. Cada endpoint é anotado com @GetMapping e o caminho da URL correspondente.

### 4. Teste os endpoints

Agora que os endpoints RESTful foram criados, é possível testá-los para verificar se a funcionalidade está funcionando corretamente. Para testar, basta iniciar o servidor e fazer uma requisição HTTP para os endpoints criados:

- Para buscar todos os livros: `GET http://localhost:8080/livros`
- Para buscar todos os usuários: `GET http://localhost:8080/usuarios`
- Para buscar todos os empréstimos: `GET http://localhost:8080/emprestimos`

Essas requisições devem retornar uma lista de objetos JSON com as informações solicitadas.

Com a adição da funcionalidade RESTful ao projeto Biblioteca, outras aplicações poderão se integrar ao sistema e acessar informações sobre livros, usuários e empréstimos. Essa funcionalidade foi implementada utilizando o framework Spring, que é amplamente utilizado para o desenvolvimento de aplicações web em Java. A documentação apresentada forneceu uma visão geral do processo de adição da funcionalidade RESTful e pode ser usada como referência para outras aplicações que desejam implementar uma interface REST.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Deploy da Biblioteca

### Introdução

Nesta seção, discutiremos como fazer o deploy da aplicação Biblioteca em diferentes provedores de nuvem. Primeiro, discutiremos o que é o deploy e por que é importante para o sucesso da aplicação. Em seguida, discutiremos algumas das considerações importantes para fazer o deploy de uma aplicação, como a escolha de um provedor de nuvem, a configuração do ambiente, etc.

### O que é Deploy?

Deploy é o processo de implantar e configurar um software em um ambiente de produção. O objetivo do deploy é colocar um software em funcionamento, tornando-o disponível para uso pelos usuários finais. O deploy geralmente inclui a configuração do ambiente, o carregamento do software, a configuração do banco de dados e outros serviços de back-end necessários, bem como a configuração do servidor web e outros componentes necessários para disponibilizar o software para uso pelos usuários.

### Considerações Importantes

> Antes de começar a implantar a aplicação Biblioteca, é importante considerar algumas das questões importantes. Algumas dessas considerações incluem:

- Escolha de provedor de nuvem: existem vários provedores de nuvem disponíveis, cada um com suas próprias vantagens e desvantagens. É importante escolher um provedor que atenda às necessidades específicas do seu aplicativo e da sua organização.

- Configuração do ambiente: o ambiente de produção deve ser configurado corretamente para garantir que a aplicação seja executada corretamente. Isso inclui a instalação e configuração de todos os componentes necessários, como o servidor web, o banco de dados e outros serviços de back-end.

- Segurança: é importante garantir que a aplicação seja implantada de forma segura e que todas as configurações e dados confidenciais sejam protegidos.

- Escalabilidade: a aplicação deve ser implantada de forma que possa ser escalada facilmente à medida que a demanda cresce. Isso inclui a configuração de serviços em cluster, balanceamento de carga e outras considerações de escalabilidade.

### Provedores de nuvem

> Existem vários provedores de nuvem disponíveis para implantar a aplicação Biblioteca. Alguns dos provedores mais populares incluem:

- DigitalOcean: um provedor de nuvem fácil de usar e acessível que oferece servidores virtuais privados (VPS) e outros serviços de infraestrutura.

- Heroku: um provedor de nuvem baseado em plataforma que oferece uma variedade de serviços, incluindo bancos de dados gerenciados, serviços de autenticação e muito mais.

- Amazon Web Services (AWS): um dos maiores provedores de nuvem do mundo, que oferece uma ampla gama de serviços e recursos de infraestrutura.

### Configuração do ambiente

> Antes de prosseguir com a implantação da aplicação Biblioteca, é importante garantir que o ambiente esteja devidamente configurado. Abaixo, serão apresentados os passos necessários para a configuração do ambiente de produção:

1. Certifique-se de que o servidor possua a versão do Java compatível com a aplicação Biblioteca. Recomenda-se utilizar a versão 11 ou superior.

2. Instale o banco de dados PostgreSQL. Recomenda-se utilizar a versão 11 ou superior. Certifique-se de criar um usuário e um banco de dados para a aplicação.

3. Crie um arquivo config.json na raiz da aplicação com as seguintes informações:

```json
{
  "serverPort": 8080,
  "database": {
    "url": "jdbc:postgresql://localhost:5432/nome_do_banco",
    "username": "nome_do_usuario",
    "password": "senha_do_usuario"
  }
}
```

> Substitua nome_do_banco, nome_do_usuario e senha_do_usuario pelos valores corretos.

4. Execute a aplicação com o seguinte comando:

```bash
java -jar biblioteca.jar
```

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Implantação da aplicação na nuvem

> Existem diversos provedores de nuvem que podem ser utilizados para implantar a aplicação Biblioteca. Abaixo, serão apresentados os passos necessários para a implantação da aplicação em dois provedores de nuvem: DigitalOcean e Heroku.

### 1. Crie uma conta no Heroku

Acesse o site [Heroku](https://www.heroku.com/) e crie uma conta.

### 2. Instale o Heroku CLI

Para fazer o deploy do projeto, será necessário instalar o Heroku CLI. Para isso, siga as instruções de instalação disponíveis [aqui](https://devcenter.heroku.com/articles/heroku-cli).

### 3. Faça o login no Heroku

Faça o login no Heroku com o comando `heroku login` e insira suas credenciais.

### 4. Crie um novo app

Crie um novo app no Heroku com o comando `heroku create`.

### 5. Faça o deploy do projeto

Faça o deploy do projeto com o comando `git push heroku master`.

### 6. Execute as migrações

Execute as migrações com o comando `heroku run python manage.py migrate`.

### 7. Acesse o app

Acesse o app com o comando `heroku open`.

[![Deploy with Heroku](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy?template=https://github.com/LTD-cyber-security/DevSite)

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Features

### Stack Utilizada

> Backend

    * Java 11
    * Spring Boot 2.5.6
    * Maven 3.8.2
    * PostgreSQL 13.4

> Infraestrutura

    * Docker 20.10.8
    * Docker Compose 1.29.2
    * AWS EC2
    * Nginx 1.20.1

> Testes

    * JUnit 5.7.2
    * Mockito 3.12.4
    * Spring Boot Test 2.5.6

> Documentação

    * Swagger 3.0.0
    * SpringFox 3.0.0

> Segurança

    * Spring Security 5.5.2
    * JWT (JSON Web Token) 0.11.2

> Outros

    * Lombok 1.18.20

> > Cada uma dessas tecnologias foi escolhida visando a melhor eficiência e produtividade na implementação do projeto.

### Nível Básico

1. Adicionar livros à biblioteca
2. Visualizar a lista de livros da biblioteca
3. Pesquisar livros por título, autor e categoria

### Nível Intermediário

1. Editar informações de um livro na biblioteca
2. Remover um livro da biblioteca
3. Adicionar e editar informações de usuários que alugaram livros
4. Visualizar histórico de empréstimos de um livro
5. Visualizar histórico de empréstimos de um usuário

### Nível Avançado

1. Gerar relatórios de empréstimos e livros mais populares
2. Enviar notificações automáticas de livros atrasados ou devoluções pendentes
3. Integração com sistemas de pagamento para cobrança de multas
4. Criação de perfil de usuário com histórico de empréstimos e lista de livros favoritos
5. Sistema de reservas de livros e gerenciamento de filas de espera

### Nível Especialista

1. Implementação de algoritmos de recomendação de livros com base no histórico de empréstimos e nas preferências do usuário
2. Integração com plataformas de e-books e audiolivros
3. Integração com sistemas de bibliotecas interconectadas
4. Implementação de sistema de chatbot para atendimento ao usuário
5. Utilização de inteligência artificial para análise de dados de empréstimos e geração de insights para melhorias na biblioteca.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Contribuindo para o projeto

<h1 align="righ">
    <img src="https://github.blog/wp-content/uploads/2019/05/mona-heart-featured.png?resize=1600%2C850" alt="DevSite" width="400">
</h1>

Para contribuir com o projeto, siga as instruções abaixo:

### 1. Faça um fork do projeto

Faça um fork do projeto clicando no botão Fork no canto superior direito da página.

### 2. Crie uma branch para sua modificação

```bash
# Clone o repositório
$ git clone https://github.com/project-java-at-estacio/projeto

# Entre no repositório
$ cd projeto

# Crie uma branch com a sua modificação
$ git checkout -b feature/nome-da-modificacao
```

### 3. Faça o commit das suas alterações

```bash
# Faça o commit com as suas alterações
$ git commit -m 'feat: Minha nova modificação'

# Faça o push para a sua branch
$ git push origin feature/nome-da-modificacao
```

### 4. Abra uma pull request

Depois que o seu pull request for mergeado, você pode deletar a sua branch.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Contribuidores

Clique [aqui](CONTRIBUTORS.md) para ver a lista de contribuidores.

Agradecemos às seguintes pessoas por suas contribuições para este projeto:

<a href="">
  <img src="https://contrib.rocks/image?repo=estevam5s/rest-api-nasa" />
</a>
<a href="">
  <img src="https://contrib.rocks/image?repo=Lorenzorangelt/Lorenzorangelt" />
</a>
<a href="">
  <img src="https://contrib.rocks/image?repo=Guisv26/Teste-Estagio-Neoway" />
</a>

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Arquitetura da Aplicação

Read [Architecture.md](gerenciador-bibliotecas.wiki/5.-Arquitetura.md) to understand how everything is working.

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## 💻 Planejamento da equipe

- [organizador](doc/organizador.md)

## 💻 Documentação do que foi mandado fazer

- [Diagnóstico do projeto](doc/diagnóstico-do-projeto.md)
- [Relato coletivo](doc/relato-coletivo.md)
- [Relato de experiência individual](doc/relato-de-experiência-individual.md)

## 💻 Documentação para não se perder

- [Roadmap do projeto biblioteca](gerenciador-bibliotecas.wiki/9.-Roadmap-do-projeto-biblioteca.md)
- [Começando](doc/get-started.md)
- [Configurando o projeto na máquina local](gerenciador-bibliotecas.wiki/1.-Configurando-o-projeto-na-máquina-local.md)
- [Home](gerenciador-bibliotecas.wiki/8.-Home.md)
- [ O que é Docker para esse projeto](gerenciador-bibliotecas.wiki/10.-O-que-é-Docker-para-esse-projeto.md)
- [Banco de Dados](doc/database.md)
- [ Artigo projeto](gerenciador-bibliotecas.wiki/6.-artigo-projeto.md)

## 💻 Docs

- [O que é Git e GitHub](gerenciador-bibliotecas.wiki/2.-O-que-é-Git-e-GitHub.md)
- [Comandos do Git](gerenciador-bibliotecas.wiki/3.-Comandos-do-Git.md)
- [Commitando corretamente](gerenciador-bibliotecas.wiki/7.-commitando-corretamente.md)
- [Pull Requests](gerenciador-bibliotecas.wiki/4.-Pull-Requests.md)

## 💻 Outros docs

- [Arquitetura](gerenciador-bibliotecas.wiki/5.-Arquitetura.md)

## 💝 Sponsors

O Nosso projeto é mantido por uma equipe de voluntários e patrocinadores. Se você gostaria de patrocinar o projeto, entre em contato com o [email](mailto:estevamsouzalaureth@gmail.com).

O nosso patrocinador principal é:

<a href="">
  <img src="https://contrib.rocks/image?repo=estevam5s/rest-api-nasa" />
</a>
<br>
<a href="https://github.com/sponsors/estevam5s" target="_blank"><img height="40" alt="GitHub Sponsor" src = "https://img.shields.io/badge/Sponsor me on GitHub-30363D?style=for-the-badge&logo=GitHub-Sponsors&logoColor=#white"></a>

![](https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif)
[Volte ao inicio da Documentação 🔝](#topo)

## Conclusão

No decorrer deste projeto, pudemos explorar e implementar uma aplicação de gerenciamento de livros utilizando tecnologias modernas e diversas técnicas de desenvolvimento.

Aqui estão algumas das principais áreas abordadas neste projeto:

I. Tecnologias Utilizadas:

    Exploramos as principais tecnologias utilizadas, tais como Java, Spring Boot, PostgreSQL e Thymeleaf, entre outras.

II. Arquitetura da Aplicação:

    Discutimos a arquitetura da aplicação e como diferentes componentes interagem entre si para formar a funcionalidade geral da aplicação.

III. Desenvolvimento de Software:

    Abordamos técnicas de desenvolvimento de software, incluindo o uso de padrões de design, como o padrão DAO, para separar a lógica de negócios da camada de acesso a dados.

IV. Implantação na Nuvem:

    Configuramos um ambiente de desenvolvimento para a aplicação e implantamos a aplicação em um provedor de nuvem, como a Digital Ocean, utilizando tecnologias como Docker e Docker Compose.

V. Testes de Unidade:

    Implementamos testes de unidade para garantir que o código funcione corretamente.

VI. Documentação:

    Documentamos o projeto em vários níveis, incluindo a documentação técnica e a documentação do usuário.

Concluímos que este projeto foi uma ótima oportunidade para aprender e explorar várias tecnologias modernas e técnicas de desenvolvimento. O resultado final é uma aplicação funcional que pode ser implantada em um ambiente de produção.

> Em resumo, este projeto mostrou que o uso de tecnologias modernas pode facilitar o desenvolvimento e a implantação de aplicativos, tornando a vida mais fácil para desenvolvedores e usuários. Esperamos que este projeto tenha sido útil e inspirador para aqueles que desejam se aventurar no mundo do desenvolvimento de software.

[Volte ao inicio da Documentação 🔝](#topo)
