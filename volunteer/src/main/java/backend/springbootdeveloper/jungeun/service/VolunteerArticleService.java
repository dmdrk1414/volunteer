package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VolunteerArticleService {
    private final ArticleService articleService;
    public List<VolunteerArticle> findAll(){
        return articleService.getArticleOfVolunteer();
    }


    public VolunteerArticle findById(long id){
        List<VolunteerArticle> list = articleService.getArticleOfVolunteer();
        for(VolunteerArticle article : list){
            if(id == article.getId()){
                return article;
            }
        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
