import java.util.*;

public class StockSpanProblem {
    public static void stockSpan(int stocks[],int span[]){
       Stack<Integer> st=new Stack<>();
    // Deque<Integer> st = new ArrayDeque<Integer>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<stocks.length;i++){
            while(!st.empty() && stocks[st.peek()]<=stocks[i])
            st.pop();
            if(st.empty()){
                span[i]=(i+1);
            }else{
                span[i]=i-st.peek();
            } 
            st.push(i);
        }
         
    }
     
    public static void main(String[] args){
        int stocks[] ={100, 80 ,60 ,70 ,60 ,75 ,85};
        int span[]=new int[stocks.length];
        stockSpan(stocks, span);
            for(int i=0;i<span.length;i++){
                System.out.print(span[i]+" ");
        }
    }
}
