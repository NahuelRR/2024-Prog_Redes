package examen_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {
        try {
            File ficheroDatos = new File("datos.csv");
            Scanner lectorDatos = new Scanner(ficheroDatos);
            while (lectorDatos.hasNextLine()){
                String datos = lectorDatos.nextLine();
                System.out.println(datos);
            }
            lectorDatos.close();
        }catch(FileNotFoundException error){
            System.out.println("Error al abrir el fichero para lectura.");
            error.printStackTrace();
        }
    }
}
