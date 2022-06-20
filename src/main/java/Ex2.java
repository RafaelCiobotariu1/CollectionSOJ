import java.util.*;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List <Integer> newList = Arrays.asList(7, 4, 5, 2, 1, 2, 4, 1);
        System.out.println("The list at the beggining: " + newList);

        newList = newList.stream()
                  .distinct()
                  .collect(Collectors.toList());

        System.out.println("The list after deleting the dupps: " + newList);

        Collections.sort(newList);
        System.out.println("The list after sort: " + newList);

        Set<String> newSet = new HashSet<>(newList.stream().map(Object::toString).collect(Collectors.toList()));
        System.out.println("Set-ul creat dupa lista data: "+ newSet );

        Map<String,Integer> newMap = new HashMap<>();
        Iterator<String> setIterator = newSet.iterator();
        Iterator<Integer> listIterator = newList.iterator();

        while (setIterator.hasNext() && listIterator.hasNext()){
            newMap.put(setIterator.next(), listIterator.next());
        }

        System.out.println("The map created from the set and the list: " + newMap );
    }
}
