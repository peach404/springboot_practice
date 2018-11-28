package me.soyeon.springpractice;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


//application.properties에 key값이 같은 외부설정들을 따로 모아서 하나의 빈으로 등록하는 방

@Component
@ConfigurationProperties("soyeon")
@Validated //properties 값 검증
//@EnableConfigurationProperties(Soyeonproperties.class) //빈 등록 에노테이션 처리 단 자동으로 등록해줘서 생략 가능
public class Soyeonproperties {

    private String name;
    private int age;
    private String part;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
