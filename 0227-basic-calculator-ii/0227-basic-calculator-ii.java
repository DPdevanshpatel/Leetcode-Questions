class Solution {
    public int calculate(String str) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op =new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }
            else if(Character.isDigit(ch)){
                int num=0;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                val.push(num);
                i--;
            }
            else if(op.size()==0){
                op.push(ch);
            }
            else{
                if(ch=='+' || ch=='-'){
                    while (!op.isEmpty()) {

                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (op.peek() == '-') val.push(val1 - val2);
                        else if (op.peek() == '+')val.push(val1 + val2);
                        else if (op.peek() == '*')val.push(val1 * val2);
                        else if (op.peek() == '/')val.push(val1 / val2);

                        op.pop();
                    }
                    op.push(ch);  
                }else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int val2=val.pop();
                        int val1=val.pop();

                        if(op.peek()=='*') val.push(val1*val2);
                        else if(op.peek()=='/') val.push(val1/val2); 
                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }
        while(op.size()>0){
            int val2=val.pop();
            int val1=val.pop();

            if(op.peek()=='-') val.push(val1-val2);
            else if(op.peek()=='+') val.push(val1+val2);
            else if(op.peek()=='*') val.push(val1*val2);
            else if(op.peek()=='/') val.push(val1/val2); 
            op.pop();
        }
        return val.peek();
    }
}