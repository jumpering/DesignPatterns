package strategyLoginSample;

public class ClientSinSwitchConParametro {

    private LoginStrategy loginStrategy;

    public ClientSinSwitchConParametro(){
        //null on purpose
    }

    public void setLoginStrategy (LoginStrategy loginStrategy){
        this.loginStrategy = loginStrategy;
    }
    public String printStrategy(){
        return this.loginStrategy.loginForm();
    }

    public static void main(String[] args) {
        ClientSinSwitchConParametro client = new ClientSinSwitchConParametro();
        client.setLoginStrategy(new LoginFormMail());
        System.out.printf(client.printStrategy());
    }
}


