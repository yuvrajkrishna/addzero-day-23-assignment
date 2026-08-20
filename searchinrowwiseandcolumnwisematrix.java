public class searchinrowwiseandcolumnwisematrix{
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{5,6,7},{10,11,12},{8,13,14}};
        int row = arr.length;
        int target = 13;
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