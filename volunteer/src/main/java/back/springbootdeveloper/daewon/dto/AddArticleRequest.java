package back.springbootdeveloper.daewon.dto;

import back.springbootdeveloper.daewon.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String email;
    private String password;

    public Article toEntity() {
        return Article.builder() // 객체생성 builder : 보기 편하라고
                .email(email)
                .build();
    }
}