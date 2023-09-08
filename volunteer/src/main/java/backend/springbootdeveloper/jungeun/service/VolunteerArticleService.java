package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.repository.VolunteerListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VolunteerArticleService {
    private final VolunteerListRepository volunteerListRepository;
    public List<VolunteerArticle> findAll(){
        return volunteerListRepository.findAll();
    }

    public VolunteerArticle findById(long id){
//        List<VolunteerArticle> list = articleService.getArticleOfVolunteer();
//        for(VolunteerArticle article : list){
//            if(id == article.getId()){
//                return article;
//            }
//        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
