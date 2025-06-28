class Solution {

    public int numSquares(int n) {
        
        
        // Lets use BFS here 
        // that's what I know upto Queue and Stack 
        Queue<Integer> qu=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        int steps=0;
        qu.offer(0);
        visited[0]=true;

        while(!qu.isEmpty()){
            int size=qu.size();
            for(int j=0;j<size;j++){
                int cur=qu.poll();
                if(cur==n){
                    return steps;
                }
                for(int i=1;i*i+cur<=n;i++){
                    int curN=(i*i)+cur;
                        if(!visited[curN]){
                        qu.offer(curN);
                        visited[curN]=true;
                        }
                }
            }
                steps++;

        }

        return steps;

    }
}