package patterns.behavioral.state;

public class SecurityOrderedState implements SecurityState {
    @Override
    public void next(SecurityContext context) {
        context.setSecurityState(new SecuritySettledState());
    }

    @Override
    public void prev(SecurityContext context) {
        System.out.println("At first state");
    }

    @Override
    public void printStatus() {

    }


}
