/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.resources.dtos;

/**
 *
 * @author js.prieto10
 */
public class UsuarioDTO {
    
    private String nombre;
    
    private String apellido;
    
    private String login;
    
    private Long id;
    
    private String contrasenha;
    
    private String direccion;
    
    
    
    public UsuarioDTO()
    {
 
    }
    
    public UsuarioDTO(String pNombre, String pApellido, String pLogin, Long pId, String pContrasenha, String pDireccion)
    {
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.login = pLogin;
        this.id = pId;
        this.contrasenha = pContrasenha;
        this.direccion = pDireccion;       
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
