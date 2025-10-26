package Maps;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapEntry {

    public static void main(String[] args) {
        List<Map.Entry<String, BigDecimal>> priceList = new ArrayList<>();

        // add Map.Entry objects to the list
          // We use AbstractMap.SimpleEntry for easy creation of Map.Entry instances
        priceList.add(new AbstractMap.SimpleEntry<>("Laptop", new BigDecimal("1200.50")));
        priceList.add(new AbstractMap.SimpleEntry<>("Mouse", new BigDecimal("25.99")));
        priceList.add(new AbstractMap.SimpleEntry<>("Keyboard", new BigDecimal("75.00")));
        priceList.add(new AbstractMap.SimpleEntry<>("Monitor", new BigDecimal("350.75")));
        priceList.add(new AbstractMap.SimpleEntry<>("Webcam", new BigDecimal("49.99")));

        System.out.println("--- Products and Prices from the List ---");

        // Iterate through the ArrayList and access the key and value from each Map.Entry.

        for(Map.Entry<String,BigDecimal> entry : priceList){
            String productName = entry.getKey();
            BigDecimal price = entry.getValue();

            System.out.println("Product : "+ productName + "Price : "+price);
        }

        System.out.println("\n--- Example: Finding a specific product ---");
        String searchProduct = "Keyboard";

        for(Map.Entry<String,BigDecimal> entry :priceList){
            if (entry.getKey().equals(searchProduct)) {
                System.out.println("Found "+ searchProduct + "with price: "+ entry.getValue());
                break;
            }

        } 
    }
    
}
