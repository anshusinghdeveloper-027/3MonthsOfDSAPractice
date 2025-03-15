package array;

public class SecondLargest {

    public static void main(String[] args) {
        int [] nums={2,1,5,3,9};
        System.out.println(secondLargest(nums));
    }


    public static int secondLargest(int []nums){
        int res=nums[0];
        int largest=Integer.MAX_VALUE;

        for (int num : nums) {
            if (num>=res&&num<largest) {
                res = num;
            } else
                largest = num;

        }
        return res;
    }

}
