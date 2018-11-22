
package model;

import java.io.Serializable;
import java.util.Date;


public class Batalla implements Serializable {
    private static final long serialVersionUID = 1L; 
    private Long id;  
    private int cantidad;  
    private Date fechaCreacion;   
    private Date fechaActualizacion; 
    private Date fechaEliminacion;   

    private Campeon campeon;

    public Batalla() {
        super();
    }

    public Batalla(int cantidad, Date fechaCreacion) {
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public Campeon getCampeon() {
        return campeon;
    }

    public void setCampeon(Campeon campeon) {
        this.campeon = campeon;
    }
}
