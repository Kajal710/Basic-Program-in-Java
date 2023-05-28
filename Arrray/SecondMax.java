public class SecondMax {
    static void secondMax(int arr[] ,int n){
        int Max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println("Max Element:"+Max);
        int SM=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>SM && arr[i] !=Max){
                SM= arr[i];
            }
        }
        System.out.println("SecondMax Element:"+SM);
        }
        
    public static void main(String[] args) {
        int arr[]={2,4,7,9,13,16,69};
        int n= arr.length;
        secondMax(arr, n);
    }
}
