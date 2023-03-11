package sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static ArrayList taskrun(){
        List<String> names = List.of("Mercury", "Veneers", "Earth","Mars", "Jupiter", "Saturn","Uranus", "Neptune", "Pluto");

        ArrayList<String> multiNames = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 30; i++) {
            multiNames.add(names.get(rnd.nextInt(names.size())));
        }
        //System.out.println(multiNames);
        return multiNames;
    }

}
