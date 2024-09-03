import java.util.*;

public class a87_journey {
    // funtn to get start
    public static String getStart(HashMap<String, String> tkt) {
        HashMap<String, String> tkt2 = new HashMap<>();

        for (String key : tkt.keySet()) {
            tkt2.put(tkt.get(key), key);
        }
        for (String key : tkt.keySet()) {
            if (!tkt2.containsKey(key)) {
                return key; // start
            }
        }
        return null;
    }

    public static void main(String[] args) {

        HashMap<String, String> tkt = new HashMap<>();
        tkt.put("chen", "bngl");
        tkt.put("mum", "del");
        tkt.put("goa", "chen");
        tkt.put("del", "goa");

        // System.out.println(tkt);
        String start = getStart(tkt);
        System.out.print(start);
        for (String key : tkt.keySet()) {
            System.out.print("->" + tkt.get(start));
            start = tkt.get(start);

        }
    }
}