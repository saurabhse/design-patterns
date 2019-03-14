package patterns.behavioral.state;

public class SecurityContext {

    private SecurityState securityState = new SecurityOrderedState();

    public SecurityState getSecurityState() {
        return securityState;
    }

    public void setSecurityState(SecurityState securityState) {
        this.securityState = securityState;
    }

    public void previousState(){
        securityState.prev(this);
    }

    public void nextState(){
        securityState.next(this);
    }
}
