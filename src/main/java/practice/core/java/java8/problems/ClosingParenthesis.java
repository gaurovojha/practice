package practice.core.java.java8.problems;

import java.util.Stack;

public class ClosingParenthesis {

    public static void main(String[] args) {
        //System.out.println(checkBalancedParentheses("{{{}}}")? "BALANCED" : "NOT BALANCED!!");
        System.out.println(checkBalancedParentheses1("{{({[a(+b]})}}"));
    }


    public static boolean checkBalancedParentheses(String sequence){
        char[] charArr = sequence.toCharArray();
        Stack stack = new Stack();

        for(char c : charArr){
            //1. if { put it inside the array
            //2. if } pull it out from the array

            if(!stack.empty() && c=='}' || c==')'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.empty();
    }


    public static boolean checkBalancedParentheses1(String input){

        char[] charArr = input.toCharArray();
        Stack stack = new Stack();
        char stackEle;
        for(int i = 0 ; i <charArr.length ; i++){
            //if element is not } || ) || ] stack.push(ele)
            if(!(charArr[i]=='}' || charArr[i]==')' || charArr[i]==']')){
                stack.push(charArr[i]);
                continue;
            }

            switch (charArr[i]){
                case '}' :
                    stackEle = keepPoping(stack);
                    if(stackEle==')' || stackEle==']')
                        return false;
                    break;

                case ')' :
                    stackEle = keepPoping(stack);
                    if(stackEle=='}' || stackEle==']')
                        return false;
                    break;

                case ']' :
                    stackEle = keepPoping(stack);
                    if(stackEle=='}' || stackEle==')')
                        return false;
                    break;

                    default:
                        stack.pop();
                        break;
            }
        }
        return stack.empty();
    }


    private static char keepPoping(Stack stack){
        char stackEle = (char)stack.pop();
        while (!(stackEle==')' || stackEle==']' || stackEle=='}' || stackEle=='(' || stackEle=='[' || stackEle=='{')){
            stackEle = (char)stack.pop();
        }
        return stackEle;
    }
}
