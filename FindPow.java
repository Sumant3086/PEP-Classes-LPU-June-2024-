public class FindPow {
    public static int power(int x,int y){
        if(y==0){
            return 1;
        }
        if(y==1){
            return x;
        }
        int res=power(x,y/2);
        if(y%2==0){
            return res*res;
        } else{
            return x*res*res;
        }
    }
    public static void main(String[] args){
        int b=2;
        int p=5;
        System.out.println(power(b,p));
    }
}

 