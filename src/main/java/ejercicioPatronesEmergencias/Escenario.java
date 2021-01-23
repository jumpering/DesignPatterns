//El Servicio de Emergencias Sanitarias de Castilla y León, antes conocido como 061, está organizado en
//        una jerarquía de bases. Algunas de estas bases realmente disponen de personal y ambulancias (por ejemplo
//        la de Medina del Campo), mientras que otras son «unidades administrativas» que agrupan un conjunto de
//        bases (por ejemplo Valladolid, que agrupa la unidad del Hospital Clínico Universitario y la de Medina del
//        Campo entre otras).
//        Para cada base, interesa modelar los siguientes datos:
//        Nombre de la base.
//        Número de ambulancias, que en el caso de las bases compuestas es la suma de las ambulancias
//        disponibles en las bases que las componen en ese momento.
//        Tiempo medio de asistencia, que en el caso de las bases compuestas es la media de los tiempos medios
//        de asistencia registrados en las bases que las componen en ese momento.
//        Elaborar un diseño que permita modelar adecuadamente esta situación

// https://www.infor.uva.es/~felix/datos/priii/ejercicios_patrones.pdf

package ejercicioPatronesEmergencias;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Escenario {

    private Set<Base> baseSet;
    private Base base;
    private GestorBases gestorBases;

    public void run(){
        this.gestorBases = new GestorBases();
        baseSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        String nombre;
        int limitOptions = 0;
        limitOptions = TiposBases.values().length;
        if ( limitOptions > 9 ){
            limitOptions = 9;
        }
        Matcher matcher;
        Pattern patternNumerico = Pattern.compile("[0-" + limitOptions + "]");
        do{
            do{
                System.out.println("Seleccionar tipo de Base a crear (0 para salir):");
                for (TiposBases tipo: TiposBases.values()) {
                    System.out.println("-" + (tipo.ordinal()+1) + ". " + tipo);
                }
                System.out.print("Opción: ");
                input = scanner.next();
                matcher = patternNumerico.matcher(input);
                if (input.equals("0")){
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }while( !matcher.find() );
            System.out.println("Su opción es: " + input);
            System.out.print("Ahora inserte el nombre de la base: ");
            nombre = scanner.next();
            this.base = gestorBases.crearBase(TiposBases.valueOf(Integer.valueOf(input)-1),nombre);
            baseSet.add(base);
            base.accept(this);
        }while(true);
    }

    public void visit(BaseAdministrativa baseAdministrativa){
        System.out.println("ADMINISTRATIVA: Agregar base a base administrativa: ");
        BaseServicio tmp = new BaseServicio("alguna");
        tmp.addAmbulancias(80);
        baseAdministrativa.addBaseServicio(tmp);
        System.out.println("Todos los elementos: ");
        baseSet.forEach(e -> System.out.println(e.getNombre()));
        baseSet.forEach(e -> System.out.println(e.contarAmbulancias()));
    }

    public void visit(BaseServicio baseServicio){
        System.out.println("SERVICIO: agregar ambulancias a base: ");
        baseServicio.addAmbulancias(25);
        System.out.println("Imprimo todos los elementos: ");
        baseSet.forEach(e -> System.out.println(e.getNombre()));
        baseSet.forEach(e -> System.out.println(e.contarAmbulancias()));
    }

    public static void main(String[] args) {
        new Escenario().run();
    }
}
