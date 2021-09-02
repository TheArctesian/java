package MostComWord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class aclass {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader Red = new BufferedReader(new FileReader("MostComWord/small.txt"));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = Red.readLine();
            while (line != null) {

		   listOfLines.add(line);
            }
	    System.out.println(listOfLines.toString();
            Red.close();
            System.out.println(listOfLines.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Cant find file");
        }
//loop through words in small.txt
    }}
