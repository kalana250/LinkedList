import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.LinkedList;

public class Batch10 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.add("Punchi Malith");
        names.add("Sasa");
        names.add("Umesha");
        names.add("Lahiru");
        names.add("Kalana");
        names.add("Chathurika");

        System.out.println("Names :- " + names);

        names.add(3,"Gawesh");

        System.out.println("Update Names :- " + names);

        String s = names.get(5);

        System.out.println("Name at Index 5 :- " + s);

        names.set(1,"Sasadara Gamhewa");

        System.out.println("Updated Nmaes :- " + names);

        String g = names.remove(3);

        System.out.println("Removed Names :- " + g);

        System.out.println("Updated Nmaes :- " + names);

    }
}
