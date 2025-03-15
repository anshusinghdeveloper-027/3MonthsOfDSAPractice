package array;

public class MinMax {

    public int[] getMinMax(int[] arr) {

        // Code Here
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min, max};
    }
}
