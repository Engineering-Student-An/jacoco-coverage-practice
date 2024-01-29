package study.jacoco_sample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public void join(JoinRequest joinRequest){
        userRepository.save(joinRequest.toEntity());
    }

    public User findByLoginId(String loginId){
        return userRepository.findUserByLoginId(loginId);
    }
}
