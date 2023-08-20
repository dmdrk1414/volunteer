package backend.springbootdeveloper.jungeun.controller;

import backend.springbootdeveloper.jungeun.repository.VolunteerListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private VolunteerListRepository volunteerListRepository;


}
