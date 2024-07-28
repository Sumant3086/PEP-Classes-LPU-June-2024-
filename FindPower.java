public class FindPower {
    public static int power(int x,int y){
        if(y==0){
            return 1;
        }
        if(y==1){
            return x;
        }
        return x*power(x,y-1);
    }
    public static void main(String[] args){
        int b=2;
        int p=5;
        System.out.println(power(b,p));
    }
}


