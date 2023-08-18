package backend.springbootdeveloper.jungeun.repository;

import backend.springbootdeveloper.jungeun.domain.volunteerArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface volunteerArticleRepository extends JpaRepository<volunteerArticle, Long> {
}
