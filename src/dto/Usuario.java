
package dto;


public class Usuario {
    
    private int idestudiante;
    private String nombre;
    private String apellido;
    private int dni;
    private String codigo;
    private String direccion;
    private String año;
    private String sexo;

    public Usuario() {
    }

    public Usuario(int idestudiante, String nombre, String apellido, int dni, String codigo, String direccion, String año, String sexo) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigo = codigo;
        this.direccion = direccion;
        this.año = año;
        this.sexo = sexo;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

   

    
    }

   
    
    
    
    

