import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        System.out.println("Do you want to enter text manually or read from a file? (Enter 'manual' or 'file'):");
        String inputMethod = scanner.nextLine();

        if (inputMethod.equalsIgnoreCase("file")) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            text = readFile(filePath);
        } else {
            System.out.println("Write your text:");
            text = scanner.nextLine();
        }

        System.out.println("1.Total word count.\n" +
                "2.Unique word count.\n" +
                "3.Average word length.\n" +
                "4.Sentence count.\n" +
                "5.Most frequent words.\n" +
                "6.Longest word.\n" +
                "7.Shortest word.\n" +
                "8.Percentage of unique words\n");
        System.out.println("What do you want to do with the text?:");
        int option = scanner.nextInt();
        String text1 = text.toLowerCase();
        String[] words = text1.trim().split("\\s+");

        if (option ==2){
            // Unique Words
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
            System.out.println("Unique Words: " + uniqueWords.size());
        }
        if (option == 1) {
            // Total Words
            int wordCount = words.length;
            System.out.println("Total: " + wordCount);
        }
        if(option == 3) {
            // Average Length
            int wordCount = words.length;
            int length = 0;
            for (String word : words) {
                length += word.length();
            }
            double averageLength = (double) length / wordCount;
            System.out.println("Average length: " + Math.round(averageLength));
        }
        if (option == 4) {
            // Sentence Count
            String[] sentences = text.split("[.!?]+\\s*");
            int sentenceCount = sentences.length;
            System.out.println("Sentences in text: " + sentenceCount);
        }
        if (option == 6) {
            //Longest Word
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Longest word: " + longestWord);
        }
        if (option == 7) {
            //Shortest Word
            String shortestWord = words[0];
            for (String word : words) {
                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
            System.out.println("Shortest word: " + shortestWord);
        }
        if (option == 8) {
            //% of the unique words
            int wordCount = words.length;
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
            double uniqueWordPercentage = ((double) uniqueWords.size() / wordCount) * 100;
            System.out.println("Percentage of unique words: " + uniqueWordPercentage + "%");
        }
        if (option == 5){
            System.out.println("sorry, i tried to add this function, but could figure out how to");
        }
    }

    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                content.append(reader.nextLine()).append(" ");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return content.toString();
    }
}
