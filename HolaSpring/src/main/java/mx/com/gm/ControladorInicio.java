
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@RestController
public class ControladorInicio {
    
    
    @GetMapping("/")
    public String inicio (){
        log.info("ejecutando el controlador Rest");
        log.info("mas detalle del controlador ");
        
        return "Hola Mundo con Spring";
    }
    
    
}
