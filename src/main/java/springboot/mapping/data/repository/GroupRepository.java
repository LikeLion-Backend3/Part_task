package springboot.mapping.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.data.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}