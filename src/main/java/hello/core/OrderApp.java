package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImple;

public class OrderApp {
    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        OrderServiceImple orderServiceImple = new OrderServiceImple();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderServiceImple.createOrder(1L, "itemA", 10000);

        System.out.println("itemA = " + order.toString());
        System.out.println("itemA = " + order.calculatePrice());
    }
}
