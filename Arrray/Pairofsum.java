

public class Pairofsum {
    static boolean chkpair(int arr[] ,int size ,int x){
        for(int i=0;i<(size-1);i++){
            for(int j=(i+1);j<size;j++){
                if(arr[i]+arr[j] == x)
                {return true;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int arr[]={0,-1,2,-3,1};
        int x=-2;
        int size = arr.length;
        if(chkpair(arr, size, x)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
