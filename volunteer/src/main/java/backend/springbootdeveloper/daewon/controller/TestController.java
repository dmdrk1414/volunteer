package backend.springbootdeveloper.daewon.controller;

//import backend.springbootdeveloper.daewon.domain.Suggestions;
import backend.springbootdeveloper.daewon.domain.User;
//import backend.springbootdeveloper.daewon.domain.UserUtill;
//import backend.springbootdeveloper.daewon.repository.UserUtilRepository;
//import backend.springbootdeveloper.daewon.repository.SuggestionRepository;
import backend.springbootdeveloper.daewon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    //@Autowired
    //private SuggestionRepository suggestionRepository;
    @Autowired
    private UserRepository userRepository;
    //@Autowired
    //private UserUtilRepository userUtilRepository;

  /*
    @GetMapping("/test")
    public String testController() {
        suggestionRepository.save(Suggestions.builder()
                .classification("test classification")
                .title("test Tle")
                .holidayPeriod("123 ~ 123")
                .build());
        return "Hello World";
    }*/
    @GetMapping("/user-test")
    public String userTestController() {
        userRepository.save(User.builder()
                .build());
        return "Hello World";
    }
//
//    @GetMapping("/userUtilTest")
//    public String userUtilTestController() {
  //      userUtilRepository.save(UserUtill
    //            .builder()
      //          .userId(Long.valueOf(2))
        //        .name("박승찬")
          //      .cntVacation(5)
            //    .isNuriKing(true)
              //  .build());
     //   return "Hello World";
   // }
}
