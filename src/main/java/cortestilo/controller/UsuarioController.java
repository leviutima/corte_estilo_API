package cortestilo.controller;


import cortestilo.usuario.DadosCadastroUsuario;
import cortestilo.usuario.Usuario;
import cortestilo.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastro (@RequestBody DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }
}
