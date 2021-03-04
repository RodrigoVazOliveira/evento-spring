package br.dev.rvz.evento.services;

import br.dev.rvz.evento.models.Evento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    List<Evento> eventos = new ArrayList<>();

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEvento() {
        return eventos;
    }
}
