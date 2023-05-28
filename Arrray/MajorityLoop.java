public class MajorityLoop {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int n=arr.length;
        int majority=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                majority=arr[i];
            }
            if(majority==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(majority);
    }
    
}
