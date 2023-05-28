
public class MaxElement{
    static void maxElement(int arr[],int n){
       int max= arr[0];
       for(int i=1;i<n;i++){
        if(arr[i] >max){
            max=arr[i];
        }
       }
       System.out.println("Max element:"+max);
    }
    
    public static void main(String[] args) {
        int arr[]={2,5,7,8,10,13};
        int n =arr.length;
        maxElement(arr, n);
    }
}
    

