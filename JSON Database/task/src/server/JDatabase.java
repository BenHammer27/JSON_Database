package server;

public class JDatabase {
    private String[] JSON;

    JDatabase(int size) {
        this.JSON = new String[size];
    }

    public String set(int index, String text) {
        if (index < JSON.length && index >= 0) {
            JSON[index] = text.trim();
            return "OK";
        } else {
            return "ERROR";
        }
    }

    public String get(int index) {
        if (index > JSON.length || index < 0 ) {
            return "ERROR";
        } else {
            if (JSON[index].isEmpty()) {
                return "ERROR";
            } else {
                return JSON[index];
            }
        }
    }

    public String delete(int index) {
        if (index > JSON.length - 1 || index < 0 ) {
            return "ERROR";
        } else {
            JSON[index] = "";
            return "OK";
        }
    }
}
