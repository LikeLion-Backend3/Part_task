package springboot.mapping.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.data.entity.Hobby;

public interface HobbyRepository extends JpaRepository<Hobby, Long> {
}