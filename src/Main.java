import java.util.ArrayList;
import java.util.List;
public class Main {



    public static void main(String[] args) {

        try {
            List<String> arrayList = ListFactory.create("A");
            arrayList.add("Element_1");
            arrayList.add("Element_2");

            if(arrayList instanceof ArrayList) {System.out.println("ArrayList: " + arrayList);}

            List<String> vectorList = ListFactory.create("V");
            vectorList.add("Element_1");
            vectorList.add("Element_2");
            System.out.println("VectorList: " + vectorList);

            if(vectorList instanceof ArrayList) {System.out.println("Vector: " + vectorList);}
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: + e.getMessage");
        }





    }
}

