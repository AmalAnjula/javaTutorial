package com.amal.sqltest;
import java.sql.*;

public class SqlTest {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?)");
            stmt.setInt(1, 101);//1 specifies the first parameter in the query
            stmt.setString(2, "saman");
            stmt.setInt(3, 4);
            int i = stmt.executeUpdate();
            System.out.println(i + " updated");
            con.close();

        } catch (Exception e) {
            System.out.printf(e.toString());
        } finally {

        }
    }
}
