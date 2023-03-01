package com.brian.eCommerce.domain;

import com.brian.eCommerce.generic.Entity;

import java.util.Objects;

public class Jugador extends Entity<JugadorId> {
    private final Alias alias;
    private Mazo mazo;

    public Jugador(JugadorId entityId, Alias alias) {
        super(entityId);
        this.alias = Objects.requireNonNull(alias);
    }

    public void asignarMazo(Mazo mazo){
        this.mazo = Objects.requireNonNull(mazo);
        if (mazo.value().cantidad() <= 0) {
            throw new IllegalArgumentException("El mazo debe contener cartas ");
        }
    }

    public void agregarCartaAMazo(Carta carta) {
        mazo = mazo.nuevaCarta(carta);
    }

    public void quitarCartaDeMazo(Carta carta) {
        mazo = mazo.retirarCarta(carta);
    }

    public Alias alias() {
        return alias;
    }

    public Mazo mazo() {
        return mazo;
    }
}
