
package universidadgrupo9.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    
    private static final String DB = "universidadejemplo";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
    
        if(connection == null){
        
            try {
                
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager.getConnection(URL + DB, usuario,password);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null, "Error en los Drivers");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en conectarse a la SQL");
            }
        
        }
        
        return connection;
    
    }
    
}
