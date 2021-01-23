package fachadaSinglentonMultipleReflexion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnotherLibraryIO extends IO{

    private final Scanner scanner = new Scanner(System.in);
    private String title;

//    private AnotherLibraryIO(){}

    public int readInt(String title){
        this.title = "OTRA LIBRERIA IO " + title;
        boolean ok = false;
        int result = 0;
        do {
            try{
                System.out.print( this.title );
                result = scanner.nextInt();
                scanner.nextLine(); //para acabar de leer hasta el salto de linea
                ok = true;
            }catch(InputMismatchException ex){
                System.out.println("error, integer only");
                scanner.next();
            }
        } while (!ok);
        return result;
    }

    public String readText(String title){
        this.title = "OTRA LIBRERIA IO " + title;
        boolean ok = false;
        String result = null;
        do{
            try{
                System.out.print( this.title );
                result = scanner.nextLine();
                ok = true;
            }catch(InputMismatchException ex){
                System.out.println("error");
                scanner.next();
            }
        }while(!ok);
        return result;
    }
}
