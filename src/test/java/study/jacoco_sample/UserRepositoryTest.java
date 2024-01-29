package study.jacoco_sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void findUserByLoginId() throws Exception {
        //given
        User user = new User();
        user.setLoginId("loginId1");
        user.setName("nameA");
        user.setPassword("1234");
        userRepository.save(user);

        //when
        User findUser = userRepository.findUserByLoginId("loginId2");

        //then
        Assertions.assertNotEquals(user,findUser);
    }
}