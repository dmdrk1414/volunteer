package backend.springbootdeveloper.jungeun.dto.response;


import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
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

    public VolunteerArticleResponse(VolunteerArticle volunteerArticle){
        this.id = volunteerArticle.getId();
        //this.region = volunteerArticle.getRegion();
        this.title = volunteerArticle.getTitle();
        this.adOffice = volunteerArticle.getAdOffice();
        this.adPeriod = volunteerArticle.getAdPeriod();
        this.volunteerPeriod = volunteerArticle.getVolunteerPeriod();
        //this.remainPeriod = volunteerArticle.getRemainPeriod();
    }
}
