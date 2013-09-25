/**
 * 
 */
package br.com.uol.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cad_rfirmino
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value="/getHome" ,method= RequestMethod.GET)
	public ModelAndView getHome(){
		
		
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("teste", "HEHE");
		return modelAndView;
	}
}
