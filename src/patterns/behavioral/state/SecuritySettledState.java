package patterns.behavioral.state;

public class SecuritySettledState implements SecurityState {
    @Override
    public void next(SecurityContext context) {
        System.out.println("Last state");
    }

    @Override
    public void prev(SecurityContext context) {
        context.setSecurityState(new SecurityOrderedState());
    }

    @Override
    public void printStatus() {

    }

}
