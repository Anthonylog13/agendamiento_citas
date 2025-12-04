package com.agendamiento.api_reservas.repository;

import com.agendamiento.api_reservas.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {

    List<Appointment> findByMerchantIdAndStartDateTimeBetween(
            UUID merchantId,
            LocalDateTime start,
            LocalDateTime end
    );

   // Optional<Appointment> findByWompiReference(String wompiReference);

    @Query("SELECT a FROM Appointment a " +
            "WHERE a.merchant.id = :merchantId " +
            "AND a.startDateTime >= :start " +
            "AND a.endDateTime <= :end " +
            "AND (a.status = 'CONFIRMED' OR (a.status = 'PENDING_PAYMENT' AND a.paymentExpiresAt > CURRENT_TIMESTAMP))")
    List<Appointment> findConflictingAppointments(
            @Param("merchantId") UUID merchantId,
            @Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end
    );
}