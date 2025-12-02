package com.agendamiento.api_reservas.repository;

import com.agendamiento.api_reservas.entity.MerchantService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface MerchantServiceRepository extends JpaRepository<MerchantService, UUID> {

    
    List<MerchantService> findByMerchantIdAndActiveTrue(UUID merchantId);
}
