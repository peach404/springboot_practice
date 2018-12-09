## Spring Application
ApplicationEvent 등록시 주의사항
이벤트가 Applicationcontext 이전 발생인지 이후 발생인지 체크!

## WebEnvironment
1. spring mvc 가 들어있으면 기본적으로 서블릿이 동작한다
2. 서블릿 없고 spring webflux가 들어있으면 Rective로 돈다.
둘다 없으면 NONE으로 돌아간다
둘다 있으면 서블릿으로 돌기 때문에 변경하고 싶으면 설정  app.setWebApplicationType(WebApplicationType.REACTIVE);

## application.properties
외부 설정 파일

## @Profile
특정한 profile 에서만 특정한 bean을 등록하고 싶거나 application 동작을 특정 profile 일때 bean 설정을 다르게 하고 싶을때 사용

## 로거
Logback에서 찍는것인데 그 전단계에 (로깅 퍼사드)SLF4j 혹은 Commons Logging을 이용한다.
--dbug 옵션 쓰면 디버거 찍어준다.
--trace 모든 디버깅 찍어주고 싶을 때 사용
컬러 출력 : application.properties 에 spring.output.ansi.enabled=always
파일 출력 : loging.path=logs

##  비동기 VS 동기 개념잡기! 

### 동기(synchronous : 동시에 일어나는)

 - 동기는 말 그대로 동시에 일어난다는 뜻입니다. 요청과 그 결과가 동시에 일어난다는 약속인데요. 바로 요청을 하면 시간이 얼마가 걸리던지 요청한 자리에서 결과가 주어져야 합니다.
    -> 요청과 결과가 한 자리에서 동시에 일어남
    -> A노드와 B노드 사이의 작업 처리 단위(transaction)를 동시에 맞추겠다.
    
### 비동기(Asynchronous : 동시에 일어나지 않는)

 - 비동기는 동시에 일어나지 않는다를 의미합니다. 요청과 결과가 동시에 일어나지 않을거라는 약속입니다. 
    -> 요청한 그 자리에서 결과가 주어지지 않음
    -> 노드 사이의 작업 처리 단위를 동시에 맞추지 않아도 된다.
    
출처: http://private.tistory.com/24 [공부해서 남 주자]

WebTestClient ->비동기
 
 ### CORS
 
 Origin 이란 ? http / https + 도메인(localhost) + 포트
 Same origin Policy - 문서나 스크립트가 다른 출처의 리소스와 통신하는 것을 제한하는 중요한 보안 방식
 Cross-Origin Resource Sharing - 오늘날 많은 웹 페이지들은 CSS 스타일시트, 이미지, 그리고 스크립트와 같은 리소스들을 각각의 출처로부터 읽어오는데
 Same origin Policy 때문에 이것이 제한되지만 스프링에서 우회할 수 있게  @CrossOrigin()을 제공한다.
