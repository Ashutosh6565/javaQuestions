import java.util.Scanner;

public class question3 {
    
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
    
    public static int sum(int arr []){
        int n  = arr.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = inpputArray();
        int result = sum(arr);
        System.out.println(result);
    }

}
