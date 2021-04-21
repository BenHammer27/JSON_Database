package server;

public class JDatabase {
    private String[] JASON;

    JDatabase(int size) {
        this.JASON = new String[size];
    }

    public String set(int index, String text) {
        if (index < JASON.length && index >= 0) {
            JASON[index] = text.trim();
            return "OK";
        } else {
            return "ERROR";
        }
    }

    public String get(int index) {
        if (index > JASON.length || index < 0 ) {
            return "ERROR";
        } else {
            if (JASON[index].isEmpty()) {
                return "ERROR";
            } else {
                return JASON[index];
            }
        }
    }

    public String delete(int index) {
        if (index > JASON.length - 1 || index < 0 ) {
            return "ERROR";
        } else {
            JASON[index] = "";
            return "OK";
        }
    }
}
