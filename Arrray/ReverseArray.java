

public class ReverseArray {
    static void reverse(int arr[],int n){
        for(int i=0;i<n/2;i++){
            int t=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=t;
        }
        System.out.println("Reverse array is:");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+",");
        }

    }
    public static void main(String[] args) {
        int arr[]={2,8,4,1,0,9};
        int n=arr.length;
        reverse(arr, n);
    }
    
}
///blog.brainmentors