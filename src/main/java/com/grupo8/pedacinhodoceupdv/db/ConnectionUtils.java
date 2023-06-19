package com.grupo8.pedacinhodoceupdv.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection obterConexao() throws ClassNotFoundException,
            SQLException {

        // 1) Declarar o driver JDBC de acordo com o Banco de dados usado
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/DBPEDACINHODOCEU?useTimezone=true&serverTimezone=UTC",
                "user",
                "user");
        return conn;
    }
}
