package Searching.PracticeQuestions;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=first(nums,target);
        arr[1]=last(nums,target);
        return arr;
    }
    public int first(int []nums, int target){
        int start=0;
        int end=nums.length-1;
        int indx=-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(nums[mid]==target){
                indx=mid;
            }
        }
        return indx;
    }
    public int last(int []nums, int target){
        int start=0;
        int end=nums.length-1;
        int indx=-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(nums[mid]==target){
                indx=mid;
            }
        }
        return indx;
    }
}
