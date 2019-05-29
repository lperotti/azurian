package cl.azurian.consultalista.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.azurian.consultalista.dao.ConsultaListaDAO;
import cl.azurian.consultalista.dao.impl.ConsultaListaDAOImpl;
import cl.azurian.consultalista.response.Response;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public ResponseEntity<Response> home() {
		logger.info("::::::::::ConsultaLista Controller metodo Consulta:::::::::");
		Response res = new Response();
		
		ConsultaListaDAO dao = new ConsultaListaDAOImpl();
		
		try {
			res = dao.consulta();
		}finally {
			
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
}
