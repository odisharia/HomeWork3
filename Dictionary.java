import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Teona Odisharia on 10/17/2015.
 */
public class Dictionary {

    public static void main(String[] arg) throws IOException {
        String fileLocation = "";
        String strWord;
        String line;
        int wordSize;
        Iterator<String> iterator;
        Scanner sc = new Scanner(System.in);

        Lexicon lexicon = new Lexicon();
        lexicon.getFileLocation("");
        System.out.println();

        System.out.println("mimdinareobs isWord() funqciis gamodzaxeba sheiyvanet sadziebo sityva: ");
        strWord = sc.nextLine();
        System.out.println(lexicon.isWord(strWord));
        System.out.println();

        System.out.println("mimdinareobs getWordCount() funqciis gamodzaxeba");
        System.out.println("faili sheicvas " + lexicon.getWordCount() + " sityvas");
        System.out.println();

        System.out.println("mimdinareobs getRandomWord() funqciis gamodzaxeba");
        System.out.println("Random sityvaa: " + lexicon.getRandomWord());
        System.out.println();

        System.out.println("mimdinareobs wordsWithSize() funqciis gamodzaxeba");
        System.out.println("sheiyvanet ricxvi da shesabamisi sigrdzis sityvebi daibechdeba: ");
        wordSize = sc.nextInt();
        lexicon.wordsWithSize(wordSize);
        System.out.println();


        System.out.println("mimdinareobs iterator() funqciis gamodzaxeba");
        iterator = lexicon.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            //System.out.println(element + " ");
        }
        System.out.println();
    }
}
