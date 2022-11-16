package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImple;

public class AppConfig { //전체를 설정하고 구성하는 공연기획자같은 클래스

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository()); //생성자 주입
    }

    public OrderService orderService() {
        return new OrderServiceImple(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
