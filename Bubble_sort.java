import java.util.*;

public class Bubble_sort{
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int arr [] = new int [6];

            System.out.println("Enter the elements of the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            printArray(arr);
            System.out.println();

            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j]> arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        
                    }
                    
                }
            }
            System.out.println("The sorted array is: ");
            printArray(arr);
        }

    }
}
