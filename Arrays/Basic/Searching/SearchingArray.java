package Arrays.Basic.Searching;

public class SearchingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int find = 4;
        // return index 
        int index = linearSearch(arr, find);
        System.out.println(arr[index] + " is in array");

    }
    public static int linearSearch(int arr[], int find){
        // soln 1. using while loop 
        int i = 0;
        // while (i < arr.length){
        //     if(arr[i] == find){
        //         return i;
        //     }
        //     i++;
        // }
        // soln 2. using  for loop
    //    for (i = 0; i < arr.length; i++){
    //        if(arr[i] == find){
    //            return i;
    //        }
    //    }
        // soln 3. using for each
        for (int j : arr) {
            if(j == find){
                return i;
            }
            i++;
        }
        return Integer.MIN_VALUE;
    }
}
