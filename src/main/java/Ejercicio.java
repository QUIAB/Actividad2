import java.util.StringTokenizer; //libreria para contar palabras

public class Ejercicio {
    public static int countWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        return st.countTokens();//retorna el numero de palabras
    }
}
