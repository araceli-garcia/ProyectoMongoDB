
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;




public class Campeon implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;    
    private String nombre;   
    private int edad;
    private String sexo;
    private int tipo;
    private BigDecimal precio; 
    private Date fechaCreacion;
    private Date fechaActualizacion;  
    private Date fechaEliminacion; 
  


    public Campeon() {
        super();
    }

    public Campeon(String nombre, int edad, String sexo, int tipo, BigDecimal precio, Date fechaCreacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipo = tipo;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

 
}
