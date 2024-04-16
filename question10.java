public class question10 {
    public static int dublicate(int arr []){
        int n =  arr.length;
        for(int i =0;i<n;i++){
            int dublicatee = arr[i];
                for(int j =0;j<n;j++){
                    if(dublicatee == arr[j]){
                        return dublicatee;
                    }
                }
            
        }
        return 0;
    }
    public static void main(String Args[]){
        int arr [] = {1,2,2,3,4,55,55};
        int result = dublicate(arr);
        System.out.println(result);
    }
}
