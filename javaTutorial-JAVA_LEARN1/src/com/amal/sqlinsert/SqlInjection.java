package com.amal.sqlinsert;
import java.sql.*;

public class SqlInjection extends AddStudent {

    public SqlInjection(String name, int age, String password, int id) {
        super(name, age, password, id);

        int result=0;
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, name);//1 specifies the first parameter in the query
            stmt.setInt(3, age);
            stmt.setString(4,password);

            result = stmt.executeUpdate();
            con.close();
            System.out.println("added ok");

        } catch (Exception e) {
            System.out.printf(e.toString());
        } finally {
            System.out.println("All ok");
        }

    }


}

