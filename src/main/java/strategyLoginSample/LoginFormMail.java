package strategyLoginSample;

public class LoginFormMail implements LoginStrategy {
    @Override
    public String loginForm() {
        return "formulario para mail";
    }
}
