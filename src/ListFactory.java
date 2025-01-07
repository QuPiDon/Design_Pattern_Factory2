import arten.ArrayList;
import arten.Vector;
import arten.Art;

public class ListFactory {


    public static Art create(String key){
        switch (key){
            case "A":

                System.out.println("ArrayList");
                return new ArrayList();

            case "V":

                System.out.println("Vector");
                return new Vector();
        }
        return null;
    }

}
