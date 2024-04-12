// this is where i am defining the function to print the array and for taking input 

import java.util.Scanner;

public class question2 {
public static void print(int arr []) {
    int n = arr.length;
    for(int i = 0;i<n;i++){
        System.out.println(arr[i]);
    }
}

    public static int[] inpputArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("enter the number at index number" + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = inpputArray();
        print(arr);

    }
}
