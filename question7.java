public class question7 {
    public static void printarray(int arr []){
        int n = arr.length;

        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n;j++){
                System.out.print("(" +arr[i] +" " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        printarray(arr);
    }
}
