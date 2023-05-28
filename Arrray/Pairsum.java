

import java.util.HashMap;

public class Pairsum {
    static void approach(int arr[],int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
           if(map.get(arr[i])==null){
              map.put(k-arr[i],arr[i]);
             }
           else{
                 System.out.println("Pair found"+arr[i]+",");
                 map.get(arr[i]);
                }
            }
        }
        public static void main(String[] args) {
            int arr[]={2,1,5,6,3,7};
            int k=11;
            approach(arr, k);
        }
    }
    
