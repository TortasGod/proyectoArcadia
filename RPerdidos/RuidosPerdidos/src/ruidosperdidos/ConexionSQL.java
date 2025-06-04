
package ruidosperdidos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    public static Connection con ;
    
    public static Connection ConexionSQLServer() {

        String conexionUr1 = "jdbc:sqlserver://localhost:1433;"
                + "database=RuidosPerdidos;"
                + "user=sa;"
                + "password=Tecnologico1;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;"; //tiempo de proceso de conexión
        try {
            con = DriverManager.getConnection(conexionUr1);
            System.out.println("Conectado");
            return con;
        } catch (SQLException ex) {
            System.out.println("Error de conexión");
            System.out.println(ex.toString());
            return null;
        }
        
        
    }//conectar SQLServer
    
    
    public static void main(String[] args) {
        ConexionSQLServer();
    }
    
}

