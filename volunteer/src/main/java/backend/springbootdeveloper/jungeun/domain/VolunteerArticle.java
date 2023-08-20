package backend.springbootdeveloper.jungeun.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class VolunteerArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; // 게시물 고유 아이디

    @Column(name = "title", nullable = false)
    private String title; // 게시물 제목

    @Column(name = "volunteerPeriod", nullable = false)
    private String volunteerPeriod; // 봉사 기간

    @Column(name = "volunteerTime", nullable = false)
    private String volunteerTime; // 봉사 시간

    @Column(name = "adPeriod", nullable = false)
    private String adPeriod; // 모집 기간

    @Column(name = "volunteerPlace", nullable = false)
    private String volunteerPlace; // 봉사 장소

    @Column(name = "adPeople", nullable = false)
    private int adPeople; // 모집 인원

    @Column(name = "applicationPeople", nullable = false)
    private int applicationPeople; // 신청 인원

    @Column(name = "adOffice", nullable = false)
    private String adOffice; // 모집 기관

    @Column(name = "volunteerType", nullable = false)
    private String volunteerType; // 봉사자 유형

    @Column(name = "content", nullable = false)
    private String content; // 게시물 내용

    @Column(name = "recruitment", nullable = false)
    private String recruitment; // 모집 여부

    @Builder
    public VolunteerArticle(long id, String title, String volunteerPeriod, String volunteerTime, String adPeriod, String volunteerPlace,
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
