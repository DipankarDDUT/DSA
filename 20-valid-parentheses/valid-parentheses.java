import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch=s.toCharArray(); 

         for(char c: ch){

                if(c==91||c==123||c==40){
                    st.push(c);
                }
                else if(c==93||c==41||c==125){
                        // closing  then check top of stack matches just now currenct closed bracket
                        if(st.isEmpty()){
                            return false;
                        }
                        char temp=st.pop();
                        if(temp==91){
                            if(c!=93){
                                return false;
                            }
                        }
                         if(temp==40){
                            if(c!=41){
                                return false;
                            }
                        }
                         if(temp==123){
                            if(c!=125){
                                return false;
                            }
                        }
                }else{
                    // any other characters not allowed
                    return false;
                }


         }

         if(!st.isEmpty()){
            return false;
         }

        return true;

        //   // take a case ([)]  while , none   for this below will not work so need to se stack 
    //    char[] ch=s.toCharArray(); 
    //    int brac1=0;//  [91   93]
    //    int brac2=0;//  {123   125}
    //    int brac3=0;//  (40  41)
    //    for(char c: ch){
    //         if(brac1<0 || brac2<0 || brac3<0){
    //             return false;
    //         }
    //         // take a case ([)]  while , none 
    //         switch(c){
    //             case 91:
    //                 brac1++;
    //                 break;
    //             case 93:
    //                 brac1--;
    //                 break;
    //             case 123:
    //                 brac2++;
    //                 break;
    //             case 125:
    //                 brac2--;
    //                 break;
    //             case 40:
    //                 brac3++;
    //                 break;
    //             case 41:
    //                 brac3--;
    //                 break;
    //             default:
    //                 return false;
    //         }
    //    }

    //    // after done if any one positve means something left out return false
    //     if(brac1>0 || brac2>0 || brac3>0){
    //             return false;
    //         }

    //    return true;
    }
}