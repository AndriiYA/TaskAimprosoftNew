package Dao;


import model.Employce;
import services.MySqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployceDao {

    private static String SQL_INSERT = "INSERT INTO employce VALUES(?, ?, ?, ?, ?, ?);";
    private static String SQL_UPDATE = "UPDATE employce set name=?, age=?, email =?, phoneNumber =?, birthday =? where id=?";
    private static String SQL_SELECT = "SELECT * FROM employce;";
    private static String SQL_DELETE = "delete from employce;";
    private static String SQL_SELECT_BY_ID = "SELECT * FROM employce where id = ?;";
    private static String SQL_DELETE_BY_ID = "DELETE FROM employce WHERE id = ?;";

/*
    public void showAll() {
        MySqlConnection worker = new MySqlConnection();
        String query = SQL_SELECT; // Вывести всех из таблицы
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Employce employce = new Employce();
                employce.setId(resultSet.getInt(1));
                employce.setName(resultSet.getString(2));
                employce.setAge(resultSet.getInt(3));
                employce.setEmail(resultSet.getString(4));
                employce.setBirthday(resultSet.getDate(5));

                System.out.println(employce);
            }
        } catch (SQLException e) {
            System.out.println(e.fillInStackTrace());

        }
    }
}
*/


    private Connection connection;

    public EmployceDao() {
        connection = MySqlConnection.getConnection();
    }

    public List<Employce> getAllEmployce() {
        List<Employce> employces = new ArrayList<Employce>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employce");
            while (rs.next()) {
                Employce employce = new Employce();
                employce.setId(rs.getInt("id"));
                employce.setName(rs.getString("name"));
                employce.setAge(rs.getInt("age"));
                employce.setBirthday(rs.getDate("birthday"));
                employce.getEmail(rs.getString("email"));
                employces.add(employce);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employces;


    }

    public void deleteEployee(int id) {
    }

    public Employce getEmployeeById(int id) {
        return null;
    }

    public Employce getEmployceById(int id) {
        return null;
    }
}



