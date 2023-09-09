package backend.springbootdeveloper.daewon.service;

import lombok.RequiredArgsConstructor;
import backend.springbootdeveloper.daewon.domain.RefreshToken;
import backend.springbootdeveloper.daewon.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}

