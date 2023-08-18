package backend.springbootdeveloper.jungeun.repository;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationStatusRepository extends JpaRepository<ApplicationStatus, Long> {
}
