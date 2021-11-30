package com.amal.sqlUpdate;
import java.sql.*;

public class SqlJob extends EditData{

    public void editStudent(String newName, String id){
     try {
             Connection con = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/testDB", "root", "root");
         //String query = "update student set "+columnName+ "="+value+" where "+rawName+" = "+rawValue;
         String query = "update student set name = ? where id = ?";

         PreparedStatement preparedStmt = con.prepareStatement(query);
         preparedStmt.setString   (1, newName);
         preparedStmt.setString(2, id);

         // execute the java preparedstatement
         int result = preparedStmt.executeUpdate();
         System.out.format("Execute result is %d\n", result);
         con.close();
         }
     catch (Exception e){
         e.printStackTrace();
     }
    }


}
