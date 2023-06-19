FROM mysql:8.0

# Defina as variáveis de ambiente do MySQL
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=DBPEDACINHODOCEU
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=user

# Copie o arquivo SQL para o diretório /docker-entrypoint-initdb.d/ para que seja executado na criação do banco de dados
COPY schema.sql /docker-entrypoint-initdb.d/

# Exponha a porta padrão do MySQL
EXPOSE 3306

# Inicialize o MySQL ao iniciar o contêiner
CMD ["mysqld"]
