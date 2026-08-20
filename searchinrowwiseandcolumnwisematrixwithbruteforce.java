public class searchinrowwiseandcolumnwisematrixwithbruteforce {
    public static void main (String args []){
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int i = 0 ;
        int j = 0 ;
        int target = 8;
        while (i < arr.length&& j < arr[0].length){
            if(arr[i][j]==target){
                break;
            }
            j++;
            if(j == arr[0].length){
                i++;
                j = 0 ;
            }
        }
        System.out.println(i+" "+j);
    }
}
