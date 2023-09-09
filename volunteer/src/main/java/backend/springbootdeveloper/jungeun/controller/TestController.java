package backend.springbootdeveloper.jungeun.controller;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import backend.springbootdeveloper.jungeun.repository.JpaArticleRepository;
import backend.springbootdeveloper.jungeun.repository.VolunteerListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private VolunteerListRepository volunteerListRepository;
    private JpaArticleRepository jpaArticleRepository;
    @GetMapping("/test")
    public String testController(){
        volunteerListRepository.save(VolunteerArticle.builder()
                .title("봉사모집")
                .volunteerPeriod("내일까지")
                .volunteerTime("4시간")
                .adPeriod("내일까지")
                .volunteerPlace("우리집")
                .adPeople("22")
                .applicationPeople("10")
                .adOffice("우리집")
                .volunteerType("착한 사람")
                .content("봉사할 사람 구함")
                .recruitment("모집 중")
                .build());
        return "Hello world";
    }

    @GetMapping("/test/jpa")
    public String testController2(){
        volunteerListRepository.save(VolunteerArticle.builder()
                .title("봉사모집")
                .volunteerPeriod("내일까지")
                .volunteerTime("4시간")
                .adPeriod("내일까지")
                .volunteerPlace("우리집")
                .adPeople("2")
                .applicationPeople("10")
                .adOffice("우리집")
                .volunteerType("착한 사람")
                .content("봉사할 사람 구함")
                .recruitment("모집 중")
                .build());
        return "Hello world";
    }
}
