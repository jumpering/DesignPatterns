package builderInternalClass;

public class Client {
    public static void main(String[] args){
        Persona xavi = new Persona.PersonaBuilder(1, "xavi")
                .telf(619774117)
                .amigos("amigo3")
                .surname("Canals")
                .amigos("amigo1")
                .amigos("amigo2")
                .build();
        System.out.println(xavi);
        xavi.imprimirAmigos();
    }
}
