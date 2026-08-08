class Solution {
    public int evalRPN(String[] tokens) {
        //digiti-> 

        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            // int a= Integer.parseInt(tokens[i]);
            if(tokens[i].length() > 1   || Character.isDigit(tokens[i].charAt(0))){
                stk.push(Integer.parseInt(tokens[i]));
            }else{
                if(!stk.isEmpty()){
                    int  op1 = stk.pop();
                    int  op2 = stk.pop();
                    int r=0;
                    switch(tokens[i]){
                        case "+":
                            r=op2+op1;
                            break;
                        case "-":
                            r=op2-op1;
                            break;
                        case "/":
                            r=op2/op1;
                            break;
                        case "*":
                            r=op2*op1;
                            break;
                        default:
                            return -1;
                    }
                    stk.push(r);
                }
                continue;
            }
            
        }
        return stk.pop();

    }
}