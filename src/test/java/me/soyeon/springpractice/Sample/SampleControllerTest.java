package me.soyeon.springpractice.Sample;


import me.soyeon.springpractice.sample.SampleController;
import me.soyeon.springpractice.sample.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


//내장 톰캣 구동 하는 RANDOM_PORT

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {


    //webflux 의존성 추가해야한다.

    @Autowired
    WebTestClient webTestClient;

    //Test 크기가 Service 단 까지 가면 너무 크기 때문에 원본이 아니라 mockSampleService로 빈을 교체해서 테스트하면 훨씬 가벼워진다.
    @MockBean
    SampleService mockSampleService;


    @Test
    public void hello() throws Exception{
        when(mockSampleService.getName()).thenReturn("soyeon");

        webTestClient.get().uri("/hello").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hellosoyeon");

    }
}
