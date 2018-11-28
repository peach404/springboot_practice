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

 