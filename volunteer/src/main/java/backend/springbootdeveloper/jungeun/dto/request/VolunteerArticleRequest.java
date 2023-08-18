package backend.springbootdeveloper.jungeun.dto.request;

import backend.springbootdeveloper.jungeun.domain.Application;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VolunteerArticleRequest {
    private Long id;
    private String name;
    private Long phoneNum;

    public Application toEntity(){
        return Application.builder()
                .name(name)
                .phoneNum(phoneNum)
                .build();
    }
}
