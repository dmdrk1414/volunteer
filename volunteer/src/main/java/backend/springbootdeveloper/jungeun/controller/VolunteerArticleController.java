package backend.springbootdeveloper.jungeun.controller;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.dto.response.EachVolunteerArticleResponse;
import backend.springbootdeveloper.jungeun.dto.response.VolunteerArticleResponse;
import backend.springbootdeveloper.jungeun.service.VolunteerArticleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VolunteerArticleController {
    private final VolunteerArticleService volunteerArticleService;

    @GetMapping("/article/volunteer")
    public ResponseEntity<List<VolunteerArticleResponse>> findAllVolunteerList(){
        List<VolunteerArticleResponse> volunteerList = volunteerArticleService.findAll()
                .stream()
                .map(VolunteerArticleResponse::new)
                .toList();
        return ResponseEntity.ok().body(volunteerList);
    }

    @GetMapping("/article/volunteer/{id}")
    public ResponseEntity<EachVolunteerArticleResponse> findAllVolunteerArticleById(@PathVariable long id){
        VolunteerArticle volunteerArticle = volunteerArticleService.findById(id);

        return ResponseEntity.ok()
                .body(new EachVolunteerArticleResponse(volunteerArticle));
    }
}
