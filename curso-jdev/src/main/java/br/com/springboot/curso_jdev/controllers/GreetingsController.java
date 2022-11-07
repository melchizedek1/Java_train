package br.com.springboot.curso_jdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.curso_jdev.model.Usuario;
import br.com.springboot.curso_jdev.repository.UsuarioRepository;


/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
   
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/helloworld/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
    	   	
        return "Hello " + name + "!";
    }
    
    @RequestMapping(value = "/olamundo/{nome}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String retornaOlaMundo (@PathVariable String nome) {
    
    	Usuario usuario = new Usuario();
    	usuario.setNome(nome);
    	usuarioRepository.save(usuario);
    	
    	return "Gravado " + nome;
    }
}
