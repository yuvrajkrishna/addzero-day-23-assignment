public class findelemfromsortedmatrixrpluslogc {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;

        int i = 0;
        int row = -1;

        // Find possible row
        while (i < arr.length) {

            if (arr[i][arr[0].length - 1] > target) {
                row = i;
                break;
            }
            else if (arr[i][arr[0].length - 1] == target) {
                System.out.println("Present");
                return;
            }

            i++;
        }

        // Binary Search in that row
        if (row != -1) {

            int start = 0;
            int end = arr[0].length - 1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (arr[row][mid] == target) {
                    System.out.println("Present");
                    return;
                }
                else if (arr[row][mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Not Present");
    }
}