import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] array = new int[6][6];

        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[j].length;j++){
                array[i][j] = console.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int r = 0; r < 6 - 2; r++){
            for(int c = 0; c < 6 - 2; c++){
                int currentSum = 0;
                currentSum += array[r][c];
                currentSum += array[r][c+1];
                currentSum += array[r][c+2];
                currentSum += array[r+1][c+1];
                currentSum += array[r+2][c];
                currentSum += array[r+2][c+1];
                currentSum += array[r+2][c+2];
                if(currentSum > max){
                    max = currentSum;
                }
            }
        }
    }
}
