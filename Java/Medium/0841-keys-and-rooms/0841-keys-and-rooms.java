class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] room = new boolean[n];
        room[0]=true;
        dfs(0,room,rooms);
        for(int i=0;i<room.length;i++){  //checking
            if(!room[i]) return false;
        }
        return true;
    }
    void dfs(int i, boolean[] room,List<List<Integer>> rooms){
        List<Integer> keys= rooms.get(i);
        for(int j=0;j<keys.size();j++){
            if(!room[keys.get(j)]){
                room[keys.get(j)]=true;
                dfs(keys.get(j),room,rooms);
            }
        }
    }

}