class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0){
            return new int[0];
        }

        boolean up=true;
        int row=mat.length;
        int col=mat[0].length;
        int result[]=new int[row*col];

        int i=0;
        int j=0;
        int index=0;
        while(i<row && j<col){
            if(up){
                  while(i>0 && j<col-1){
                    result[index++]=mat[i][j];
                    i--; //row decreased
                    j++;// coloumn increased
                  }  
                  // last element remains as <col
                  result[index++]=mat[i][j];
                  if(j==col-1){
                    i++;
                  }else{
                    j++;
                  }
                  up=false;
            }else{
                //down
                while( i<row-1 && j>0){
                    result[index++]=mat[i][j];
                    i++;
                    j--;
                }
                result[index++]=mat[i][j];
                if(i==row-1){
                    j++;
                }else{
                    i++;
                }
                up=true;
            }
        }

        return result;

    }
}