class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        int row=matrix.length;
        int col=matrix[0].length;
        int total= row * col;
        int i=0;
        int m=0;
        int n=0;
        int start=0;
        while(i<total){
            while(n<col-start){
                // ----->
                
                result.add(matrix[m][n]);
                System.out.println(matrix[m][n]);
                
                n++;
                i++;
                if(i>=total){
                    return result;
                }
            }
            n--;
            m++;
            while(m<row-start){
                // |
                // |
                // |

                result.add(matrix[m][n]);
                System.out.println(matrix[m][n]);

                i++;
                m++;
                 if(i>=total){
                    return result;
                }
            }
          m--;
          n--;
            while(n>=0+start){
                result.add(matrix[m][n]);
                System.out.println(matrix[m][n]);

                i++;
                n--;
                 if(i>=total){
                    return result;
                }
            }
            n++;
            m--;
// this start will diagonally down aftert every round/loop
            while(m>start){

                // >= equal not use last number already added
                result.add(matrix[m][n]);
                System.out.println(matrix[m][n]);

                m--;
                i++;

                 if(i>=total){
                    return result;
                }
            }
            m++;
            n++;
            start++;

            
        }
        return result;
    }
}