/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author Aula 103
 */
public class nuevoprograma 
{
    private String codigo_programa;
    private String nombre_del_programa;
    private String periodo;
    private int inscritos;
    private int admitidos;
    private int matriculados;
    private int graduados;
    
    public nuevoprograma()
    {
        
    }
    public nuevoprograma(String codigo_programa, String nombre_del_programa, String periodo, int inscritos, int admitidos, int matriculados, int graduados)
    {
        this.codigo_programa = codigo_programa;
        this.nombre_del_programa = nombre_del_programa;
        this.periodo = periodo;
        this.inscritos = inscritos;
        this.admitidos = admitidos;
        this.matriculados = matriculados;
        this.graduados = graduados;
        
                
    }

    public String getCodigo_programa() {
        return codigo_programa;
    }

    public void setCodigo_programa(String codigo_programa) {
        this.codigo_programa = codigo_programa;
    }

    public String getNombre_del_programa() {
        return nombre_del_programa;
    }

    public void setNombre_del_programa(String nombre_del_programa) {
        this.nombre_del_programa = nombre_del_programa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getInscritos(){
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public int getAdmitidos() {
        return admitidos;
    }

    public void setAdmitidos(int admitidos) {
        this.admitidos = admitidos;
    }

    public int getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(int matriculados) {
        this.matriculados = matriculados;
    }

    public int getGraduados() {
        return graduados;
    }

    public void setGraduados(int graduados) {
        this.graduados = graduados;
    }
    
   
}
