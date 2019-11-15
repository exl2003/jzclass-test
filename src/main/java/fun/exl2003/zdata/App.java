package fun.exl2003.zdata;


/* import org.apache.commons.codec.digest.DigestUtils; */
import static org.apache.commons.lang3.ArrayUtils.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] argv) {
        String[] phrase = {"Hello"};
        phrase = add(phrase, " ");
        phrase = add(phrase, "world");
        for (String word : phrase) {
            System.out.print(word);
        }
        System.out.println();
    }
/*
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( sha256hex(args[0]) );
    }

    public static String sha256hex(String input) {
	return DigestUtils.sha256Hex(input);
    }
*/    
}
