package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.repository.JpaArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final JpaArticleRepository articleRepository;
    public ArticleService(){
        this.articleRepository = new JpaArticleRepository();
    }

//    public List<VolunteerArticle> getArticleOfVolunteer(){
//        return articleRepository.findAllOfVolunteerTable();
//    }
}
