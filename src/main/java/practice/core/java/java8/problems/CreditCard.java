package practice.core.java.java8.problems;


import java.util.Stack;

class CreditCard {

    public static void main(String[] args) {
        //System.out.println(numberToOrdinal(0));
        System.out.println(evaluate("10000 123 +"));
    }

    public static String numberToOrdinal( Integer number ) {
        if(number==0){
            return String.valueOf(number);
        }
        int mod100 = number % 100;
        int mod10 = number % 10;
        if(mod10 == 1 && mod100 != 11) {
            return number + "st";
        } else if(mod10 == 2 && mod100 != 12) {
            return number + "nd";
        } else if(mod10 == 3 && mod100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }

    public static String maskify(String creditCardNumber) {
        // Add code here
        if(creditCardNumber.length()<6){
            return creditCardNumber;
        }

        String onlyDigits = "\\d+";
        StringBuilder sb = new StringBuilder();
        char[] numArr = creditCardNumber.toCharArray();
        sb.append(numArr[0]);
        for(int i=1;i<numArr.length;i++){
            if(String.valueOf(numArr[i]).matches(onlyDigits) && i<numArr.length-4){
                sb.append("#");
            }else{
                sb.append(numArr[i]);
            }
        }
        return sb.toString();
    }

    public static double evaluate(String expr) {
        // TODO: Your code here

        //empty expression
        if(expr.isEmpty())
            return 0;

        Stack<Double> stack = new Stack<>();
        for (String token : expr.split("\\s+")) {
            System.out.print(token + "\t");
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "^":
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        return stack.pop();
    }
}