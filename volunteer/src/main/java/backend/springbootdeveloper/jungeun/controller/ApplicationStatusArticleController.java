package backend.springbootdeveloper.jungeun.controller;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatus;
import backend.springbootdeveloper.jungeun.dto.response.ApplicationStatusResponse;
import backend.springbootdeveloper.jungeun.dto.response.EachApplicationStatusResponse;
import backend.springbootdeveloper.jungeun.service.ApplicationStatusService;
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
public class ApplicationStatusArticleController {
    private final ApplicationStatusService applicationStatusService;

    @GetMapping("/article/application-status")
    public ResponseEntity<List<ApplicationStatusResponse>> findAllApplicationStatusList(){
        List<ApplicationStatusResponse> applicationStatusResponseList = applicationStatusService.findAll()
                .stream()
                .map(ApplicationStatusResponse::new)
                .toList();
        return ResponseEntity.ok().body(applicationStatusResponseList);
    }

    @GetMapping("/article/application-status/{id}")
    public ResponseEntity<EachApplicationStatusResponse> findAllApplicationStatusArticleById(@PathVariable long id){
        ApplicationStatus applicationStatus = applicationStatusService.findById(id);
        return ResponseEntity.ok()
                .body(new EachApplicationStatusResponse(applicationStatus));
    }
}
