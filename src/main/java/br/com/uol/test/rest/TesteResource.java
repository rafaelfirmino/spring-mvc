/**
 * 
 */
package br.com.uol.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author cad_rfirmino
 *
 */
@Path("/testeResource")
public class TesteResource {

    @GET
    @Path("/teste")
    public String hello(@QueryParam("nome") String name) {
    	return "Teste";
    }
}
