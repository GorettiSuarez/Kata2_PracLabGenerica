package kata2_practicalabgeneria;

import java.util.HashMap;

public class Kata2_PracticaLabGeneria {

    public static void main(String[] args) {
        String [] vStrings = {"Ana","Juan","Ana","Pedro","Pedro","Pedro", "Dani guapo"};
        Integer [] vEnteros = {4,8,9,4,8,8,6,2,7,9};
        
        Histogram histogramString = new Histogram(vStrings);
        Histogram histogramInt = new Histogram(vEnteros);
        
        HashMap<String,Integer> mapString = histogramString.getHisto();
        HashMap<Integer,Integer> mapInt = histogramInt.getHisto();
        
         for (Integer key : mapInt.keySet()) {
            System.out.println(key+" : " + mapInt.get(key) + " veces");
        }
         
        for (String key : mapString.keySet()) {
            System.out.println(key+" : " + mapString.get(key) + " veces");
        }
    }
    
}
