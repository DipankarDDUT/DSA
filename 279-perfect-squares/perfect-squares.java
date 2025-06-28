class Solution {

    public int numSquares(int n) {
        
        
        // Lets use BFS here 
        // that's what I know upto Queue and Stack 
        Queue<Integer> qu=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        int steps=0;
        qu.offer(0);

        while(!qu.isEmpty()){
            int size=qu.size();
            for(int j=0;j<size;j++){
                int cur=qu.peek();
                if(cur==n){
                    return steps;
                }
                for(int i=1;i*i+cur<=n;i++){
                    int curN=(i*i)+cur;
                    if(curN<=n){
                        if(!visited[curN]){
                        qu.offer(curN);
                        visited[curN]=true;
                        }
                        
                    }else{
                        break;
                    }
                }
                qu.poll();
            }
                steps++;

        }

        return steps;

    }
}