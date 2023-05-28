public class Buyandstock {
    static void appr(int arr[]){
        int min=arr[0];
        int finalprofit=0;
        int profit=0;
        for(int i=1;i<arr.length;i++){
        finalprofit=arr[i]-min;
        profit=Math.max(profit,finalprofit);
        min=Math.min(min,arr[i]);
        }
        System.out.println(profit+min);

    }
public static void main(String[] args) {
    int arr[]={7,1,2,3,6,4};
    appr(arr);

}
    
}
