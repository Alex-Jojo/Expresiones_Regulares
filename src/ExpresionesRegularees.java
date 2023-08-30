import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegularees {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("No hay argumentos");
            return;
        }
        for(String arg: args){
            String regexHola = "hola\\s+mundo";
            String regexLenguajes = "(java|python|go|pascal|perl)";
            Pattern patHola = Pattern.compile(regexHola, Pattern.CASE_INSENSITIVE);
            Pattern patLeng = Pattern.compile(regexLenguajes, Pattern.CASE_INSENSITIVE);
            Matcher matHola = patHola.matcher(arg);
            Matcher matLeng = patLeng.matcher(arg);
            System.out.println("Hola mundo:");
            while(matHola.find()){
                System.out.println("Encontrado: " + matHola.group());
            }
            System.out.println("Lenguajes");
            while(matLeng.find()){
                System.out.println("Encontrado: " + matLeng.group());
            }
        }

    }
}
