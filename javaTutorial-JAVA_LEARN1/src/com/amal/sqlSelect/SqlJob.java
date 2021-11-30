package com.amal.sqlSelect;

import java.sql.*;

public class SqlJob extends FindStudent {

    private String idStr="";



    private void findStudent(String id) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDB", "root", "root");
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM student WHERE id=" + id;
            // create the java statement
            Statement st = con.createStatement();
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultset
            while (rs.next()) {
                String firstName = rs.getString("name");
                int age = rs.getInt("age");
                String password = rs.getString("password");
                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, id, firstName, age, password);
            }
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void studentId(String idStr) {
        this.idStr = idStr;
        findStudent(this.idStr);
    }
}
