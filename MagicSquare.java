import java.util.Scanner;

/**
 * Created by Teona Odisharia on 10/17/2015.
 */
public class MagicSquare {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("sheiyvanet kvadratuli masivis sigrdze: ");
        n = sc.nextInt();
        //luwi ricxvis shemtxvevashi diagonals ver gamovtvlit, amitom unda shemowmdes rom sheyvanili ricxvi iyos kenti
        if (n % 2 == 0) {
            System.out.println("sheyvanili ricxvi unda iyos kenti");
            return;
        }
        int[][] matrix = new int[n][n];
        InpArray(matrix, n);

        if (matrix.length > 0) {
            System.out.println(isMagicSquare(matrix, n - 1));
        }
    }

    public static void InpArray(int[][] arr,int n){
        Scanner sc = new Scanner(System.in);
        String nLine;
        String cLine;
        for (int i = 0; i < n ; i++) {
            nLine = sc.nextLine();
            String[] splitLine = nLine.split(" ");
            for (int j = 0; j < n; j++) {
                cLine = splitLine[j];
                arr[i][j] = Integer.parseInt(cLine);
            }
        }
    }

    public static boolean isMagicSquare(int[][] arr, int ln) {
        int sumOfrow = 0;
        int sumOfcol = 0;
        int sumOfleftDiag = 0;
        int sumOfRgithDiag = 0;
        int evNumber = 0;


        for (int row = 0; row <= ln; row++) {
            sumOfrow = 0;
            sumOfcol = 0;
            for (int col = 0; col <= ln; col++) {
                sumOfrow += arr[row][col];
                sumOfcol += arr[col][row];
                if (row == 0) {
                    evNumber += arr[row][col];
                }
            }
            if (sumOfcol != sumOfrow && evNumber != sumOfcol){
                return false;
            }
            sumOfleftDiag  += arr[row][row];
            sumOfRgithDiag += arr[ln-row][ln-row];
        }
        if (sumOfcol != sumOfrow && evNumber != sumOfcol){
            return false;
        }
        if (sumOfleftDiag == sumOfRgithDiag && evNumber == sumOfRgithDiag){
            return true;
        }else return false;
    }
}