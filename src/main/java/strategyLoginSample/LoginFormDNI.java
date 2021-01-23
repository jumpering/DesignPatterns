package strategyLoginSample;

public class LoginFormDNI implements LoginStrategy {
    @Override
    public String loginForm() {
        return "Formulario para DNI";
    }
}
