
public class RotateArray {
    static void rotate(int arr[],int n){
        arr[0]=arr[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i]-1;
            System.out.println();
        
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,5,9};
        int n=arr.length;
        rotate(arr, n);

    }
    
}
