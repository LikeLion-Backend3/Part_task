package springboot.mapping.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.data.entity.Part;

public interface PartRepository extends JpaRepository<Part,Long> {
}
