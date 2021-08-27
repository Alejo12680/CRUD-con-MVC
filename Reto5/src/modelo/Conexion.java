
package modelo;

import java.sql.*;

public class Conexion {
    Connection con;
        
    public Connection getConnection(){
        String JDBC_URL="jdbc:mysql://localhost:3306/reto5";
        String JDBC_USER= "root";
        String JDBC_PASSWORD= "admin";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
                       
        }
        return con;
    }
    
}
