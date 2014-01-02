/**
 * 
 */
package br.com.uol.test.rest;

import javax.servlet.ServletRequest;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;

/**
 * @author cad_rfirmino
 *
 */
public class StepTwoProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		 Message inMessage = exchange.getIn();                        
	     org.apache.cxf.message.Message cxfMessage = inMessage.getHeader(CxfConstants.CAMEL_CXF_MESSAGE, org.apache.cxf.message.Message.class);
	     ServletRequest request = (ServletRequest) cxfMessage.get("HTTP.REQUEST");
	     String name = request.getParameter("name");
	     System.out.println("Step 2: " + name);
	}

//	  Message inMessage = exchange.getIn();                        
//    String operationName = inMessage.getHeader(CxfConstants.OPERATION_NAME, String.class);
//    MessageContentsList list = exchange.getIn().getBody(org.apache.cxf.message.MessageContentsList.class);
//    org.apache.cxf.message.Message cxfMessage = inMessage.getHeader(CxfConstants.CAMEL_CXF_MESSAGE, org.apache.cxf.message.Message.class);
//    ServletRequest request = (ServletRequest) cxfMessage.get("HTTP.REQUEST");
//    String path = inMessage.getHeader(Exchange.HTTP_PATH, String.class);
//    if ("hello".equals(operationName)) {
//    	String nome = request.getParameter("nome");
//    	if (nome == null) {
//            Response r = Response.status(404).entity("Nome nao pode ser nulo " + path).build();
//            throw new WebApplicationException(r);
//    	} else {
//        	exchange.getOut().setBody("Hello " + nome);
//    	}
//    }


}
