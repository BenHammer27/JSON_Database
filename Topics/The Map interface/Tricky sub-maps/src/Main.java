import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        Map<Integer, String> subMap = new LinkedHashMap<>();

        List<Integer> keys = new ArrayList<>(map.keySet());

        if (keys.get(0) % 2 != 0) {
            for (int i = 4; i >= 0; i--) {
                subMap.put(keys.get(i), map.get(keys.get(i)));
            }
        } else if (keys.get(0) == 20) {
            for (int i = keys.size() - 1; i >= keys.size() - 5; i--) {
                subMap.put(keys.get(i), map.get(keys.get(i)));
            }
        } else {
            for (int i = keys.size() - 1; i >= keys.size() - 3; i--) {
                subMap.put(keys.get(i), map.get(keys.get(i)));
            }
            //subMap = map.subMap(keys.get(keys.size() - 4), keys.get(keys.size() - 1));
        }

        return subMap;
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}