package br.com.campusbase.endpoint;

import br.com.campusbase.model.Curso;
import com.svlada.security.auth.JwtAuthenticationToken;
import com.svlada.security.model.UserContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaRest {
    
    @RequestMapping(value="/api/turma", method=RequestMethod.GET, produces={ MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody List<Curso> minhasTurmas(HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException {
        Curso curso = new Curso();
        curso.setTitulo("Programação de Computadores I");
        
        List<Curso> ret = new ArrayList<Curso>();
        ret.add(curso);
        
        return ret;
    }
    
    @RequestMapping(value = "/api/me", method = RequestMethod.GET)
    public @ResponseBody
    UserContext get(JwtAuthenticationToken token) {
        return (UserContext) token.getPrincipal();
    }
    
}