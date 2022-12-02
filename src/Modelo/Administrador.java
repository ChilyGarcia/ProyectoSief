
package Modelo;

public class Administrador 
{
    String nombre, apellido, programa;
    
    public Administrador(String nombre, String apellido, String programa)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
}
