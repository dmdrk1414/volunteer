package backend.springbootdeveloper.jungeun.dto.response;

import backend.springbootdeveloper.jungeun.domain.VolunteerArticle;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EachVolunteerArticleResponse {
    private long id;
    private String title;
    private String volunteerPeriod;
    private String volunteerTime;
    private String adPeriod;
    private String volunteerPlace;
    private int adPeople;
    private int applicationPeople;
    private String adOffice;
    private String volunteerType;
    private String content;
    private String recruitment;

    @Builder
    public EachVolunteerArticleResponse(VolunteerArticle volunteerArticle){
        this.id = volunteerArticle.getId();
        this.title = volunteerArticle.getTitle();
        this.volunteerPeriod = volunteerArticle.getVolunteerPeriod();
        this.volunteerTime = volunteerArticle.getVolunteerTime();
        this.adPeriod = volunteerArticle.getAdPeriod();
        this.volunteerPlace = volunteerArticle.getVolunteerPlace();
        this.adPeople = volunteerArticle.getAdPeople();
        this.applicationPeople = volunteerArticle.getApplicationPeople();
        this.adOffice = volunteerArticle.getAdOffice();
        this.volunteerType = volunteerArticle.getVolunteerType();
        this.content = volunteerArticle.getContent();
        this.recruitment = volunteerArticle.getRecruitment();
    }
}
