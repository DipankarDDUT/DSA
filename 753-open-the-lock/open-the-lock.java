class Solution {

    public int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> qu=new LinkedList<>();
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if(deadSet.contains("0000")){
            return -1;
        }
        qu.offer("0000");
        visited.add("0000");
        int steps=0;
        while(!qu.isEmpty()){

            int size=qu.size();

            for(int k=0;k<size;k++){
            String cur=qu.poll();

            if(cur.equals(target)){
                return steps;
            }
             char[] temp=cur.toCharArray();
             for(int i=0;i<4;i++){
                // increment 
                char original=temp[i];
                temp[i]=(char)((original-'0'+1)%10+'0');
                String s=String.valueOf(temp);
                if(!visited.contains(s)  && !deadSet.contains(s)){
                    qu.offer(s);
                    visited.add(s);
                } 

                temp[i]=original;

                //decrement
                temp[i]=(char)((original-'0'-1+10)%10+'0');
                String sD=String.valueOf(temp);
                if(!visited.contains(sD) && !deadSet.contains(sD)){
                    qu.offer(sD);
                    visited.add(sD);
                } 
                 temp[i]=original;
            }

        }

            steps++;
        }


        return -1;
    }
}