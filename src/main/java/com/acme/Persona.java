package com.acme;

public record Persona(String nombre, String apellidos) {

    @Override
    public String toString() {
        return "%s %s".formatted(nombre, apellidos);
    }
}
