/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenDesarrolloweb.Examen.entity;
import ExamenDesarrolloweb.Examen.entity.Lugares;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author carlo
 */
@Entity
@Table(name="personas")
public class Persona implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id;
        
        private String artista;
        private String costo;
        private String fecha;
        private String capacidad;
        
        
        @ManyToOne
        @JoinColumn (name="lugares_id")
        private Lugares lugar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

  

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Lugares getLugar() {
        return lugar;
    }

    public void setLugar(Lugares lugar) {
        this.lugar = lugar;
    }
        
}