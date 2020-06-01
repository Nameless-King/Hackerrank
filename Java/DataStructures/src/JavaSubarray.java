import java.util.Scanner;

public class JavaSubarray {
    private static int getSum(int[] nums,int start, int depth){
        if(depth > nums.length - start){
            return 0;
        }
        if(start >= nums.length) {
            return 0;
        } else if(depth == 0){
            return 0;
        }else if(depth == 1){
            return nums [start];
        }else{
            return nums[start] + getSum(nums,start+1,depth-1);
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numNegativeSubarrays = 0;
        int length = console.nextInt();
        int[] nums = new int[length];
        for(int i = 0;i<nums.length;i++){
            nums[i] = console.nextInt();
        }
        for(int i = 1;i<=nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(getSum(nums,j,i) < 0){
                    numNegativeSubarrays++;
                }
            }
        }
        System.out.println(numNegativeSubarrays);
    }
}
