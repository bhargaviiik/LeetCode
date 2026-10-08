class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        DSU dsu = new DSU(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    dsu.merge(i,j);
                }
            }
        }
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int p = dsu.find(i);
            if(!set.contains(p)){
                set.add(p);
                ans++;
            }
        }
        return ans;
    }
}
class DSU{
    int[] par;
    DSU(int n){
        par = new int[n];
        for(int i=0;i<par.length;i++) par[i]=i;
    }
    int find(int x){
        if(par[x]!=x){
            par[x]= find(par[x]); //path compression 
        }
        return par[x];
    }
    void merge(int x, int y){
        int a = find(x);
        int b= find(y);
        if(a!=b){
            par[a]=b;
        }
    }
}