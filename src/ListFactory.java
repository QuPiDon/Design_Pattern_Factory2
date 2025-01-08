import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListFactory {


    public static List<String> create(String key){
        if ("a".equalsIgnoreCase(key)){
                System.out.println("ArrayList");
                return new ArrayList<>();
        } else if ("v".equalsIgnoreCase(key)){
            System.out.println("Vector");
            return new Vector<>();
        } else {
            throw new IllegalArgumentException("Ungültiger Typ. 'a': für ArrayList \n 'v' für Vector");
        }

        }

}


