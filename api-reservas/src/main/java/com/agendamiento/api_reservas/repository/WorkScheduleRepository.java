package com.agendamiento.api_reservas.repository;

import com.agendamiento.api_reservas.entity.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, UUID> {
    List<WorkSchedule> findByMerchantId(UUID merchantId);
}
