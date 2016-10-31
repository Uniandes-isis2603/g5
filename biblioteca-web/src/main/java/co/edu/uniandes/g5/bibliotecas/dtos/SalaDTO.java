/*
 * SalaDTO
 * Objeto de transferencia de datos de Salas.
 * Los DTO especifican los mensajes que se envían entre el cliente y el servidor.
 */
package co.edu.uniandes.g5.bibliotecas.dtos;

import co.edu.uniandes.g5.bibliotecas.entities.SalaEntity;

/**
 * Objeto de transferencia de datos de Salas.
 * @author sf.munera10
 */
public class SalaDTO extends RecursoDTO {
    
    private boolean estaOcupada;
    
    private Integer capacidad;
    
    /**
     * Constructor por defecto
     */
    public SalaDTO() {
    }
    
    /**
     * Constructor con parámetros.
     *
     * @param id identificador de la ciudad
     * @param name nombre de la ciudad
     */
    public SalaDTO(SalaEntity entity) {
        if (entity != null) {
            this.id = entity.getId();
            this.name = entity.getName();
            this.estaOcupada = entity.isEstaOcupada();
            this.capacidad = entity.getCapacidad();
        }
    }
    
    /**
     * Convierte un objeto SalaDTO a SalaEntity.
     *
     * @return Nueva objeto SalaEntity.
     * 
     */
    public SalaEntity toEntity() {
        SalaEntity entity = new SalaEntity();
        entity.setId(this.id);
        entity.setName(this.name);
        entity.setEstaOcupada(this.estaOcupada);
        entity.setCapacidad(this.capacidad);
        return entity;
    }
    
    /**
     * @return the capacidad
     */
    public Integer getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the estaOcupada
     */
    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    /**
     * @param estaOcupada the estaOcupada to set
     */
    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }
}
