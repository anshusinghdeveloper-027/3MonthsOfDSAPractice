package array;

public class BinarySearch {

    public static void main(String[] args) {

        int []arr={1,2,3,4,5};
        System.out.println(binarSearch(arr,0,arr.length,4));

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
}
