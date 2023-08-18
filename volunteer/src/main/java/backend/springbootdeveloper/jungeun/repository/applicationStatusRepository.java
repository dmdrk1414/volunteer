package backend.springbootdeveloper.jungeun.repository;

import backend.springbootdeveloper.jungeun.domain.applicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface applicationStatusRepository extends JpaRepository<applicationStatus, Long> {
}
