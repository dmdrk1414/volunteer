package backend.springbootdeveloper.jungeun.controller;

import backend.springbootdeveloper.jungeun.dto.response.VolunteerArticleResponse;
import backend.springbootdeveloper.jungeun.service.VolunteerArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VolunteerArticleController {
    private final VolunteerArticleService volunteerArticleService;

    @GetMapping("/article/volunteer")
    public ResponseEntity<List<VolunteerArticleResponse>> findAllVolunteerArticle(){
        List<VolunteerArticleResponse> volunteerArticle = volunteerArticleService.findAll()
                .stream()
                .map(VolunteerArticleResponse::new)
                .toList();

        return ResponseEntity.ok().body(volunteerArticle);
    }

}
