public class StringSortestPath {
    public static void main(String[] args){
        String s1="WESNENWS";
        int ver=0;
        int hor=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='N'){
                ver++;
            }else if(s1.charAt(i)=='S'){
                ver--;
            }else if(s1.charAt(i)=='E'){
                hor++;
            }else {
                hor--;
            }
        }
        double res=Math.pow(hor,2)+Math.pow(ver,2);
        System.out.println(res);
    }
}
