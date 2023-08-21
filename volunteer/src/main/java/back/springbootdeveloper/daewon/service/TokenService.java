package back.springbootdeveloper.daewon.service;

import back.springbootdeveloper.daewon.config.jwt.TokenProvider;
import back.springbootdeveloper.daewon.domain.User;
import back.springbootdeveloper.daewon.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;

@RequiredArgsConstructor
@Service
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;
    private final UserRepository userRepository;

    public String createNewAccessToken(String refreshToken){
        if(!tokenProvider.validToken(refreshToken)){
            throw new IllegalArgumentException("Unexpected token");
        }

        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);

        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }

    // TODO : 매게변수 리프레쉬 토큰 필요함 미래에 만들기
    public String NewAccessToken(String email){
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }
}