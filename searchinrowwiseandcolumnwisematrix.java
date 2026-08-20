public class searchinrowwiseandcolumnwisematrix{
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row = arr.length;
        int target = 10;
        for(int i = 0 ; i < row ; i++){
            int start = 0 ; 
            int end = arr[0].length-1;
            while(start <= end){
                int mid = (start+end)/2;
                if(arr[i][mid] == target){
                    System.out.println("Present");
                    return;
                }
                else if (arr[i][mid] > target){
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1;
                }
            }
           
        }
        System.out.println("Not Present");
    }
}