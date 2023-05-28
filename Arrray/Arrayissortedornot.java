
public class Arrayissortedornot {
    static void arraysorted(int arr[],int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
         System.out.println("Array is sorted"); 
        else{
            System.out.println("Array is not sorted");
            }
        }

        }
    public static void main(String[] args) {
        int arr[]={5,3,1,2,6};
        int n=arr.length;
        arraysorted(arr, n);
    }
    
}

