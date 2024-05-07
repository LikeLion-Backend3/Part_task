package springboot.mapping.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.data.entity.BabyLionDetail;

public interface BabyLionDetailRepository extends JpaRepository<BabyLionDetail, Long> {
}
