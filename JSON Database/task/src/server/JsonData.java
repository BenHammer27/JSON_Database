package server;

public class JsonData {
    private final String type;
    private final String key;
    private final String value;

    public JsonData(String type, String key, String value) {
        this.type  = type;
        this.key = key;
        this.value = value;
    }
    public String getType() {
        return type;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
