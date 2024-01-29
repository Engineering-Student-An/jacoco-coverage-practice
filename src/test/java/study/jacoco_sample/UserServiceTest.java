package study.jacoco_sample;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {
    
    @Autowired UserService userService;
    @Autowired UserRepository userRepository;
    @Autowired
    EntityManager em;

    @Test
    public void 회원가입() throws Exception {
        //given
        JoinRequest joinRequest = new JoinRequest();
        joinRequest.setName("이름");
        joinRequest.setPassword("1234");
        joinRequest.setLoginId("loginId1");
        userService.join(joinRequest);

        //when
        User findUser = userRepository.findUserByLoginId("loginId1");

        //then
        assertEquals(joinRequest.getName(), findUser.getName());
        assertEquals(joinRequest.getLoginId(), findUser.getLoginId());
        assertEquals(joinRequest.getPassword(), findUser.getPassword());

    }

    @Test
    public void 회원검색() throws Exception {
        //given
        JoinRequest joinRequest = new JoinRequest();
        joinRequest.setName("이름");
        joinRequest.setPassword("1234");
        joinRequest.setLoginId("loginId3");
        userService.join(joinRequest);

        //when
        User findUser = userService.findByLoginId("loginId3");

        //then
        assertEquals(findUser.getName(), joinRequest.getName());
    }
}