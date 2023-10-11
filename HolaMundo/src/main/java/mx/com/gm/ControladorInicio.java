package mx.com.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class ControladorInicio {
	
	@GetMapping
	public String inicio() {
		
		log.info("ejecutando el controlador Spring MVC");
		return "Hola mundo con String";
		
	}
	
	
}
