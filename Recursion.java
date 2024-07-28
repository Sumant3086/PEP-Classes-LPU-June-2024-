public class Recursion {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int temp=sum(n-1);
        return temp+n;
    }
        public static int calculating(int n,int sum){
        return n*(n+1)/2;//5+4+3+2+1=15;
    }
    
    public static void main(String[] args) {
        int n=5;  
        System.out.println("Recursive sum : "+sum(n));
        System.out.println("Sum of first "+n+" numbers: "+calculating(n, n));
    }
}
