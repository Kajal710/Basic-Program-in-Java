
public class Leaderelement {
    public static void main(String[] args) {
        int arr[]={1,12,34,56,65,43,11,6};
        int n=arr.length;
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Leader Element is:"+max);
    }
}
        