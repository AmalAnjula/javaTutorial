package com.amal.sqldelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlJob  extends DeleteRecords {
    public void deleteStudent(String id) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB", "root", "root");
            String sql = "DELETE FROM student WHERE id = "+id;
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
