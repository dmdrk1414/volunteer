package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.domain.VolunteerList;
import backend.springbootdeveloper.jungeun.repository.VolunteerArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VolunteerArticleService {
    private final VolunteerArticleRepository volunteerArticleRepository;

    public List<VolunteerList> findAll(){
        return volunteerArticleRepository.findAll();
    }
    // 이게 게시물인지 게시판인지 생각, repository에 선언한거 때문에 오류난듯

    public VolunteerArticle findById(long id){
        List<VolunteerArticle> list =
    }
}
