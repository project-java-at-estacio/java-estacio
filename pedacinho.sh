#!/usr/bin/env fish

# Define o caminho dos arquivos de classe e bibliotecas
set -x CLASSPATH . ./lib/* 

# Compilar o código Java
javac -cp $CLASSPATH src/main/java/com/grupo8/pedacinhodoceupdv/main/Main.java -d ./build

# Verificar se a compilação foi bem-sucedida
if test $status -eq 0
    echo "Compilação concluída com sucesso."

    # Entrar no diretório de compilação
    cd build

    # Executar o arquivo Java
    java -cp $CLASSPATH com.grupo8.pedacinhodoceupdv.main.Main
else
    echo "Erro na compilação."
end
