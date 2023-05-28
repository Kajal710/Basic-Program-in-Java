public class Sort01 {
    static void sort(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count ++;
            }
            for(i=1;i<count;i++){
                arr[i]=0;
            }
            for(i=count;i<n;i++){
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
        System.out.println(arr[i]+",");
        }

    }
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1,0,0,0,1,1};
        int n=arr.length;
        sort(arr, n);
    }
    
}
