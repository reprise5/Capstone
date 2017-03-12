//Reprise

//This class is responsible for the word-bag logic. It will set up a random word for the user to guess based
//on the difficulty they chose in the begining before pressing "start Game" button. each bag has 25 words.

package PuzzPak;
import java.util.Random;


public class WordShuffle {
    //GLOBALS
    String wordToGuess;
    int count = 0;

    //This is the "EASY" difficulty, random word generator
    public String doWordBag1(){
        wordToGuess = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String WordBag1[]= new String[] {"whale","joy", "spirit","court","trees","dream","dozen","mouse","cinema","book",
                                         "pond","moon","stars","elbow","nurse","belief","peace","farmer","garden","love",
                                         "ocean","watch","school","beach","money",};

        randomNumber = randomGenerator.nextInt(24); // from 0 to 24, is 25 entries.
        wordToGuess = WordBag1[randomNumber];
        System.out.println("Number: " + randomNumber);

        return wordToGuess;
    }
    //This is the "MEDIUM" difficulty, random word generator
    public String doWordBag2(){
        wordToGuess = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String WordBag2[]= new String[] {"centipede","continent","chocolate","rectangle","population","sandwich","exciting","philosopher","dishonest","equipment",
                                         "generous","confusion","friendship","airplane","strawberry","information","continent","landscape","staircase","zipper",
                                         "automobile","technician","arpeggio","acceleration","mountain"};

        randomNumber = randomGenerator.nextInt(24);
        wordToGuess = WordBag2[randomNumber];
        System.out.println("Number: " + randomNumber);

        return wordToGuess;
    }
    //This is the "HARD" difficulty, random word generator
    public String doWordBag3(){
        wordToGuess = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String WordBag3[]= new String[] {"vociferous","extrapolate","tertiary","vicarious","ferrous","animosity","elucidate","phenomenon","bellicose","indictment",
                                         "sphynx","idiosyncrasy","aphorism","hermeneutic","pernicious","epistemology","dietetic","deprecate","sojourn","assent",
                                         "verdict","congenial","inculcate","zephyr","uxorious"};

        randomNumber = randomGenerator.nextInt(24);
        wordToGuess = WordBag3[randomNumber];
        System.out.println("Number: " + randomNumber);

        return wordToGuess;
    }
    //is the letter there?
    public boolean testLetterResponse(char letter){
        boolean isCorrectLetter;
        String sLetter = String.valueOf(letter); //converted char to string.

        isCorrectLetter = wordToGuess.contains(sLetter);

        //Send to console to see the result, the user will see it on their screen another way.
        System.out.print("Entered Letter: " + letter + " - ");
        if (isCorrectLetter){
            System.out.print("EXISTS\n");
        }
        else
            System.out.println("ABSENT");

        return isCorrectLetter;
    }
}

