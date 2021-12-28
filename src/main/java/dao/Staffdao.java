package dao;

import Models.Staff;

import javax.print.DocFlavor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Productdao {
    private static Connection connection = ConnectMySql.getConnection();

    public static List<Staff> getAllStaff() {
        String sqlGetAll = "SELECT * FROM staff";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Staff> staffList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String img = resultSet.getString("img");

                staffList.add(new Staff(id, name, age, img));
            }
            return staffList;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void saveStaff(Staff staff){
        String saveSQL = "INSERT INTO staff(name, age, img) VALUE (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setString(1,staff.getName());
            preparedStatement.setInt(2,staff.getAge());
            preparedStatement.setString(3,staff.getImg());

            preparedStatement.execute();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteStaff(int id) {
        String deleteSQL = "DELETE table staff where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editStaff(Staff staff) {
        String editSQL = "UPDATE staff set name = ?, age = ?, img = ? where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(editSQL);
            preparedStatement.setInt(4,staff.getId());
            preparedStatement.setString(1,staff.getName());
            preparedStatement.setInt(2,staff.getAge());
            preparedStatement.setString(3,staff.getImg());
            preparedStatement.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
