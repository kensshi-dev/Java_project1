# Java_project1

README for Text Analyzer Project
Project Title: Text Analyzer
Description:
The Text Analyzer is a Java-based program designed to analyze text files provided by the user. The program offers multiple functionalities for analyzing text, such as counting words, calculating word lengths, identifying the most frequent words, etc. It also allows users to define and implement custom functionalities for text analysis.

Functionality:

Input:

Users can provide a text file path or manually input the text for analysis.
The program provides a menu for the following analysis options:
1.Total word count: Counts all words in the text.

2.Unique word count: Counts only the unique words in the text.

3.Average word length: Calculates the average length of words.

4.Sentence count: Counts the number of sentences based on punctuation.

5.Most frequent words: (Incomplete functionality; still under development).

6.Longest word: Finds the longest word in the text.

7.Shortest word: Finds the shortest word in the text.

8.Percentage of unique words: Calculates the percentage of unique words out of total words.


Output:
The program will output the result based on the user’s choice, such as word count, average word length, etc.
After displaying the result, the user is prompted to continue with another analysis or exit.


#Logic Explanation:

Code Flow:

The program starts by asking the user whether they want to manually input text or read from a file.
If the user chooses to read from a file, the readFile() method reads the content from the file and stores it in the text variable. Otherwise, the text is directly input by the user.
After acquiring the text, the program displays a menu with multiple options for text analysis.
Based on the user's choice, the program performs the corresponding analysis:
Word Count: Counts the total number of words by splitting the text into words using spaces.
Unique Word Count: Uses a HashSet to eliminate duplicates and count unique words.
Average Word Length: Iterates over each word to calculate the total length and then finds the average.
Sentence Count: Splits the text based on punctuation marks (., !, ?) to estimate the number of sentences.
Longest/Shortest Word: Finds the longest and shortest word by comparing word lengths.
Unique Word Percentage: Calculates the percentage of unique words by dividing the number of unique words by the total word count.
The program then displays the result of the selected analysis and asks if the user wants to perform another analysis or exit.
