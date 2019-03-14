package patterns.behavioral.state.usecase;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Integer> articleNumbers = new ArrayList<>();
    private OrderState state = OrderState.UPDATEABLE;
    public void add(Integer articleNumber) {
        articleNumbers.add(state.set(articleNumber));
    }

    public void order() {
        // some business logic
        state = OrderState.READONLY;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(1);
        System.out.println("=============");
        cart.order();
        cart.add(2);
    }
}

enum OrderState {
    UPDATEABLE(()->{}), READONLY(()-> {throw new IllegalArgumentException();});
    private Runnable action;
    private OrderState(Runnable action) {
       this.action=action;
    }
    public <T> T set(T value) {
        action.run();
        return value;
    }
}