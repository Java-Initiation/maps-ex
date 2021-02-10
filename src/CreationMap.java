import java.util.HashMap;

public class CreationMap {

    public static void main(String[] args) {

        HashMap<String, Integer> personnesMap = new HashMap<>();
        personnesMap.put("Paul", 1750);
        personnesMap.put("Hicham", 1825);
        personnesMap.put("Yu", 2250);
        personnesMap.put("Ingrid", 2015);
        personnesMap.put("Chantal", 2418);

        System.out.println("taille de la map : " + personnesMap.size());

    }
}
