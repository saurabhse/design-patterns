package patterns.behavioral.state;

public interface SecurityState {
    void next(SecurityContext context);
    void prev(SecurityContext context);
    void printStatus();
}
