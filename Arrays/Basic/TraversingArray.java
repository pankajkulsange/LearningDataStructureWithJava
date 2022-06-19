package Arrays.Basic;
import java.util.Scanner;

class TraversingArray{
    public static void main(String args[]){
        // Static input 
        int arr[] = {1,2,3,4,5,6,7,8};
        traverseArrayByFor(arr);
        System.out.println();
        traverseArrayByForEach(arr);
        System.out.println();
        traverseArrayByWhile(arr);
        System.out.println();

        // dynamic input 
        dynamicTraverse();
        System.out.println();

        // printing array 
        printingArray(arr);
        System.out.println();
    }
    public static void traverseArrayByFor(int arr[]){
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
    }

    public static void traverseArrayByForEach(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void traverseArrayByWhile(int arr[]){
        int i = 0;
        int len = arr.length;
        while(i < len){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void dynamicTraverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of input size : ");
        int len = sc.nextInt();
        System.out.println("Plese enter " + len + " inputs : ");
        int arr[] = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0; 
        while (i < len){
            System.out.print(arr[i] + " ");
            i++;
        }
        sc.close();
    }

    public static void printingArray(int arr[]){
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
        System.out.println();
    }
}