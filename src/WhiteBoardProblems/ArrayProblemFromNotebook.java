package WhiteBoardProblems;

public class ArrayProblemFromNotebook {

    public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
                System.out.println(nums[i]);
            }
        }


    }

    public static void main(String[] args) {
        int[] givenArray = {0,1,2,2,3,3,4,5};
        removeDuplicates(givenArray);


    }


}
