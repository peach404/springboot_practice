## Spring Application
ApplicationEvent 등록시 주의사항
이벤트가 Applicationcontext 이전 발생인지 이후 발생인지 체크!

## WebEnvironment
1. spring mvc 가 들어있으면 기본적으로 서블릿이 동작한다
2. 서블릿 없고 spring webflux가 들어있으면 Rective로 돈다.
둘다 없으면 NONE으로 돌아간다
둘다 있으면 서블릿으로 돌기 때문에 변경하고 싶으면 설정  app.setWebApplicationType(WebApplicationType.REACTIVE);


