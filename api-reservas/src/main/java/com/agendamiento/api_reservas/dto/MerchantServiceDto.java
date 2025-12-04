package com.agendamiento.api_reservas.dto;

import com.agendamiento.api_reservas.enums.PaymentType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class MerchantServiceDto {
    private UUID id;
    private String name;
    private String description;
    private Integer durationMinutes;
    private BigDecimal price;
    private PaymentType paymentType;
    private BigDecimal depositAmount;
}
