class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //  1 2 3 4 
        // 5 6 7 8
        // 9 10 11 12 
        // 13 14 15 16

        // with every complete complete cyclic iteration , next iteration 
        // tow topmost and bottom complete added in list 
        // so next iteration both M-2 and N-2
        int M=matrix.length;
        if(M==0){
            return new ArrayList<Integer>();
        }
        List<Integer> result=new ArrayList<>();
        int N=matrix[0].length;
        // when all iteration done , 
        // reduce M and N by 1 and increase row and column by 1 so that top and
        // bottom skip for every next iteration 
        int rowStart=0;
        int columnStart=0;
        int rowEnd=M-1;
        int columnEnd=N-1;
        // bigger than 
        // as 1 2 3 4
        //    5 6 7 8 
        // next iteration point to 6 rowStart 1 column initial 1 
        // but M = 2 and N =
        while(rowStart<=rowEnd && columnStart<=columnEnd){
            for(int col=columnStart;col<=columnEnd;col++){
                result.add(matrix[rowStart][col]);
            }

            rowStart++; // next row pointing 5 6 7 8
            // 1 2 3 4 added to list 

            for(int row=rowStart;row<=rowEnd;row++){
                result.add(matrix[row][columnEnd]);
            }        
            // 1 2 3 4 8 12 16 
            // now last column part done not required anymore remove it 
            columnEnd--; // pointing to 15

            // for unequal row and column decreasing the row and col sze by 1
            if(rowStart<=rowEnd){
              for(int col=columnEnd;col>=columnStart;col--){
                    result.add(matrix[rowEnd][col]);
            } 
            }
       
            // 1 2 3 4 8 12 16 15 14 13 9 5 added 
            rowEnd--; // last row deleted as no longer required 
            // now pointing to 9
            // as previously columnEnd -- already done to remove the last column 

            // trvelse leftmost column if still valid
            // rowStart already +1 so need to worry about duplicate 1  
            if(columnStart<=columnEnd){
                for(int row=rowEnd;row>=rowStart;row--){
                result.add(matrix[row][columnStart]);
            }
            }

            columnStart++; // so that remove the first column not required any more
           
  

        } 

        return result;
    }
}