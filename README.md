### 스프링 핵심 기본
- 제어의 역전 IoC 
  - 프로그램의 제어를 직접하는 것이 아니라 외부에서 관리하는 것
- 의존관계 주입 DI
  - 정적인 클래스 의존관계
  - OrderServiceImpl -> MemberRepository / DiscountPolicy 
  - 동적인 객체 인스턴스 의존관계: 애플리케이션 실행시점에 생성된 인스턴스의 참조가 연결된 의존관계
  - 의존관계 주입을 사용하면 정적인 관계를 변화x(코드르 손대지 않고) 동적관계를 변경 시킬 수ㅇ
- ApplicationContext 스프링 컨테이너
  - AppConfig.java를 생성해서 객체를 생성했던 것을 컨테이너에를 통해서 사용함