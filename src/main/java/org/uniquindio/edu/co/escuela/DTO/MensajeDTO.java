package org.uniquindio.edu.co.escuela.DTO;

public record MensajeDTO<T>(
        boolean error,
        T respuesta
) {
}
