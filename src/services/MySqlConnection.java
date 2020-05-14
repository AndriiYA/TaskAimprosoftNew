package services;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class MySqlConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306/myDb?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection = null;

    public static Connection getConnection () {
        if(connection != null){
            return connection;
        }else{
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        }catch(Exception e){
            System.out.println("Can't registre sql deriver: "+ e.getMessage());
            return  null;
        }
        return connection;
        }
    }
    public MySqlConnection(){

    }

}












