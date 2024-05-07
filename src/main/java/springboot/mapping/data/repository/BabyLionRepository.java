package springboot.mapping.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.data.entity.BabyLion;

import java.util.Optional;

public interface BabyLionRepository extends JpaRepository<BabyLion, Long> {
    Optional<BabyLion> findByEmail(String email);
}