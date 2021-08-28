package Labs.relogioDePontoRest.service;

import Labs.relogioDePontoRest.model.JornadaDeTrabalho;
import Labs.relogioDePontoRest.model.MenssagemDTO;
import Labs.relogioDePontoRest.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public MenssagemDTO saveJornada(JornadaDeTrabalho jornadaDeTrabalho) {
       JornadaDeTrabalho jornadaDeTrabalhoSaved=jornadaRepository.save(jornadaDeTrabalho);

        return MenssagemDTO.builder()
                .mensage("Create jornada de trabalho id "+ jornadaDeTrabalhoSaved.getId())
                .build();
    }
    public JornadaDeTrabalho updateJornada(JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaRepository.save(jornadaDeTrabalho);
    }
    public void deleteJornada(Long id) {
         jornadaRepository.deleteById(id);
    }

    public List<JornadaDeTrabalho> findAll() {

        return jornadaRepository.findAll();
    }

    public Optional<JornadaDeTrabalho> getById(Long id) {
        return jornadaRepository.findById(id);
    }
}
