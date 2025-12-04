package com.agendamiento.api_reservas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class AppointmentRequestDto {

    @NotNull(message = "El ID del comercio es obligatorio")
    private UUID merchantId;

    @NotNull(message = "El ID del servicio es obligatorio")
    private UUID serviceId;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @Future(message = "La cita debe ser en el futuro")
    private LocalDateTime startDateTime;

    @NotNull(message = "El nombre es obligatorio")
    private String customerName;

    @NotNull(message = "El email es obligatorio")
    @Email(message = "Debe ser un email válido")
    private String customerEmail;

    private String customerPhone;
}