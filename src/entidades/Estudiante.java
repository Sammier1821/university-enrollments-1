package entidades;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String code;            // 10 caracteres    20 Bytes
    private String DNI;             // 8 caracteres     16 Bytes
    private String nombre;          // 25 caracteres    50 Bytes
    private String apellidos;       // 25 caracteres    50 Bytes
    private String direccion;       // 50 caracteres    100 Bytes

    public Estudiante(){
        this("1234567890","12345678","NN","AA","SA988");
    }
    
    public Estudiante(String code, String DNI, String nombre, String apellidos, String direccion) {
        this.code = code;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
        return ((getCode().length()+getDNI().length()+getNombre().length()+getApellidos().length()+getDireccion().length())*2);
    }
    
    @Override
     public String toString(){
         return "INFORMACION DEL ESTUDIANTE" 
                 + "\nCodigo: " + getCode() 
                 + "\nDNI: " + getDNI() 
                 + "\nNombre: " + getNombre() 
                 + "\nApellidos: " + getApellidos() 
                 + "\nDireccion: " + getDireccion(); 
    }
}
