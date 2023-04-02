package day19_array;

import java.util.Arrays;

public class Alphabet_allCharactersArrays {
    public static void main(String[] args) {
        int lengthOfArray = 'z'-'a'+1;
        System.out.println(lengthOfArray);
        char[] ascendingLetters = new char[lengthOfArray];
        char[] descendingLetters = new char[lengthOfArray];
        for (char i = 'a', k= 'z', j = 0; j<lengthOfArray; i++, j++,k--) {
            ascendingLetters[j]=i;
            descendingLetters[j]=k;

        }
        System.out.println(Arrays.toString(ascendingLetters));
        System.out.println("descendingLetters = " + Arrays.toString(descendingLetters));
        
        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        System.out.println("Arrays.toString(characters) = " + Arrays.toString(characters));
    }
}

