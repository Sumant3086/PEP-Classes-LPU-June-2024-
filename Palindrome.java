public class Palindrome {
    public static boolean palinCheck(int arr[],int begin,int end){
     if(begin>=end){
         return true;
     }if(arr[begin]==arr[end]) {
         return palinCheck(arr, begin + 1, end - 1);
     }else{
         return false;
     }
 }
     
         public static void main(String[] args){
             int arr[]={696969696};
             boolean res=palinCheck(arr,0,arr.length-1);
             System.out.println(res);
         }
     }
 
 