


public class SpanArray {
    static void span(int arr[],int n){
    int Max=arr[0];
    int Min=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>Max){
            Max=arr[i];
        }
        if(arr[i]<Min){
            Min = arr[i];
        }
    }
    System.out.println(Max-Min);
 }
 public static void main(String[] args) {
    int arr[]={2,5,7,9,10,11,1};
    int n=arr.length;
    span(arr, n);
 }
}
