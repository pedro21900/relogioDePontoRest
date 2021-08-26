package Labs.relogioDePontoRest.controller;

import Labs.relogioDePontoRest.model.JornadaDeTrabalho;
import Labs.relogioDePontoRest.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaDeTrabalho createrJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaService.saveJornada(jornadaDeTrabalho);
    }
    @PutMapping
    public JornadaDeTrabalho updateJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaService.updateJornada(jornadaDeTrabalho);
    }
    @GetMapping
    public List<JornadaDeTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @DeleteMapping("/{idJornada}")
    public void  deleteById(@PathVariable("idJornada") Long idJornada ) throws Exception{

        jornadaService.deleteJornada(idJornada);
        ResponseEntity.ok();

  }
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada ) throws Exception{
        return ResponseEntity.ok(jornadaService
                .getById(idJornada)
                .orElseThrow(()-> new NoSuchElementException("Jornada não encontrada")));
    }
}
