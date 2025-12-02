package com.agendamiento.api_reservas.repository;

import com.agendamiento.api_reservas.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface MerchantRepository extends JpaRepository<Merchant, UUID> {

    Optional<Merchant> findBySlug(String slug);


    Optional<Merchant> findByEmail(String email);
}