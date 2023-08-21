package back.springbootdeveloper.daewon.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLoginResponseDto {

    private String accessToken;
    private String name;

    public static UserLoginResponseDto from(String accessToken, String name) {
        return UserLoginResponseDto.builder()
                .accessToken(accessToken)
                .name(name)
                .build();
    }

}