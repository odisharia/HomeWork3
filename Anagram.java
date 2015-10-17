import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Teona Odisharia on 10/17/2015.
 */
public class Anagram {
    public static void main(String[] args) throws IOException {
        String firstStr;
        String SecondStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sheiyvanet pirveli winadadeba");
        firstStr = br.readLine();
        System.out.println("Sheiyvanet meore winadadeba");
        SecondStr = br.readLine();

        System.out.println(isAnagram(firstStr, SecondStr));
    }

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        str1 = sortStr(str1);
        str2 = sortStr(str2);

        return str1.equals(str2);
    }

    private static String sortStr(String str) {
        char[] charArr = str.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }
}