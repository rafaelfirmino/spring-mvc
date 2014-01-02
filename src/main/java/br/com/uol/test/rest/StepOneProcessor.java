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
public class StepOneProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		 Message inMessage = exchange.getIn();                        
	     org.apache.cxf.message.Message cxfMessage = inMessage.getHeader(CxfConstants.CAMEL_CXF_MESSAGE, org.apache.cxf.message.Message.class);
	     ServletRequest request = (ServletRequest) cxfMessage.get("HTTP.REQUEST");
	     String name = request.getParameter("name");
	     System.out.println("Step 1: " + name);
	}

}
