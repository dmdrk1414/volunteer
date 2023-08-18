package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.repository.VolunteerArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VolunteerArticleService {
    private final VolunteerArticleRepository volunteerArticleRepository;

    public List<VolunteerArticle> findAll(){
        return volunteerArticleRepository.findAll();
    }

}
