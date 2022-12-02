package Metodos_SQL;

import Vistas.graficaTablas;
import Vistas.nuevoprograma;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class MetodosSQL 
{
    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero = 0;
    
    
    public int guardar(String nombre, String correo, String usuario, String contraseña)
    {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = "INSERT INTO usuario(nombre, correo, usuario, contrasena, tipo) values (?,?,?,?, '0')";
        
        try
        {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentenciaGuardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, correo);
            sentencia_preparada.setString(3, usuario);
            sentencia_preparada.setString(4, contraseña);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
        return resultado;
    }
    
      public ArrayList<nuevoprograma> infoTablas(String codigo, String consulta) {
        
        ArrayList<nuevoprograma> arrayListPublicaciones=new ArrayList<>();
        Connection conexion = null;
        try {
            
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = "SELECT "+consulta+", periodo FROM nuevoprograma WHERE codigo_programa = '" +codigo+"' ";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
         
            
            while (resultado.next()) {                
                nuevoprograma programa = new nuevoprograma();             
                programa.setMatriculados(resultado.getInt(consulta));  
                programa.setPeriodo(resultado.getString("periodo"));
                arrayListPublicaciones.add(programa);
            }
            
            for(int i = 0; i < arrayListPublicaciones.size(); i++)
            {
                System.out.println(arrayListPublicaciones.get(i).getMatriculados());
                
                
            }
            

            return arrayListPublicaciones;
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return arrayListPublicaciones;
        }
    }
    public void buscarDatosTabla()
    {
        ArrayList<String> nombreArray  = new ArrayList<String>();
        String busquedaMatriculados = null;
        Connection conexion = null;
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = "SELECT matriculados FROM nuevoprograma";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                //String nombre = resultado.getString("nombre");
                //String apellido = resultado.getString("apellido");
                //busquedaNombre = (nombre +" "+ apellido);
                
                String matriculados = resultado.getString("matriculados");
                nombreArray.add(matriculados);
                busquedaMatriculados = (matriculados);
            }
            
            for(int i = 0; i < nombreArray.size(); i++)
            {
                nombreArray.get(i);
            }
            conexion.close();
            
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        
        
    }
    public String buscarNombre(String usuario)
    {
        String busquedaNombre = null;
        Connection conexion = null;
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = "SELECT nombre FROM usuario WHERE usuario = '" +usuario+"' ";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                String nombre = resultado.getString("nombre");
                
                busquedaNombre = (nombre);
            }
            
            conexion.close();
            
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        
        return busquedaNombre;
    }
    
            
    public String buscarUsuarioRegistrado(String usuario, String contrasena)
    {
        String busquedaUsuario = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscarUsuario = "SELECT nombre,usuario,contrasena FROM usuario WHERE usuario = '" +usuario+"' && contrasena = '"+contrasena+ "'";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                busquedaUsuario = "usuario encontrado";
            }else
            {
                busquedaUsuario = "usuario no encontrado";
            }
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
        return busquedaUsuario;
    }
    
    public String buscarTipo(String usuario)
    {
        String busquedaTipo = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscarTipo = "SELECT tipo FROM usuario WHERE usuario= '" + usuario +"'";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscarTipo);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                String tipo = resultado.getString("tipo");
                busquedaTipo = tipo;
            }
            
            conexion.close();
            
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        return busquedaTipo;
    }
    
    public int guardarAdministrador(String nombre, String correo, String usuario, String contraseña, String tipo)
    {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = "INSERT INTO Usuario(nombre, correo, usuario, contrasena, tipo) values (?,?,?,?,?)";
        
        try
        {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentenciaGuardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, correo);
            sentencia_preparada.setString(3, usuario);
            sentencia_preparada.setString(4, contraseña);
            sentencia_preparada.setString(5, tipo);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
        return resultado;
        
    }
    
    public int actualizarTipo(String usuario, String tipo)
    {
        int resultado = 0;
        int comprobante = 0; 
        String busquedaUsuario = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentencia = "UPDATE Usuario SET tipo='"+ tipo +"' WHERE usuario = '"+ usuario+ "'";
            sentencia_preparada = conexion.prepareStatement(sentencia);
            resultado = sentencia_preparada.executeUpdate();
            
            
            
        }catch(SQLException e)
            {
        
            System.out.println(e);
                   
        }
        
        return comprobante;
    }
    
    public int guardarInformacionTabla(String codigo_programa, String nombre_programa, String periodo, int inscritos, int admitidos, int matriculados, int graduados)
    {
        int resultado = 0;
        
        Connection conexion = null;
        
        String sentenciaGuardar = "INSERT INTO nuevoprograma(codigo_programa, nombre_del_programa, periodo, inscritos, admitidos, matriculados, graduados) values (?,?,?,?,?,?,?)";
        
        try
        {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentenciaGuardar);
            sentencia_preparada.setString(1, codigo_programa);
            sentencia_preparada.setString(2, nombre_programa);
            sentencia_preparada.setString(3, periodo);
            sentencia_preparada.setInt(4, inscritos);
            sentencia_preparada.setInt(5, admitidos);
            sentencia_preparada.setInt(6, matriculados);
            sentencia_preparada.setInt(7, graduados);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
      
        
        return resultado;
    }
    
    
    public int guardarTablaModificacion(String nombre_administrador, String usuario_administrador, String correo_administrador, String nombre_indicador)
    {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = "INSERT INTO indicadores(nombre_administrador, usuario_administrador, correo_administrador, nombre_indicador) values (?,?,?,?)";
        
        try
        {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentenciaGuardar);
            sentencia_preparada.setString(1, nombre_administrador);
            sentencia_preparada.setString(2, usuario_administrador);
            sentencia_preparada.setString(3, correo_administrador);
            sentencia_preparada.setString(4, nombre_indicador);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
        return resultado;
    }
    
    public String buscarNombreAdministrador(String usuario)
    {
        String busquedaTipo = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscarTipo = "SELECT nombre FROM usuario WHERE usuario= '" + usuario +"'";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscarTipo);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                String nombre = resultado.getString("nombre");
                busquedaTipo = nombre;
            }
            
            conexion.close();
            
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        return busquedaTipo;
    }
    
    public String buscarCorreo(String usuario)
    {
        String busquedaTipo = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentenciaBuscarTipo = "SELECT correo FROM usuario WHERE usuario= '" + usuario +"'";
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscarTipo);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next())
            {
                String correo = resultado.getString("correo");
                busquedaTipo = correo;
            }
            
            conexion.close();
            
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        return busquedaTipo;
    }
    
    public int guardarSaberPro(String codigo_programa, String nombre_programa, String numero_estudiantes, String competencia_ciudadana, String razonamiento_cuantitativo, String comunicacion_escrita, String ingles, String lectura_critica)
    {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = "INSERT INTO saberpro(codigo_programa, nombre_programa, numero_estudiantes, competencia_ciudadana, razonamiento_cuantitativo, comunicacion_escrita, ingles, lectura_critica ) values (?,?,?,?,?,?,?,?)";
        
        try
        {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentenciaGuardar);
            sentencia_preparada.setString(1, codigo_programa);
            sentencia_preparada.setString(2, nombre_programa);
            sentencia_preparada.setString(3, numero_estudiantes);
            sentencia_preparada.setString(4, competencia_ciudadana);
            sentencia_preparada.setString(5, razonamiento_cuantitativo);
            sentencia_preparada.setString(6, comunicacion_escrita);
            sentencia_preparada.setString(7, ingles);
            sentencia_preparada.setString(8, lectura_critica);
            
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
        return resultado;
    }
    
    
    
    public int actualizarContraseña(String usuario, String contrasena)
    {
        int resultado = 0;
        int comprobante = 0; 
        String busquedaUsuario = null;
        
        Connection conexion = null;
        
        try
        {
            conexion = ConexionBD.conectar();
            String sentencia = "UPDATE Usuario SET contrasena='"+ contrasena +"' WHERE usuario = '"+ usuario+ "'";
            sentencia_preparada = conexion.prepareStatement(sentencia);
            resultado = sentencia_preparada.executeUpdate();
            
            
            
        }catch(SQLException e)
            {
        
            System.out.println(e);
                   
        }
        
        return comprobante;
    }
}
