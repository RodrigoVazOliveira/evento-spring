package br.dev.rvz.evento.services;

import br.dev.rvz.evento.models.Evento;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    List<Evento> eventos = new ArrayList<>();

    public void cadastrarEvento(Evento evento) {
        if (!existeEvento(evento)) {
            if (!evento.getDataDoEvento().isBefore(LocalDate.now())) {
                eventos.add(evento);
            }
        }
    }

    private boolean existeEvento(Evento evento) {
        for (Evento evento1: eventos) {
            if (evento1.getNomeEvento().equalsIgnoreCase(evento.getNomeEvento())) {
                return true;
            }
        }
        return false;
    }

    public List<Evento> listarEvento() {
        return eventos;
    }
}
