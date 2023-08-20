package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatus;
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
}
