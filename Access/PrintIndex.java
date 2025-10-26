import java.util.HashMap;
import java.util.Map;

public class PrintIndex {

    public static void main(String[] args){
        String dev = "Devesh";
        HashMap <Character,Integer> freqMap = new HashMap<>();

        for(int i=0; i< dev.length(); i++){
            char c = dev.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
            
        }

        for(char key : freqMap.keySet()){
            System.out.println(key + " "+ freqMap.get(key));
        }
    }
    
}
