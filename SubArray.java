public class SubArray { 
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int count=0;
        int sum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    }
                    System.out.println("Sum: "+sum);
                    count++;
             }
        }
                System.out.println("Total count: "+count);
        
    }
}
 