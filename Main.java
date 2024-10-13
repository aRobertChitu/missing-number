
public class Main {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int sumFound = 0;
        for(int num: nums){
            sumFound += num;
        }
        return (nums.length * (nums.length +1))/2 - sumFound;
    }

}