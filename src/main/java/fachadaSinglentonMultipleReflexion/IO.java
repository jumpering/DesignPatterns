package fachadaSinglentonMultipleReflexion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class IO {
    private static IO INSTANCE;

    public static IO getInstance(){
        if (INSTANCE == null){
            String type = readFileConfig();
            try {
                INSTANCE = (IO) Class.forName("fachadaSinglentonMultipleReflexion." + type)
                        .getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return INSTANCE;
    }

    public abstract int readInt(String title);

    public abstract String readText(String title);

    private static String readFileConfig(){
        String option = null;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("configSingleton"));
            option =  bf.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println("Error, file not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error, IO exception: " + ex.getMessage());        
        }
    return option;    
    }
}