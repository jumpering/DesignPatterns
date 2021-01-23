package ejercicioPatronesEmergencias;

import java.util.ArrayList;
import java.util.List;

public class BaseAdministrativa extends Base{

    List<Base> listBases;

    public BaseAdministrativa(String nombre) {
        super(nombre);
        this.listBases = new ArrayList<>();

    }

    public void addBaseServicio(Base base){
        this.listBases.add(base);
    }

    public void printNombreBasesServicio(){
        listBases.forEach(b -> System.out.println(b.getNombre()));
    }

    @Override
    public int contarAmbulancias() {
        return listBases.stream().mapToInt(Base::contarAmbulancias).sum();
    }

    @Override
    protected void accept(Escenario escenario) {
        escenario.visit(this);
    }
}
