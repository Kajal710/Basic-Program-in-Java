public class Gasstation {
    public static void main(String[] args) {
      int gas[]={1,2,3,4,5};
      int cost[]={3,4,5,1,2};
      int n=gas.length;
      int index=0,loss=0,rem=0;
      for(int i=0;i<n;i++) {
        rem+=gas[i]-cost[i];
        if(rem<0){
            index=i+1;
            loss+=rem;
            rem=0;
        }
        if((loss-rem)==0){
            System.out.println(index);
    
      } 
      
      }
    
      
    }
}
