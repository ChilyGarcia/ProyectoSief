package Metodos_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD 
{
    //Cambié el nombre de la base de datos para poder probarla en el computador de la universidad
    
    public static String url = "jdbc:mysql://localhost/bd_project";
    public static String usuario = "root";
    public static String contraseña = ""; // le quito la contrsaeña porque no necesita
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection conectar()
    {
        Connection conexion = null;
        try
        {           
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion Establecida");
        }catch(SQLException e)
        {
            System.err.println("Error "+e);
        }
        
        return conexion;
    }

}
