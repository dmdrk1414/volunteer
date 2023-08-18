package backend.springbootdeveloper.jungeun.repository;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerArticleRepository extends JpaRepository<VolunteerArticle, Long> {
}
