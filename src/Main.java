import arten.Art;

public class Main {



    public static void main(String[] args) {

        Art art = ListFactory.create("A");
            art.elongate();
            System.out.println(art.hashCode());


        Art art2 = ListFactory.create("V");
            art2.elongate();
            System.out.println(art2.hashCode());

    }



    }

