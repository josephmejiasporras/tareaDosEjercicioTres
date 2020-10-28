/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.time.temporal.ChronoUnit;

public class Cliente {
    
    private String nombre;
    private String ID;
    private String genero;
    private LocalDate fechaNacimiento;
    private int edad;
    

    /**
     * @return the nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    public Cliente(String nombre, String ID, String genero, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.ID = ID;
        this.genero = genero;
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
        this.edad = calcularEdad(fechaNacimiento);
    }

    public Cliente() {
    }
    
    private int calcularEdad(LocalDate fecha){
        LocalDate today = LocalDate.now();
        Period age = Period.between(fecha, today); 
        return age.getYears();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.ID);
        hash = 71 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", ID=" + ID + ", genero=" + genero + ", edad=" + edad + '}';
    }
    
    
    
}
