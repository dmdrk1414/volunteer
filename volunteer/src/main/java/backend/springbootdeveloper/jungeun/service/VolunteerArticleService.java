package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.domain.VolunteerList;
import backend.springbootdeveloper.jungeun.repository.ArticleRepository;
import backend.springbootdeveloper.jungeun.repository.VolunteerListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VolunteerArticleService {
    private final ArticleService articleService;
    public List<VolunteerList> findAll(){
        return articleService.getArticleOfVolunteer();
    }


    public VolunteerList findById(long id){
        List<VolunteerList> list = articleService.getArticleOfVolunteer();
        for(VolunteerList article : list){
            if(id == article.getId()){
                return article;
            }
        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
