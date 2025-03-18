package array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int []arr={5,7,7,8,8,10};
       //System.out.println(binarSearch(arr,0,arr.length,4));
        System.out.println(Arrays.toString(searchRange(arr,8)));

    }

    public static int binarSearch(int []arr,int l,int h,int x){
        if(h>=l){
            int mid=l+(h-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return binarSearch(arr,l,mid-1,x);
            }
            return binarSearch(arr,mid+1,h,x);
        }

        return -1;

    }


    public static int[] searchRange(int[] nums, int target) {
        int res1=first(nums,target);
        int res2=last(nums,target);
        return new int[]{res1,res2};

    }

    public static int first(int[] nums,int target){
        int result=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                result=mid;
                right=mid-1;
            }
        }
        return result;
    }
    public static int last(int[] nums,int target){
        int result=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                result=mid;
                left=mid+1;
            }
        }
        return result;
    }



}
