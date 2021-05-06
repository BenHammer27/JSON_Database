import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> output = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            int counter = 0;
            for (int j = i; j < strings.length; j++) {
                if (strings[j].equals(strings[i])) {
                    counter++;
                }
            }
            output.putIfAbsent(strings[i], counter);
        }
        return output;
    }

    public static void printMap(Map<String, Integer> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}