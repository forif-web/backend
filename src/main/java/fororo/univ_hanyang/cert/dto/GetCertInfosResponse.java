package fororo.univ_hanyang.cert.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCertInfosResponse {
    private Integer userId;
    private String userName;
    private String department;
    private Integer activityYear;
    private Integer activitySemester;
    private String studyName;
}
