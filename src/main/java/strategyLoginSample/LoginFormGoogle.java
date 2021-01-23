package strategyLoginSample;

public class LoginFormGoogle implements LoginStrategy {
    @Override
    public String loginForm() {
        return "Formulario para Google Acount ";
    }
}
