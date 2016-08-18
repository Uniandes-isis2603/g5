/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.resources.resources;


import co.edu.uniandes.rest.resources.dtos.UsuarioDTO;
import co.edu.uniandes.rest.resources.mocks.UsuarioLogicMock;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author js.prieto10
 */

@Path("usuarios")
@Produces("application/json")
public class UsuarioResource {
    

    UsuarioLogicMock usuarioLogic = new UsuarioLogicMock();

    @GET
    public List<UsuarioDTO> getUsuarios() throws Exception {
        return usuarioLogic.getUsuarios();
    }
    
    @GET
    @Path("{id: \\d+}")
    public UsuarioDTO getUsuario(@PathParam("id") Long id) throws Exception{
        return usuarioLogic.getUsuario(id);
    }


   
    @POST
    public UsuarioDTO createUsuario(UsuarioDTO usuario) throws Exception {
        return usuarioLogic.createUsuario(usuario);
    }
    

    @PUT
    @Path("{id: \\d+}")
    public UsuarioDTO updateUsuario(@PathParam("id") Long id, UsuarioDTO newUsuario) throws Exception 
    {
        return usuarioLogic.updateUsuario(id, newUsuario);
    }
    

    @DELETE
    @Path("{id: \\d+}")
    public void deleteUsuario(@PathParam("id") Long id) throws Exception 
    {
        usuarioLogic.deleteUsuario(id);
    }
}
