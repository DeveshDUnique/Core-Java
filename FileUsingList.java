import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileUsingList
 {
    //ReadInput from file and find out unique words using list!
    // Function to find unique words from a file
    public static List<String> findUniqueWords(String filePath) {
        List<String> words = new ArrayList<>();
        List<String> uniqueWords = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                // Tokenize the line into words
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) 
                {
                    String word = tokenizer.nextToken().toLowerCase(); // Convert to lowercase
                    
                    // Add the word to the list of all words
                    if (!words.contains(word)) 
                    {
                        words.add(word);
                        uniqueWords.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return uniqueWords;
    }

    public static void main(String[] args) {
      

        String filePath = "C:\\Users\\Admin\\Desktop\\Java\\sample.txt";
        List<String> uniqueWords = findUniqueWords(filePath);

        // Print the unique words
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }



    
}
