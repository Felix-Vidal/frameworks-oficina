package br.ufac.login.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.login.controller.dto.UsuarioDto;
import br.ufac.login.controller.dto.UsuarioRespostaDto;
import br.ufac.login.models.Usuario;
import br.ufac.login.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController implements IController<UsuarioDto, UsuarioRespostaDto>{

    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @Override
    @GetMapping("/")
    public ResponseEntity<List<UsuarioRespostaDto>> get() {
        List<Usuario> registros = service.get();
        List<UsuarioRespostaDto> respostaDto = registros.stream().map(UsuarioRespostaDto::transformaEmDto).toList();
        return ResponseEntity.ok(respostaDto);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioRespostaDto> get(@PathVariable("id") Long id) {
        Usuario registro = service.get(id);
        return ResponseEntity.ok(UsuarioRespostaDto.transformaEmDto(registro));
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<UsuarioRespostaDto> insert(@RequestBody UsuarioDto objeto) {
    
        Usuario registro = service.save(objeto.transformaParaObjeto());
        return ResponseEntity.status(201).body(UsuarioRespostaDto.transformaEmDto(registro));
    }

    @Override
    @PutMapping("/")
    public ResponseEntity<UsuarioRespostaDto> update(@RequestBody UsuarioDto objeto) {

        Usuario registro = service.save(objeto.transformaParaObjeto());
        return ResponseEntity.ok(UsuarioRespostaDto.transformaEmDto(registro));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioRespostaDto> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }


    
}
