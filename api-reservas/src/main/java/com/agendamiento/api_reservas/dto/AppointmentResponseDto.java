package com.agendamiento.api_reservas.dto;

import com.agendamiento.api_reservas.enums.AppointmentStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class AppointmentResponseDto {
    private UUID appointmentId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private AppointmentStatus status;
    private BigDecimal totalAmount;
    private String wompiReference;
    private String wompiPublicKey;
    private String wompiCurrency;
    private String wompiIntegritySignature;
}
