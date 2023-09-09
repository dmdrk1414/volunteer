package backend.springbootdeveloper.jungeun.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class VolunteerList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

//    @Column(name = "region", nullable = false)
//    private String region;

    @Column(name = "adOffice", nullable = false)
    private String adOffice;

    @Column(name = "adPeriod", nullable = false)
    private String adPeriod;

    @Column(name = "volunteerPeriod", nullable = false)
    private String volunteerPeriod;

//    @Column(name = "remainPeriod", nullable = false)
//    private String remainPeriod;

    @Builder
    public VolunteerList(long id, String title, String adOffice, String adPeriod, String volunteerPeriod){
        this.id = id;
        this.title = title;
        this.adOffice = adOffice;
        this.adPeriod = adPeriod;
        this.volunteerPeriod = volunteerPeriod;
    }
}
