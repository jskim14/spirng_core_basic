package hello.core.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice); // 주문할 때 세가지를 파라미터로 넘기면 주문정보를 반환하는 기능
}
