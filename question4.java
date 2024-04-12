import java.util.Scanner;

public class question4 {
    
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
    // used to find the maxminum out of the array
    public static int max(int arr []){
        int n = arr.length;
       int  max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = inpputArray();
        int result = max(arr);
        System.out.println(result);
    }
}
