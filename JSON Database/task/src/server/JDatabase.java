package server;

import java.util.HashMap;
import java.util.Map;

public class JDatabase {

    private Map<String, String> JSON;

    JDatabase(/*int size*/) {
        this.JSON = new HashMap<String, String>();
    }

    public String set(String key, String value) {
        if (JSON.containsKey(key)) {
            JSON.remove(key);
        }
        JSON.put(key, value);
        return "OK";
    }

    public String get(String key) {
        if (JSON.containsKey(key)) {
            return JSON.get(key);
        } else {
            return "ERROR";
        }
    }

    public String delete(String key) {
        if(JSON.containsKey(key)) {
            JSON.remove(key);
            return "OK";
        } else {
            return "ERROR";
        }
    }
}
