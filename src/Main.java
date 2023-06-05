import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[A-Za-z0-9]{1,}[@]{1}[a-z]{1,}.com$");
        Matcher m = p.matcher("gabr22iel@outlook.com");
        boolean teste = m.find();

        System.out.println(teste);

        // gabriel@gmail.com | TRUE
        // gabr22iel@outlook.com | TRUE
    }
}