package com.agendamiento.api_reservas.mapper;

import com.agendamiento.api_reservas.dto.AppointmentResponseDto;
import com.agendamiento.api_reservas.dto.MerchantServiceDto;
import com.agendamiento.api_reservas.entity.Appointment;
import com.agendamiento.api_reservas.entity.MerchantService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AppMapper {

    MerchantServiceDto toServiceDto(MerchantService service);
    @Mapping(source = "id", target = "appointmentId")
    @Mapping(source = "merchant.wompiPublicKey", target = "wompiPublicKey")
    @Mapping(target = "wompiCurrency", constant = "COP")
    @Mapping(target = "wompiIntegritySignature", ignore = true)
    AppointmentResponseDto toAppointmentResponseDto(Appointment appointment);
}