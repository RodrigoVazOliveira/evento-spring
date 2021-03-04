package br.dev.rvz.evento.controllers;

import br.dev.rvz.evento.models.Evento;
import br.dev.rvz.evento.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento/")
public class EventoController {
    @Autowired
    private EventoService service;

    @PostMapping
    public void cadastrar(@RequestBody Evento evento) {
        service.cadastrarEvento(evento);
    }

    @GetMapping
    public List<Evento> mostarEvento() {
        return service.listarEvento();
    }

}
