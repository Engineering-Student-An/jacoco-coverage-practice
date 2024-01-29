package study.jacoco_sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class JoinRequest {

    private String loginId;
    private String password;
    private String name;

    public User toEntity(){
        return User.builder()
                .loginId(this.loginId)
                .password(this.password)
                .name(this.name)
                .build();
    }
}
