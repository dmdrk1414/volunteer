package backend.springbootdeveloper.jungeun.service;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatus;
import backend.springbootdeveloper.jungeun.repository.ApplicationStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ApplicationStatusService {
    private final ApplicationStatusRepository applicationStatusRepository;

    public List<ApplicationStatus> findAll(){
        return applicationStatusRepository.findAll();
    }
}
