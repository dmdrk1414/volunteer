package back.springbootdeveloper.daewon.service;

import back.springbootdeveloper.daewon.domain.User;
import back.springbootdeveloper.daewon.dto.AddUserRequest;
import back.springbootdeveloper.daewon.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public Long save(AddUserRequest dto) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        int idx = dto.getEmail().indexOf("@");
        String nickname = dto.getEmail().substring(0, idx);
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .nickname(nickname)
                .password(encoder.encode(dto.getPassword()))
                .build()).getId();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
    }

    public User findByEmail(String email) { // 이메일을 입력받아 users 테이블에서 유저를 찾고, 없으면 예외 발생
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
    }
}
