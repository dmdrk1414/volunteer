package backend.springbootdeveloper.jungeun.dto.response;

import backend.springbootdeveloper.jungeun.domain.VolunteerList;
import lombok.Getter;

@Getter
public class VolunteerArticleResponse {
    private long id;
    private String region;
    private String title;
    private String adOffice;
    private String adPeriod;
    private String volunteerPeriod;
    private String remainPeriod;

    public VolunteerArticleResponse(VolunteerList volunteerList){
        this.id = volunteerList.getId();
        this.region = volunteerList.getRegion();
        this.title = volunteerList.getTitle();
        this.adOffice = volunteerList.getAdOffice();
        this.adPeriod = volunteerList.getAdPeriod();
        this.volunteerPeriod = volunteerList.getVolunteerPeriod();
        this.remainPeriod = volunteerList.getRemainPeriod();
    }
}
