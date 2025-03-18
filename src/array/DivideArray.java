package array;

public class DivideArray {

    public static void main(String[] args) {
        int []nums={3,2,3,2,2,2};
        System.out.println("Result :"+divideArray(nums));
        int x=Integer.M

    }

    public  static  boolean divideArray(int[] nums) {
        int arr[]=new int[501];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        boolean flag=true;
        for(int i=0;i<501;i++){
            if(arr[i]%2!=0){
                return false;
            }
        }
        return flag;

    }
}
