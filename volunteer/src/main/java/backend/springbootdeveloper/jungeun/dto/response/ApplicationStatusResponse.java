package backend.springbootdeveloper.jungeun.dto.response;

import backend.springbootdeveloper.jungeun.domain.ApplicationStatusList;
import lombok.Getter;

@Getter
public class ApplicationStatusResponse {
    private long id;
    private String title;

    public ApplicationStatusResponse(ApplicationStatusList applicationStatusList){
        this.id = applicationStatusList.getId();
        this.title = applicationStatusList.getTitle();
    }
}
