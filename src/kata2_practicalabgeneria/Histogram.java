package kata2_practicalabgeneria;

import java.util.HashMap;

public class Histogram <T> {

    private final T[] v;

    public Histogram(T[] v) {
        this.v = v;
    }
    
    public HashMap<T,Integer> getHisto(){
        HashMap <T,Integer> histo = new HashMap<>();
        
        for (T v1 : v) {
            if (!histo.containsKey(v1)) {
                histo.put(v1, 1);
            } else {
                histo.put(v1, histo.get(v1) + 1);
            }
        }
        
        return histo;
    }
}
