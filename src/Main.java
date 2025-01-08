import java.util.List;
public class Main {



    public static void main(String[] args) {

        try {
            List<String> arrayList = ListFactory.create("A");
            arrayList.add("Element_1");
            arrayList.add("Element_2");
            System.out.println("ArrayList: " + arrayList);

            List<String> vectorList = ListFactory.create("V");
            vectorList.add("Element_1");
            vectorList.add("Element_2");
            System.out.println("VectorList: " + vectorList);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: + e.getMessage");
        }



    }
}

