import java.util.Scanner;

/**
 * 1 this is the program in which we are taking input from the user and  printing the array
 */
public class  question1 {


    public static void main(String[] Args){
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int arr [] = new int[size];

         for(int i = 0;i<size;i++){
            System.out.println("enter the element" + i);
            arr[i] = sc.nextInt();

         }
         for(int i =0;i<size;i++){
            System.out.println(arr[i]);
         }
    }
    
}