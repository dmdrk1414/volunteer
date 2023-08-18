package backend.springbootdeveloper.jungeun.domain;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class volunteerArticle {
    private long id; // 게시물 고유 아이디
    private String title; // 게시물 제목
    private String volunteerPeriod; // 봉사 기간
    private String volunteerTime; // 봉사 시간
    private String adPeriod; // 모집 기간
    private String volunteerPlace; // 봉사 장소
    private int adPeople; // 모집 인원
    private int applicationPeople; // 신청 인원
    private String adOffice; // 모집 기관
    private String volunteerType; // 봉사자 유형
    private String content; // 게시물 내용
    private String recruitment; // 모집 여부

    @Builder
    public volunteerArticle(long id, String title, String volunteerPeriod, String volunteerTime, String adPeriod, String volunteerPlace,
                            int adPeople, int applicationPeople, String adOffice, String volunteerType, String content, String recruitment){
        this.id = id;
        this.title = title;
        this.volunteerPeriod = volunteerPeriod;
        this.volunteerTime = volunteerTime;
        this.adPeriod = adPeriod;
        this.volunteerPlace = volunteerPlace;
        this.adPeople = adPeople;
        this.applicationPeople = applicationPeople;
        this.adOffice = adOffice;
        this.volunteerType = volunteerType;
        this.content = content;
        this.recruitment = recruitment;
    }
}
