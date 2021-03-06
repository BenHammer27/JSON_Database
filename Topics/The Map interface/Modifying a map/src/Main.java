import java.util.*;

class MapUtils {

    public static void mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            if (!map.get("a").isEmpty()) {
                map.put("b", map.get("a"));
            }
        }
        if(map.containsKey("c")) {
            map.remove("c");
        }
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(":");
            map.put(pair[0], pair[1]);
        }
        MapUtils.mapShare(map);
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}