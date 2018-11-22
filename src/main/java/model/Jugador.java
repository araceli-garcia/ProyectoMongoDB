
package model;

import java.io.Serializable;
import java.util.Date;




public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String nombre;
    private int edad;
    private String sexo;
    private int nivel;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private Date fechaEliminacion;
 

    public Jugador() {
        super();
    }

    public Jugador(String nombre, int edad, String sexo, int nivel, Date fechaCreacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nivel = nivel;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
