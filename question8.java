public class question8 {
    public static void swap(int arr []){
        int n = arr.length;
        for(int i = 0;i<n-1;i+=2){
            
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp; 
        }
    }
    public static void print(int arr []){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arrr [] = {1,2,3,4};
        swap(arrr);
        print(arrr);
    }
}
