public class Missingnum {
    static void missing(int arr[],int n){
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            x=x^arr[i];

        }for(int i=0;i<n;i++){
            y=y^arr[i];
            System.out.println(y);

    }
    int missing=x^y;
    System.out.println("Missing Number:"+missing);
}
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=arr.length;
        missing(arr, n);

    }
    
}
