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
public class HomeController {
	
//	@Autowired
//	private HomeRepository homeRepository;

	@RequestMapping(value="/getHome" ,method= RequestMethod.GET)
	public ModelAndView getHome(){
		
		String name = "Oi";//homeRepository.getMerchantName();
		
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("teste", name);
		return modelAndView;
	}
}
