package project.dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnect {
    public static void main(String[] args) {
        System.out.println("-------Проверка подключения-----------");

        Connection connection = null;
        try {
             connection = DriverManager.getConnection(
                    "jdbc:mysql://dev-server:3306/testUsers",
                    "root","MySQLRootPassword12");
        } catch (SQLException e) {
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE,null,e);
        }
        if(null != connection) {
            System.out.println("------- Подключение установлено -------");
        } else {
            System.out.println("------- Подключение НЕ установлено -------");
        }

    }
}
