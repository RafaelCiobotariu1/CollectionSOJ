import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(" THE LIST: ");
        List<Integer> listaNoua= new ArrayList<>();

        for(int i = 1; i<= 10; i++){
            listaNoua.add(i);
        }

        for (Integer it : listaNoua) {
            if(it % 2 == 0){
                System.out.print(it + " ");
            }
        }
        System.out.println("\n");
        System.out.println(" THE SET ");

        Set <String> setNou = new HashSet<>();
        for(int i = 1; i <= 3; i++)
            setNou.add("TextAdded3Times");

        for (String s : setNou) {
            System.out.println(s);
            System.out.println("Set are elemente unice, deci nu salveaza duplicatele");
        }

        System.out.println("\n");
        System.out.println(" THE MAP ");

        Map<String, Integer> mapNou = new HashMap<>();
        mapNou.put("paine", 5);
        mapNou.put("Salam", 23);
        mapNou.put("Somon", 30);
        mapNou.put("Bere", 9);
        mapNou.put("Gin", 45);

        for (String s : mapNou.keySet()) {
            if(mapNou.get(s) > 10)
                System.out.println(s);
        }
    }
}
