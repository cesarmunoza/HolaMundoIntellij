package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        //César, comenté la linea de codigo que considero que se puede eliminar
        //System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
