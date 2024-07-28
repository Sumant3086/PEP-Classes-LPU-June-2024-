#include <bits/stdc++.h>
using namespace std;
int maxCuts(int n,int a,int b,int c){
    if(n==0) return 0;
    if(n<0) return -1;
    int x=(a<=n)?1+maxCuts(n-a,a,b,c):-1;
    int y=(b<=n)?1+maxCuts(n-b,a,b,c):-1;
    int z=(c<=n)?1+maxCuts(n-c,a,b,c):-1;
    int res=max({x,y,z});
    if(res==-1) return -1;
    return (res==-1)?-1:res;
}
int main(){
    int n=10;  
    int a=3,b=4,c=5;   
    int maxCutsNeeded=maxCuts(n,a,b,c);
    cout<<"Maximum cuts needed: "<<maxCutsNeeded<< endl;

    return 0;
}