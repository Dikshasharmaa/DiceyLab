import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> results = new HashMap<>();
    public Bins(int numberOfDices){
        for(int i =numberOfDices;i<numberOfDices*6;i++){
            results.put(i,0);
        }

    }
    public Integer getBin(int number){
        return results.getOrDefault(number,0);
    }
    public void incrementBin(int binNumber){
        results.put(binNumber, results.getOrDefault(binNumber,0));
    }


//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10

}
