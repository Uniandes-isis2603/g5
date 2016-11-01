/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.g5.bibliotecas.dtos;

import co.edu.uniandes.g5.bibliotecas.entities.PrestamoEntity;
import java.util.Date;

/**
 *
 * @author ce.gonzalez13
 */
public class PrestamoDTO {
    
    public static final int VIDEO = 1;
    public static final int LIBRO = 2;
    public static final int SALA = 3;

    
    
    private Long id;
    private int tipoRecurso;
    private Double costo;
    private String medioPago;
    private Date fechaInicial;
    private Date fechaFinal;
    private boolean estaActivo;

    /**
     * Constructor por defecto
     */
    public PrestamoDTO() {
    }
    
    /**
     * Crea un objeto PrestamoDTO a partir de un objeto PrestamoEntity.
     *
     * @param entity Entidad PrestamoEntity desde la cual se va a crear el
     * nuevo objeto.
     * 
     */
    public PrestamoDTO(PrestamoEntity entity) {
        if (entity != null) {
            this.id = entity.getId();
            this.tipoRecurso = entity.getTipoRecurso();
            this.costo = entity.getCosto();
            this.medioPago = entity.getMedioPago();
            this.fechaInicial = entity.getFechaInicial();
            this.fechaFinal = entity.getFechaFinal();
            this.estaActivo = entity.isEstaActivo();
        }
    }

    /**
     * Convierte un objeto PrestamoDTO a PrestamoEntity.
     *
     * @return Nueva objeto PrestamoEntity.
     * 
     */
    public PrestamoEntity toEntity() {
        PrestamoEntity entity = new PrestamoEntity();
        entity.setId(this.id);
        entity.setTipoRecurso(this.tipoRecurso);
        entity.setCosto(this.costo);
        entity.setMedioPago(this.medioPago);
        entity.setFechaFinal(this.fechaFinal);
        entity.setFechaInicial(this.fechaInicial);
        entity.setEstaActivo(this.estaActivo);
        
        return entity;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

public void setTipoRecurso(int tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public int getTipoRecurso() {
        return tipoRecurso;
    }
    
    /**
     * @return the costo
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    /**
     * @return the medioPago
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * @param medioPago the medioPago to set
     */
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    /**
     * @return the fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * @param fechaInicial the fechaInicial to set
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the estaActivo
     */
    public boolean isEstaActivo() {
        return estaActivo;
    }

    /**
     * @param estaActivo the estaActivo to set
     */
    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
    
    /**
     * Convierte el objeto a una cadena
     * @return 
     */
    @Override
    public String toString() {
    	return "{ id : " + getId() + ", costo : \"" + getCosto() + ", medioPago : \"" + getMedioPago() + ", fechaInicial : \"" + getFechaInicial() + ", fechaFinal : \"" + getFechaFinal()  + ", estaActivo : \"" + isEstaActivo() + "\" }" ;  
    }
}
