
package INFOTECHNOLOGY.INFOTECH.Controller;

import INFOTECHNOLOGY.INFOTECH.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.java2d.loops.ProcessPath;

@RestController
public class HolaController {
    
   /*get con path*/
    @GetMapping ("/hola")
    public String decirHola1() {
        return "Hola Mundo primer getmapping";
    }
    
    
    /* get sin path*/
    
    @GetMapping 
    public String decirHola2() {
        return "Hola Mundo primer getmapping";
    }
    
    /*get con varios param*/
    @GetMapping ("{nombre}/{edad}/{profesion}")
    public String decirHola3( @PathVariable String nombre,@PathVariable int edad, 
            @PathVariable String profesion) {
        return "Hola : " + nombre + " "+ "Tu edad es: "+ edad+" "+"Profesion: "+profesion;
    
}
    /*get con requestparam*/
    @GetMapping("/hola4")
    public String saludo(@RequestParam String nombre,
                          @RequestParam int edad ,
                          @RequestParam String profesion){
         return "Hola : " + nombre + " "+ "Tu edad es: "+ edad+" "+"Profesion: "+profesion;
    }
    
    
   /*POSTMAPPING*/
    
   @PostMapping("/cliente")
   public void nuevocliente(@RequestBody Cliente cli){
       System.out.println("Nombre :" + cli.getNombre()+
                          "apellido: " + cli.getApellido());   
                         
       
   }
    
    
}
