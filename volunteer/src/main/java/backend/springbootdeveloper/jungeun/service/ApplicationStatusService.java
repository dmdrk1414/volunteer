package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatus;
import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.repository.ApplicationStatusListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ApplicationStatusService {
    private final ApplicationStatusListRepository applicationStatusListRepository;

    public List<ApplicationStatus> findAll(){
        return applicationStatusListRepository.findAll();
    }

    public ApplicationStatus findById(long id){
//        List<VolunteerArticle> list = articleService.getArticleOfVolunteer();
//        for(VolunteerArticle article : list){
//            if(id == article.getId()){
//                return article;
//            }
//        }
        throw new IllegalArgumentException("각각의 게시물 예외 처리");
    }
}
