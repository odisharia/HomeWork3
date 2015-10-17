import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;

/**
 * Created by Teona Odisharia on 10/17/2015.
 */
public class Lexicon {
    private String fileLocation;
    public String line;
    private String strWord;
    private HashMap<String, String> words = new HashMap<String, String>();
    private HashMap<String, Integer> countwords = new HashMap<String, Integer>();

    public void getFileLocation(String fileLocation) throws IOException {
        System.out.println("miutitet leqsikonis faili");
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.fileLocation = chooser.getSelectedFile().toString();
            System.out.println(this.fileLocation);
        }
        try {
            this.setFileToColections();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setFileToColections() throws IOException {
        int ind = 1;
        BufferedReader fileContent = new BufferedReader(new FileReader(this.fileLocation));
        if (fileLocation != "") {

            while (fileContent.ready()) {
                this.strWord = fileContent.readLine().toString().trim().toLowerCase();
                if (this.strWord != null){
                this.countwords.put(this.strWord,new Integer(this.strWord.length()));
                this.words.put(this.strWord, this.strWord);}
            }
            fileContent.close();
        } else {
            System.out.println("faili ar aris mititebuli");
            return;
        }
    }

    public boolean isWord(String word) {
        if (this.words.containsKey(word)) {
            return true;
        } else return false;
    }

    public int getWordCount() {
        return this.words.size()+1;
    }

    public String getRandomWord() {
       return this.words.keySet().toArray()[new Random().nextInt(this.words.keySet().size())].toString();
    }

    public Iterator <String> iterator() {
        Set set    = this.words.entrySet();
        return set.iterator();
    }

    public void wordsWithSize(int size) {
         for (Object o : this.countwords.keySet()) {
            if (this.countwords.get(o).equals(size)) {
                System.out.println(o);
            }
        }
    }
}