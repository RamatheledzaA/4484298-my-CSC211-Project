//Ramatheledza ADZISANI 4484298


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A15Practical {
    public static void main(String [] args) throws Exception{

        // you need to read a file.txt
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        File filename = new File("C:/Users/Cscience1/IdeaProjects/My CSC211 Prtojects - 4484298/src/jocye1922_ulysses.txt");
        Scanner scan =new Scanner(filename);

        // now we need to read every line in the txt file
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] words = line.split(""); // split the line into words and put them in an array

            for( String word : words){
                word = word.replaceAll("[^a-zA-Z]","");// this removes all the puntuations
                word = word.toLowerCase();

                // create a loop that continues if the length od the word is equal to 0
                if(word.length() == 0){
                    continue;
                }

                // now change every word into a character and put them in an array and sort them
                char[] charcters = word.toCharArray();
                Arrays.sort(charcters);

                //now create a key
            }

        }
    }
}
