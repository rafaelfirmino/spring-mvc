/**
 * 
 */
package br.com.uol.test.rest;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author cad_rfirmino
 *
 */
public class TesteRouterBuilder extends RouteBuilder{
	
	private StepOneProcessor stepOne = new StepOneProcessor();
	private StepTwoProcessor stepTwo = new StepTwoProcessor();

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:server")
		.process(stepOne)
		.process(stepTwo)
		.end();
	}

}
