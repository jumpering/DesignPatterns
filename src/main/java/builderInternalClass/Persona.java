package builderInternalClass;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private int id;
    private String name;
    private String surname;
    private int telf;
    private List<String> amigos;

    public Persona(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id: " + this.id
                + "\nNombre: " + this.name
                + "\nApellido: " + this.surname
                + "\nTelefono: " + this.telf;
    }
    public void imprimirAmigos(){
        System.out.println("Amigos:");
        this.amigos.forEach(System.out::println);
    }

    public static class PersonaBuilder {
        public Persona persona;

        public PersonaBuilder(int id, String name){
            this.persona = new Persona(id, name);
        }

        public PersonaBuilder surname(String surname){
            this.persona.surname = surname;
            return this;
        }

        public PersonaBuilder telf(int telf){
            this.persona.telf = telf;
            return this;
        }

        public PersonaBuilder amigos(String amigos){
            if (this.persona.amigos == null) {
                this.persona.amigos = new ArrayList<String>();
                this.persona.amigos.add(amigos);
            } else {
                this.persona.amigos.add(amigos);
            }
            return this;
        }

        public Persona build(){
            return this.persona;
        }

    }
}


