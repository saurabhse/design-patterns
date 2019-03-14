package patterns.behavioral.state;

public class Client {
    public static void main(String[] args) {
        SecurityContext securityContext =new SecurityContext();
        securityContext.nextState();
        securityContext.nextState();

    }
}
