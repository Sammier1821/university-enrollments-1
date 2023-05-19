package entidades;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String codigo;            // 10 caracteres    20 Bytes
    private String dni;             // 8 caracteres     16 Bytes
    private String nombre;          // 25 caracteres    50 Bytes
    private String apellidos;       // 25 caracteres    50 Bytes
    private String direccion;       // 50 caracteres    100 Bytes

    public Estudiante(){
        this("1234567890","12345678","NN","AA","SA988");
    }
    
    public Estudiante(String codigo, String dni, String nombre, String apellidos, String direccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTamaño(){
        return ((getCodigo().length() + getDni().length() + getNombre().length() + getApellidos().length() + getDireccion().length()) * 2);
    }
    
    @Override
     public String toString(){
         return "INFORMACION DEL ESTUDIANTE" 
                 + "\nCodigo: " + getCodigo() 
                 + "\nDNI: " + getDni() 
                 + "\nNombre: " + getNombre() 
                 + "\nApellidos: " + getApellidos() 
                 + "\nDireccion: " + getDireccion(); 
    }
}
