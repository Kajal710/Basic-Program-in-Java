
public class Barchart {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,0,1,8,3};
        int n= arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            

        }
        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
