class Cosecutive{
    public static void main(String[] args) {
        int arr[]={1,40,30,10,20,5};
        int k=3;
        int max=0;

        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
            }
            if(sum>max){
                max=sum;
            }
        }
                System.out.println("max:"+max);
     }
}
    